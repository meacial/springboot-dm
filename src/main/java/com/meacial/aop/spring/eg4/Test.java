package com.meacial.aop.spring.eg4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 2:47
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);


        Service service = (Service) context.getBean("service");


        service.doWork("hh");


        // context.registerShutdownHook(); 是一个钩子方法，当jvm关闭退出的时候会调用这个钩子方法，
        // 在设计模式之 模板模式中 通过在抽象类中定义这样的钩子方法由实现类进行实现，这里的实现类是
        // AbstractApplicationContext，这是spring 容器优雅关闭的方法
        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
