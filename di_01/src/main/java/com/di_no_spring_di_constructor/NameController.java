package com.di_no_spring_di_constructor;

public class NameController {
	NameService nameService;
	
	//생성자
	public NameController(NameService nameService) {
		this.nameService =nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController: "+ nameService.showName(name));
	}
}
