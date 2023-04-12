package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Staff;
import com.service.Service1;

public class Controller1 {

	void m1() throws ClassNotFoundException, SQLException {
		Service1 s = new Service1();
		ArrayList<Staff> al = s.m1();
		System.out.println(al);
	}
	void insertStaffRecord() throws ClassNotFoundException, SQLException {
		Service1 ss = new Service1();
		String msg = ss.insertStaffRecord(11, "Shann", "35000", "Dev");
		System.out.println(msg);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Controller1 cc = new Controller1();
		cc.insertStaffRecord();
	}
	
	
	
}
