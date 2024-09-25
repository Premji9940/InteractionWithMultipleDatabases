package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication

public class InteractionWithMultipleDataBaseSoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(InteractionWithMultipleDataBaseSoftwareApplication.class, args);
	}

}
