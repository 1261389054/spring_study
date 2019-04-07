package com.imooc.springstudy;

import com.imooc.springstudy.bean.Boss;
import com.imooc.springstudy.bean.Car;
import com.imooc.springstudy.bean.Color;
import com.imooc.springstudy.bean.Yellow;
import com.imooc.springstudy.config.MainConfigOfAutowired;
import com.imooc.springstudy.config.MainConfigOfProfile;
import com.imooc.springstudy.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author zhangyq
 */
public class IOCTest_Profile {
    //1.使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2.用代码激活某种环境
    @Test
    public void test1(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //1.创建一个applicationContext
        //2.设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //3.注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4.启动刷新容器
        applicationContext.refresh();

        String[] names = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : names){
            System.out.println(name);
        }
        System.out.println(applicationContext.getBeanNamesForType(Yellow.class));
        applicationContext.close();
    }

}
