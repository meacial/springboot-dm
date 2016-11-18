package com.meacial.aop.spring.eg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 执行器
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 3:38
 */
public class Main {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop_aop_spring_eg1.xml"); // 通过配置文件，定义bean

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop_aop_spring_eg1_2.xml"); // 通过注解配置bean @Componet

        Studeng studeng = (Studeng) context.getBean("student");

        studeng.setAge(12);

        studeng.setName("meacial");

        studeng.getName();


    }
}
