package com.deer.springboot.session.web;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * webapp 集群的时候口语利用redis把数据保存在共享session里面
 * @author deer
 * @version 1.0.0
 *
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    
    @RequestMapping(value = "/sessions")
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));
        return map;
    }
    
    /**
     * 把数据requestUrl保存在共享session里面
     * @param request
     * @return
     */
    @RequestMapping(value = "/first")
    public Map<String, Object> firstResp (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.getSession().setAttribute("requestUrl", request.getRequestURL());
        map.put("requestUrl", request.getRequestURL());
        return map;
    }
    
    @RequestMapping("login")
    public Object login(HttpServletRequest request) {
        request.getSession().setAttribute("username", "yinjihuan");
        return request.getSession().getAttribute("username");
    }
    
    @RequestMapping("show")
    public Object show(HttpServletRequest request) {
        return request.getSession().getAttribute("username");
    }

}