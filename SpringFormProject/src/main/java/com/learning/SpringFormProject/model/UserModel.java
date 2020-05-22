package com.learning.SpringFormProject.model;

import org.springframework.stereotype.Component;

@Component
public class UserModel
{
	private int ID;
	private String Name;
	private String EmailID;
	private String Address;
	private String PhoneNO;
	
	
	@Override
	public String toString() {
		return "UserModel [ID=" + ID + ", Name=" + Name + ", EmailID=" + EmailID
				+ ", Address=" + Address + ", PhoneNO=" + PhoneNO + "]";
	}
	
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public UserModel(int iD, String name, String emailID, String address, String phoneNO) {
		super();
		ID = iD;
		Name = name;
		EmailID = emailID;
		Address = address;
		PhoneNO = phoneNO;
	}
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNO() {
		return PhoneNO;
	}
	public void setPhoneNO(String phoneNO) {
		PhoneNO = phoneNO;
	}
	
}