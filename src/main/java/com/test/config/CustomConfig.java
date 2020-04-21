package com.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.test.util.CustomYmlPropertySourceFactory;

@Configuration
@PropertySource(value ="${secrets.file-path}" , factory = CustomYmlPropertySourceFactory.class)
public class CustomConfig {

	@Value("${datasource.db-name}")
	private String dbName;
	

	public String getDbName() {
		return dbName;
	}
	
	
}
