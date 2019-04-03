package com.imooc.springstudy.config;

import com.imooc.springstudy.bean.Person;
import com.imooc.springstudy.condition.LinuxCondition;
import com.imooc.springstudy.condition.WindowsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @author zhangyq
 */
@Configuration
public class MainConfig2 {

    //默认单实例
    /*
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE        prototype
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON        singleton
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST     request
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION     session
	 *
	 * singleton：单实例（默认）：IOC容器启动会调用方法创建对象放到IOC容器中
	 *                         以后每次获取直接在容器中拿
	 * prototype：多实例      IOC容器启动并不会去调用方法创建对象放在容器中。
	 *                        每次获取的时候才会调用方法创建对象
	 * request: 同一次请求创建一个
	 * session：同一次session创建一个
	 *
	 * 懒加载：
	 *       单实例bean：默认在容器启动时创建对象
	 *       懒加载：容器启动时不创建，第一次使用bean时创建对象
	 * */
    //@Scope("prototype")
    @Lazy
    @Bean
    public Person person(){
        System.out.println("---->给容器中添加Person。。。" );
        return new Person("xiaoji",88);
    }

    /**
     * @Conditional{Condition}: 按照一定的条件进行判断，满足条件给容器注册bean
     *
     * 如果系统是windows，给容器中注册bill
     * 是linux，注册linux
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person1(){
        return new Person("Bill", 62);
    }
    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person person2(){
        return new Person("linux", 48);
    }

    /**
     * 给容器中注册组件：
     * 1）.包扫描+组件标注注解（@Controller，@Service，@Component）
     *      局限于自己写的类
     * 2）.@Bean[导入第三方包里面的组件]
     * 3）.@Import[快速给容器中导入一个组件]
     */
}
