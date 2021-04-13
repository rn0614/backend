package com.di.spring_xml_value_constructor;

public class Student {
	private String no;
	private String name;
	private String department;
	private int year;
	
	public Student(String no, String name, String department, int year) {
		this.no = no;
		this.name = name;
		this.department = department;
		this.year = year;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", department=" + department + ", year=" + year + "]";
	}
	
	
	
}
