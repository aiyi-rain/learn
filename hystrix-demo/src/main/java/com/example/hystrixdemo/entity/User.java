package com.example.hystrixdemo.entity;

/**
 * @Author:王艺
 * @Project:learn
 * @File:User
 * @Date:2023/7/10 13:54
 */
public class User {
    private Long id;
    private String name;

    public User() {
    }

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
