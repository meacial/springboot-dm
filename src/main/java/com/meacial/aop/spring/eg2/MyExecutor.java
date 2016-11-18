package com.meacial.aop.spring.eg2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 执行器
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:32
 */

public class MyExecutor {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("classpath:spring-aop_aop_spring_eg2.xml");
//
//        MyService service = (MyService) factory.getBean("service");

        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring-aop_aop_spring_eg2.xml");

        Service service = (Service) factory.getBean("service");

        try {
            service.doService("哈哈");
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }

    }
}
