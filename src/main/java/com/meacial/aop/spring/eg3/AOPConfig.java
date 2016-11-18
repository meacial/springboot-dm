package com.meacial.aop.spring.eg3;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 3:44
 */
@Component
@Configuration
@EnableAspectJAutoProxy
// @ImportResource("classpath:application-bean.xml") // some function with @EnableAspectJAutoProxy
public class AOPConfig {
    //public @Bean Advice advice() {

    @Bean public Advice advice() {
        return new MyAdvice();
    }
    @Bean public Pointcut pointcut() {
        return new MyPointcut();
    }


    @Bean
    public Advisor advisor() {
        return new MyAdvisor(pointcut(),advice());
    }

    @Bean
    public Service service() {
        return new MyService();
    }
}
