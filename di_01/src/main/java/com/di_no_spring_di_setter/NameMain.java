package com.di_no_spring_di_setter;

public class NameMain {

	public static void main(String[] args) {
		NameService nameService = new NameService();
		NameController controller = new NameController();
		//외부에서 객체 생성해서 Setter 메소드를 통해서 주입 (injection)
		controller.setNameService(nameService);
		
		controller.show("성춘향");
	}
}
