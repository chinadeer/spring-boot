package com.deer.springboot.dubbo.consumer.domain;


import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4867544200514135511L;
	private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
