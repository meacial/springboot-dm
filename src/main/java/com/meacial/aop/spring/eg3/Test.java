package com.meacial.aop.spring.eg3;

import org.springframework.aop.framework.Advised;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 3:47
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);

        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop_aop_spring_eg3.xml");

        Service service = (Service) context.getBean("service");

        service.doService("hh");

        Advised advised = (Advised) service;




    }
}
