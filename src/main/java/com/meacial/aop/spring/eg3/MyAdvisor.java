package com.meacial.aop.spring.eg3;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Pointcut：用于定义拦截目标集合，祖先接口为org.springframework.aop.Pointcut
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:24
 */
public class MyAdvisor extends DefaultPointcutAdvisor{

    public MyAdvisor(Pointcut pointcut, Advice advice) {
        super(pointcut, advice);
    }
}
