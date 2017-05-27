package com.deer.springboot.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author deer
 *
 */
@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"}) // 使用 providers.xml 配置；
@ComponentScan(value = {"com.deer.springboot.dubbo.provider"})
public class ProviderApplication {
	 public static void main(String[] args) {
	        SpringApplication.run(ProviderApplication.class, args);
	    }
}
