package com.meacial.aop.eg3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 上午 11:29
 */
@Configuration
@EnableAspectJAutoProxy
public class MyConfig {
    @Bean
    public ExpiredAopAdviseDefine expiredAopAdviseDefine() {
        return new ExpiredAopAdviseDefine();
    }
    @Bean
    public Service service() {
        return new MyService();
    }
}
