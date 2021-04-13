package com.di.spring_xml_value_setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-context6.xml");
		
		Student std= context.getBean("student", Student.class);
		System.out.println(std);
		context.close();
		
	}

}
