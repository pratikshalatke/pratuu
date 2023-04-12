package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Staff;


public class Dao1 {

	private String sql;
	public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException {
		System.out.println("Step 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Step 3");
		Statement stmt = con.createStatement();
		String sql = "select * from staff";
		
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("Step 4");
		ArrayList<Staff> al = new ArrayList<>();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int salary = rs.getInt(3);
			String des = rs.getString(4);
			
			Staff s = new Staff();
			al.add(s);
			
			
			System.out.println(id+" "+name+" "+salary+" "+des);
		}
		return al;
		
		
	}
	public String insertStaffRecord(int id, String name, String salary, String des) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stmt = con.createStatement();
		
	String sql = "update Staff set salary='20000' Where name='Prashant'";
		int isUpdate = stmt.executeUpdate(sql);
		return sql;
		
		
		
	}
}
