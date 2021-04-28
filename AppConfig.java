package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.Dbhelper;

@Configuration
public class AppConfig {

	
	@Bean
	public Dbhelper dbConnectionMethod() {
		
		Dbhelper dbhelper = new Dbhelper();
				
		return dbhelper;
	}
}
