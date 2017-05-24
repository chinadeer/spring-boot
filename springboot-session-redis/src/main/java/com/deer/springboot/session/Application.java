package com.deer.springboot.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


/**
 *@author deer
 *@version 1.0.0
 *spring boot + redis实现session共享
 *
 */
@SpringBootApplication
@Import({RedisSessionConfig.class})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		
	}

}
