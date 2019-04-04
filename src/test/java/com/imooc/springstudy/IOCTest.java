package com.imooc.springstudy;

import com.imooc.springstudy.bean.Blue;
import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.config.MainConfig;
import com.imooc.springstudy.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author zhangyq
 */
public class IOCTest{
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


    @Test
    public void testImport(){
        printBeans(applicationContext);
        Object object = applicationContext.getBean(Blue.class);
        //工厂bean获取的是调用getObject创建的对象
        Object object2 = applicationContext.getBean("colorFactoryBean");
        Object object3 = applicationContext.getBean("colorFactoryBean");
        System.out.println("object2 的类型" + object2.getClass());
        System.out.println(object2 == object3);

        Object object4 = applicationContext.getBean("&colorFactoryBean");
        System.out.println("object4 的类型" + object4.getClass());
    }
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanNams = applicationContext.getBeanDefinitionNames();
        for (String name: beanNams) {
            System.out.println(name);
        }
    }


    @Test
    public void test3(){
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //动态获取环境变量的值
        String property = environment.getProperty("os.name");
        System.out.println(">>>>>"+property);
        for (String name : names){
            System.out.println(name);
        }
        Map<String, Person> map = applicationContext.getBeansOfType(Person.class);
        System.out.println(map);
    }

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames){
            System.out.println(name);
        }
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        /*String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames){
            System.out.println(name);
        }*/
        System.out.println("IOC容器创建完成");
        Person person = (Person) applicationContext.getBean("person");
        Object obj = applicationContext.getBean("person");
        System.out.println(obj == person);
    }
}
