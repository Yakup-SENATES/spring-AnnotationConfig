package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.Dbhelper;

public class TestSpring {

	
	public static void main(String[] args) {
	
	
	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Dbhelper dbhelper =  context.getBean("dbhelper",Dbhelper.class);
		
		dbhelper.openConnetion();
		
		dbhelper.closeConnection();
		
		dbhelper.updateDatabase();
		
		context.close();
		
		


		
		
			
	}
	
}
