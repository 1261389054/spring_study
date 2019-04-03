package com.imooc.springstudy.Test;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author zhangyq
 */
public class MainTest {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) applicationContext.getBean(Person.class);
        System.out.println(person);
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNames){
            System.out.println(name);
        }
    }
}
