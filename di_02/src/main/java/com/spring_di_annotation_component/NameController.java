package com.spring_di_annotation_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameController {
	@Autowired
	//@Qualifier("anotherNameService")
	//@Resource(name="anotherNameService")
	INameService nameService;


	public void show(String name) {
		System.out.println("NameController : "+nameService.showName(name));
	}
}
