package com.meacial.aop.spring.eg4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 免配置文件，实现AOP配置
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 2:40
 */

@Component
@EnableAspectJAutoProxy // 相当于<tt><aop:aspectj-autoproxy/></tt>
@Configuration
public class AopConfig {

    @Bean
    public Service service() {
        return new ServiceImpl();
    }

    @Bean
    public BeforeAdviceDefine beforeAdviceDefine() {
        return new BeforeAdviceDefine();
    }


}
