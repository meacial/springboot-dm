package com.meacial.aop.eg3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 上午 11:33
 */
public class Test {
    public static void main(String[] args) {
        // AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.meacial.aop.eg3"); // 基于包扫描
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);           // 基于配置类
        Service service = context.getBean(Service.class);

        try {
            service.doService();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        context.registerShutdownHook();
    }
}
