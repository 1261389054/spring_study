package com.imooc.springstudy.condition;

import com.imooc.springstudy.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangyq
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     *  AnnotationMetadata       ：当前类的注解信息
     *  BeanDefinitionRegistry   ：BeanDefinition注册类
     *        把所有需要添加到容器的bean，调用
     *        BeanDefinitionRegistry.registerBeanDefinition 手动注册
     *
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition = registry.containsBeanDefinition("com.imooc.springstudy.bean.Red");
        boolean definition2 = registry.containsBeanDefinition("com.imooc.springstudy.bean.Blue");

        if(definition && definition2){
            //指定Bean定义信息；（bean的类型，bean...）
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个bean，指定bean名
            registry.registerBeanDefinition("rainBow",rootBeanDefinition);
        }
    }
}
