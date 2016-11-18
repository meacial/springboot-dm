package com.meacial.aop.spring.eg4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 2:44
 */
@Aspect
public class BeforeAdviceDefine {

    @Pointcut("execution(* com.meacial.aop.spring.eg4.Service.*(..))")
    public void pointcut() {
        // noop
    }
    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("before " + joinPoint.getSignature().toShortString() + "invoke");
    }
}
