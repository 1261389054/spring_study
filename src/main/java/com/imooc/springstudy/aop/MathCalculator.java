package com.imooc.springstudy.aop;

/**
 * @author zhangyq
 */
public class MathCalculator {
    public int div(int i, int j){
        System.out.println("运行div。。。");
        return i/j;
    }
}
