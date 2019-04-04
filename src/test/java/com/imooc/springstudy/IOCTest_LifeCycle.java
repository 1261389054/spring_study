package com.imooc.springstudy;

import com.imooc.springstudy.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangyq
 */
public class IOCTest_LifeCycle {
    //1.创建ioc容器
    //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test1(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("ioc 容器创建完成");
        //applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
        System.out.println("ioc 容器关闭");
    }

}
