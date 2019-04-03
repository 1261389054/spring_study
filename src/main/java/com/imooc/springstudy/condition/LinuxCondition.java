package com.imooc.springstudy.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhangyq
 */
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //3.获取当前环境信息
        Environment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        if(property.contains("linux"))
            return true;
        return false;

    }
}
