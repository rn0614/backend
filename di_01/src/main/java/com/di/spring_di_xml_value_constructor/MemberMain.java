package com.di.spring_di_xml_value_constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-context77.xml");
		
		Member member =context.getBean("member", Member.class);
		System.out.println(member);
		member.showBMI();
	}

}
