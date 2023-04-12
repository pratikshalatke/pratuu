package com.service;

import java.sql.SQLException;

import com.dao.Dao;

public class Service {
public String insertStaffRecord(int id, String name, String salary, String des) throws ClassNotFoundException, SQLException {
	Dao dd = new Dao();
	String mssg = dd.insertStaffRecord(id, name, salary, des);
	return mssg;


}

}
