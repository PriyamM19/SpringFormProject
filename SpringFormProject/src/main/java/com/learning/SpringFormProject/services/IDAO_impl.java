package com.learning.SpringFormProject.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.SpringFormProject.model.UserModel;

@Component
public class IDAO_impl implements IDAO {
	String url = "jdbc:h2:tcp://localhost/~/test";
	String user = "sa";
	String pwd = "";
	Connection conn;
	UserModel model;
	PreparedStatement stmt;

	@Override
	public boolean getConnection() {
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if (conn != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserModel> getRecords() {
		List<UserModel> userlist = new ArrayList();
		// System.out.println("inside records");

		if (getConnection()) {
			try {
				Statement statement = conn.createStatement();
				String query = "select * from springforminfo ";
				ResultSet resultset = statement.executeQuery(query);
				while (resultset.next()) {
					model = new UserModel();
					model.setID(resultset.getInt("ID"));
					model.setName(resultset.getString("Name"));
					model.setEmailID(resultset.getString("EmailID"));
					model.setAddress(resultset.getString("Address"));
					model.setPhoneNO(resultset.getString("PhoneNO"));

					userlist.add(model);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}
		return userlist;
	}

	@Override
	public boolean insertingRecords(UserModel model) {
		int rowInserted = 0;
		if (getConnection()) {
			System.out.println("Connection is SuccessFully");
			String query = "insert into springforminfo  values (?,?,?,?,?)";
			try {
				PreparedStatement preparestmt = conn.prepareStatement(query);
				preparestmt.setInt(1, model.getID());
				preparestmt.setString(2, model.getName());
				preparestmt.setString(3, model.getEmailID());
				preparestmt.setString(4, model.getAddress());
				preparestmt.setString(5, model.getPhoneNO());

				rowInserted = preparestmt.executeUpdate();

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		if (rowInserted > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int editRecords(int i, UserModel model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserModel getRecordsbyId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteRecords(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserModel getRecordsById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}