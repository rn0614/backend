package com.di.spring_xml_value_setter;

public class Student {
	private String no;
	private String name;
	private String department;
	private int year;
	
	// setter기반은 기본생성자 외에 다른 생성자 생성 불가
	
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
