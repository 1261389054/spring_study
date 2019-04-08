package com.imooc.springstudy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author zhangyq
 */
//@Aspect ： 告诉spring这是一个切面类
@Aspect
public class LogAspects {
    //抽取公共的切入点表达式
    //1.本类引用
    //2.其他的切面引用
    @Pointcut("execution(public * com.imooc.springstudy.aop.MathCalculator.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("" + joinPoint.getSignature().getName() +"方法运行。。。@Before 参数列表：{"+Arrays.asList(joinPoint.getArgs()) +"}" );
    }
    @After("com.imooc.springstudy.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("" + joinPoint.getSignature().getName() + "方法结束。。。@After");
    }
    //JoinPoint joinPoint 一定要出现在参数表的第一位
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result){
        System.out.println("" + joinPoint.getSignature().getName() + "方法正常返回。。。@AfterReturning 运行结果：{" + result +"}");
    }
    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void logException(JoinPoint joinPoint, Exception e){
        System.out.println("" + joinPoint.getSignature().getName() + "方法异常。。。@AfterThrowing 异常信息：{"+e+"}");
    }
}
