package com.imooc.springstudy;

import com.imooc.springstudy.aop.MathCalculator;
import com.imooc.springstudy.bean.Boss;
import com.imooc.springstudy.bean.Car;
import com.imooc.springstudy.bean.Color;
import com.imooc.springstudy.config.MainConfigOfAOP;
import com.imooc.springstudy.config.MainConfigOfAutowired;
import com.imooc.springstudy.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangyq
 */
public class IOCTest_AOP {
    //1.创建ioc容器
    //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test1(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator mathCalculator = (MathCalculator) applicationContext.getBean("mathCalculator");
        mathCalculator.div(1, 1);
        applicationContext.close();
    }

}
