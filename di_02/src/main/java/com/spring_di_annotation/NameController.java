package com.spring_di_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NameController {
	//@Autowired
	//@Qualifier("anotherNameService")
	@Resource(name="anotherNameService")
	INameService nameService;

	//생성자 없고
	// Setter void setNameService(Name) 
	
	public void setNameService(NameService nameService) {
		this.nameService = nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController : "+nameService.showName(name));
	}
}
