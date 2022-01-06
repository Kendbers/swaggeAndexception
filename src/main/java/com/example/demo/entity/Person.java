package com.example.demo.entity;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1258045451015846461L;

    public String name;

    public int age;

    public String sex;

    public Person(String name,int age,String sex){
       this.name=name;
       this.age=age;
      this.sex=sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
