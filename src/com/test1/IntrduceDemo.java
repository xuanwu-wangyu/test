package com.test1;

public class IntrduceDemo {
    //姓名
    private String name;
    //年龄
    private int age;

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

    public void init(){
        System.out.println("初始化bean");
    }
    public void end(){
        System.out.println("结束bean");
    }
}
