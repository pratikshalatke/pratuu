package com.model;

public class Staff {
private int id;
private String name;
private String salary;
private String des;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
@Override
public String toString() {
	return "Staff [id=" + id + ", name=" + name + ", salary=" + salary + ", des=" + des + "]";
}



}
