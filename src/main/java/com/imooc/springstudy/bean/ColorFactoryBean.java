package com.imooc.springstudy.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangyq
 */
//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean {


    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean ------>");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
    //控制是否单例
    //true：单实例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
