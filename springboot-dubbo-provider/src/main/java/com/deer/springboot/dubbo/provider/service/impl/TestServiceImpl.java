package com.deer.springboot.dubbo.provider.service.impl;

import com.deer.springboot.dubbo.provider.remote.service.TestService;

public class TestServiceImpl implements TestService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		 return "Hello " + name + "!1234";
	}


}
