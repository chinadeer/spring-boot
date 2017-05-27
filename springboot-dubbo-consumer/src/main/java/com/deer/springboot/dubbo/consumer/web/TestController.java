package com.deer.springboot.dubbo.consumer.web;


import com.deer.springboot.dubbo.consumer.domain.User;
import com.deer.springboot.dubbo.provider.remote.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用的 Controller 类；
 * <p/>
 */
@Component
@Controller
@RequestMapping("/user")
public class TestController {

    @Autowired
    TestService testService;


    @RequestMapping(value="/ss", method=RequestMethod.POST)
    public @ResponseBody String postUser(@RequestBody User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
    	  String testStr = testService.sayHello(user.getName());
        return "success==>"+testStr;
    }

}
