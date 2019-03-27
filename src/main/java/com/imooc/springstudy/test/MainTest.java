package com.imooc.springstudy.test;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author zhangyq
 */
public class MainTest {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //Person person = (Person) applicationContext.getBean("person");
        /*Person person = (Person) applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String str : names){
            System.out.println(str);
        }*/
        /*Environment environment = applicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println(osName);

        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNames){
            System.out.println(name);
        }

        Map<String, Person> map =  applicationContext.getBeansOfType(Person.class);
        System.out.println(map);*/

        //Object o = applicationContext.getBean("cat");
        Object o = applicationContext.getBean("dog");
        System.out.println(o);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }



}
