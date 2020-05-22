package com.learning.SpringFormProject.testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.learning.SpringFormProject.services.IDAO;
import com.learning.SpringFormProject.services.IDAO_impl;
import com.learning.SpringFormProject.model.UserModel;;




public class TestCase {

	IDAO ido=new IDAO_impl(); 
	
	@Ignore
	@Test
	public void testConncetion()
	{
		boolean isConnected=ido.getConnection();
		assertEquals(true,isConnected);
	}
	
	@Ignore
	@Test
	public void testRecords()
	{	
		List<UserModel> userlist=new ArrayList<UserModel>();
		userlist=ido.getRecords();
		assertEquals(true,userlist.size()>0);
	}
	
	@Ignore
	@Test
	public void testInsertValuse() {
		UserModel model=new UserModel();
		model.setID(02);
		model.setName("Priyam");
		model.setEmailID("Priyam19@gmail.com");
		model.setAddress("andheri(E)");
		model.setPhoneNO("1234");
		boolean recordsInserted=ido.insertingRecords(model);
		assertEquals(true,recordsInserted);
	}
	@Ignore
	@Test
	public void eidtRecord() {
		UserModel model=new UserModel();
		model.setID(2);	
		model.setName("Jisa");
		model.setEmailID("Jisa@gmail.com");
		model.setAddress("vile parle(E)");
		model.setPhoneNO("56789");
		
		int rowAffected=ido.editRecords(1,model);
		assertEquals(1, rowAffected);
	}

	@Ignore
	@Test
	public void textRecordById() {
		UserModel model=ido.getRecordsById(1);
		String userName=model.getName();
		assertEquals("Das",userName);
	}
	@Ignore
	@Test
	public void deleteRecordTest() {
		int rowDelete=ido.deleteRecords(2);
		assertEquals(3,rowDelete);
	}
}
