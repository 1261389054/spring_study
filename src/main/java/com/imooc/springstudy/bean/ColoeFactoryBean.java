package com.imooc.springstudy.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangyq
 */
public class ColoeFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColoeFactoryBean ... getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
}
