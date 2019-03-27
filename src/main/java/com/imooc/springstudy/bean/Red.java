package com.imooc.springstudy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author zhangyq
 */
@Component
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {
    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("IOC 容器：" + applicationContext);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("当前bean的名字：" + s);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String msg = stringValueResolver.resolveStringValue("你好：${os.name},我是#{18*20}");
        System.out.println("解析后的字符串：" + msg);
    }
}