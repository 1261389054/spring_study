package com.imooc.springstudy.config;

import com.imooc.springstudy.bean.ColoeFactoryBean;
import com.imooc.springstudy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author zhangyq
 */
@Configuration
@ComponentScan(value = "com.imooc.springstudy")
public class MainConfig {

    @Bean
    public ColoeFactoryBean coloeFactoryBean(){
        return new ColoeFactoryBean();
    }

    @Bean("person")
    public Person getPerson(){

        return new Person("ls","20");
    }

    @Bean("bill")
    public Person bill(){

        return new Person("bill gates","66");
    }

    @Bean("linux")
    public Person linux(){

        return new Person("linux","48");
    }
}
