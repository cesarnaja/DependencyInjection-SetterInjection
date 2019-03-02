package com.cesarscode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext myContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher teacher = myContext.getBean("myScienceTeacher", ScienceTeacher.class);
		
		System.out.println(teacher.getExercise());
		System.out.println(teacher.getTip());
		
		
		
		myContext.close();
	}
	

}
 