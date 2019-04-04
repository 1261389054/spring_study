package com.imooc.springstudy;

import com.imooc.springstudy.config.MainConfigOfAutowired;
import com.imooc.springstudy.config.MainConfigOfLifeCycle;
import com.imooc.springstudy.dao.BookDao;
import com.imooc.springstudy.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangyq
 */
public class IOCTest_Autowired {
    //1.创建ioc容器
    //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test1(){
        //1.创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.print();
        BookDao bookDao = (BookDao) applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        applicationContext.close();
    }

}
