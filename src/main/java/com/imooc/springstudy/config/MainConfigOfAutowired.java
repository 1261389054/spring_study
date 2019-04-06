package com.imooc.springstudy.config;

import com.imooc.springstudy.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 自动装配：
 *    Spring利用依赖注入(DI)，完成对IOC容器中各个组件的依赖关系赋值
 *
 *  1). @Autowired: 自动注入
 *      1).默认优先按照类型去容器中找对应的组件：applicationContext.getBean(BookDao.class);找到就赋值
 *      2).如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *      3).@Qualifier("bookDao")：使用@Qualifier指定需要装配的组件的id，而不是属性名
 *      4).自动装配默认一定要将属性装配好，没有就报错
 *      5).@Primary: 让Spring进行自动装配的时候，默认使用首选的bean
 *           也可以继续使用@Qualifier 指定需要装配的bean
 *      BookService{
 *          @Autowired
 *          BookDao bookDao；
 *      }
 *  2).Spring 还指出使用@Resource(JSR250)和@Inject(JSR330) [java规范的注解]
 *    @Resource:
 *            可以和@Autowired一样实现自动装配功能；默认是按照组件名称进行装配的
 *            没有支持@Primary功能，没有支持@Autowired(required=false)
 *    @Inject:
 *           需要导入javax.inject的包，和Autowired的功能一样，没有required=false;
 * @Autowired:Spring定义的；@Resource，@Inject都是java规范
 *
 *  AutowiredAnnotationBeanPostProcessor  解析完成自动装配功能
 *
 *  3). @Autowired: 构造器，参数，方法，属性
 *
 *
 * @author zhangyq
 */
@Configuration
@ComponentScan({"com.imooc.springstudy.controller","com.imooc.springstudy.service",
        "com.imooc.springstudy.dao","com.imooc.springstudy.bean"})
public class MainConfigOfAutowired {
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }
}
