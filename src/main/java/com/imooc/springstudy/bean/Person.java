package com.imooc.springstudy.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhangyq
 */
public class Person {
    //使用@Value赋值
    //1.基本数值
    //2.可以写SpEL： #{}
    //3.可以${}: 可以去配置文件中的值（在运行环境变量里面的值）
    @Value("zhansgan")
    private String name;
    @Value("#{88-22}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
