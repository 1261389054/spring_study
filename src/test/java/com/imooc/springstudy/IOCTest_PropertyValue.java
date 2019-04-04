package com.imooc.springstudy;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author zhangyq
 */
public class IOCTest_PropertyValue {
    //1.创建ioc容器
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
    @Test
    public void test1(){
        printBeans(applicationContext);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        Environment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("person.nickName"));
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanNams = applicationContext.getBeanDefinitionNames();
        for (String name: beanNams) {
            System.out.println("-------<>"+name);
        }
    }
}
