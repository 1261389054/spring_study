package com.imooc.springstudy.test;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangyq
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
    /*public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames){
            System.out.println(name);
        }
    }*/

    //@Test
    public void test01(){
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNames){
            System.out.println(name);
        }
    }
}
