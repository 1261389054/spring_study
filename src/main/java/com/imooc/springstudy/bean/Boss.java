package com.imooc.springstudy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

    //@Autowired
    private Car car;

    public Car getCar() {
        return car;
    }

    //标注在方法上，Spring容器在创建当前对象时，就会调用该方法，完成赋值
    //方法中的参数，自定义类型的值就在ioc容器中获取
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
