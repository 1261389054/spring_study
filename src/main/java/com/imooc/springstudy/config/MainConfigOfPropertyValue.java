package com.imooc.springstudy.config;

import com.imooc.springstudy.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhangyq
 */
//使用@PropertySource读取配置文件中的k/v，保存到运行的环境变量中
@PropertySource({"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }
}
