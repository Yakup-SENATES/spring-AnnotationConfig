package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.db.Dbhelper;

public class AnnotationTest {

	
	
	public static void main(String[] args) {
	
	

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Dbhelper dbhelper = context.getBean(Dbhelper.class);
		
		dbhelper.openConnetion();
		dbhelper.closeConnection();
		dbhelper.updateDatabase();
		
		context.close();
	}


}

