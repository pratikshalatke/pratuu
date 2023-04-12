package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Dao1;
import com.model.Staff;

public class Service1 {

	public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException {
		Dao1 d = new Dao1();
		ArrayList<Staff> al = d.m1();
		
		System.out.println("In Service :"+al);
		return al;
	}
	public String insertStaffRecord(int id, String name, String salary, String des) throws ClassNotFoundException, SQLException {
		Dao1 dd = new Dao1();
		String mssg = dd.insertStaffRecord(id, name, salary, des);
		return mssg;
	}
	
}
