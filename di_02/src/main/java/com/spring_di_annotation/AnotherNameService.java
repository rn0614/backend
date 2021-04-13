package com.spring_di_annotation;

public class AnotherNameService implements INameService{
	
	@Override
	public String showName(String name) {
		System.out.println("AnotherNameService showName() 메소드");
		String anotherName ="다른 이름은 "+name+"입니다.";
		return anotherName;
	}
}
