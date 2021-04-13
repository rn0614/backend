package com.di_no_spring_no_di;

public class NameController {
	//Di아님
	//필요한 곳에서 new 연산자를 사용해서 객체를 직접 생성
	
	NameService nameService = new NameService();
	
	public void show(String name) {
		System.out.println("NameController: "+ nameService.showName(name));
	}
	
}
