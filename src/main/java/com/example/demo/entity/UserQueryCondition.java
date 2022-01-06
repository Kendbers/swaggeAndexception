package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

public class UserQueryCondition {

    @ApiModelProperty(value = "id")
    private int id;
    @ApiModelProperty(value = "name")
    private String name;
    @ApiModelProperty(value = "age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
