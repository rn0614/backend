package com.di.spring_di_xml_value_constructor;

public class BMI {
	public void showBMI(float height,float weight) {
		float bmi = weight /(height*height)*10000;
		String result;
		
		if(bmi>25) result="비만";
		else if(bmi >23) result ="과체중";
		else if(bmi >18.5) result ="과체중";
		else result="저체중";
		
		System.out.println("BMI지수 : " + bmi + "결과 :" + result);
	}
}
