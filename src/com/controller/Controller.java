package com.controller;

import java.sql.SQLException;

import com.service.Service;

public class Controller {

	void insertStaffRecord() throws ClassNotFoundException, SQLException {
		Service ss = new Service();
		String msg = ss.insertStaffRecord(18, "Sahil", "560000","Developer");
		System.out.println(msg);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Controller cc = new Controller();
		cc.insertStaffRecord();
		
		
	}
}
