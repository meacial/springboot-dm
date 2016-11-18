package com.meacial.aop.eg2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于Spring容器器的测试类
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 上午 11:54
 */
public class AopTest {
    public static void main(String[] args) {


//        ApplicationContext context = new AnnotationConfigApplicationContext("com.meacial.aop.eg2");
//        Service needLogService = (Service) context.getBean("needLogService");
//        Service noNeedLogService = (Service) context.getBean("noNeedLogService");
//        needLogService.logMethod("ligangping");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.meacial.aop.eg2");
        Service needLogService = (Service) context.getBean("needLogService");
        Service noNeedLogService = (Service) context.getBean("noNeedLogService");
        needLogService.logMethod("ligangping");
    }
}
