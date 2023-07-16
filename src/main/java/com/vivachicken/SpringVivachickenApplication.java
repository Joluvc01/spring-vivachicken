package com.vivachicken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringVivachickenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVivachickenApplication.class, args);
	}

}
