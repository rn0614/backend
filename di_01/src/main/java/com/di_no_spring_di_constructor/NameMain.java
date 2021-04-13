package com.di_no_spring_di_constructor;

public class NameMain {

	public static void main(String[] args) {
		NameService nameService = new NameService();
		// 외부에서 생성자를 통해 객체 주입(injection)
		
		NameController controller = new NameController(nameService);
		controller.show("이몽룡");

	}

}
