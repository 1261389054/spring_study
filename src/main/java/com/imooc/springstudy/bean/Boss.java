package com.imooc.springstudy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//默认加在ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
@Component
public class Boss {

    //@Autowired
    private Car car;
    //构造器要用的组件，都是从容器中获取
    @Autowired
    public Boss(Car car) {
        System.out.println("Boss 的有参构造器");
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    //标注在方法上，Spring容器在创建当前对象时，就会调用该方法，完成赋值
    //方法中的参数，自定义类型的值就在ioc容器中获取
    //@Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" + "car=" + car + '}';
    }
}
