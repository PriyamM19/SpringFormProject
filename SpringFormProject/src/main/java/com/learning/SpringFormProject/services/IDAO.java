package com.learning.SpringFormProject.services;

import java.util.List;
import org.springframework.stereotype.Component;

import com.learning.SpringFormProject.model.UserModel;


@Component
public interface IDAO 
{
	boolean getConnection();
	List<UserModel> getRecords();
	
	boolean insertingRecords(UserModel model);
	int editRecords(int i , UserModel model);
	
	UserModel getRecordsbyId(int i);
	
	int deleteRecords(int i );
	UserModel getRecordsById(int i);
	
}
