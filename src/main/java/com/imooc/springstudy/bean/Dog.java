package com.imooc.springstudy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhangyq
 */
@Component
public class Dog implements ApplicationContextAware {
    ApplicationContext applicationContext;

    public Dog() {
        System.out.println("dog...construct..");
    }
    //独享对象创建并赋值之后调用
    @PostConstruct
    public void postConstruct(){
        System.out.println("dog...PostConstruct...");
    }

    //容器在销毁对象之前调用
    @PreDestroy
    public void preDestroy(){
        System.out.println("dog ... preDestroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
