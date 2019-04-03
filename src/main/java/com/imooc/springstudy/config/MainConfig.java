package com.imooc.springstudy.config;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.dao.BookDao;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author zhangyq
 */
//配置类==配置文件
@Configuration  //告诉spring这是一个配置类

@ComponentScans(value = {
        @ComponentScan(value = "com.imooc.springstudy",includeFilters = {
                //@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class}),
                //@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookDao.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
//@ComponentScan  value：指定要扫描的包
//includeFilters = Filter[]  指定扫描的时候按照某种规则只需要那些组件
// excludeFilters = Filter[]  指定扫描的时候按照某种规则排除那些组件

//FilterType.ANNOTATION          按照注解
//FilterType.ASSIGNABLE_TYPE     按照给定的类型
//FilterType.ASPECTJ             使用ASPECTJ表达式
//FilterType.REGEX               使用正则表达式
//FilterType.CUSTOM              使用自定义规则
public class MainConfig {
    //给容器中注册一个Bean；类型为返回值的类型，bean 的id默认是方法名
    @Bean("person")
    public Person person1(){
        return new Person("lisi",12);
    }
}
