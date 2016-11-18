package com.meacial.aop.spring.eg1;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Define an aspect with an annation @Aspect
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 3:25
 */

@Component // 通过注解注入bean时，需要
@Aspect
public class AspectLog {

    @Pointcut("execution(* com.meacial.aop.spring.eg1.*.*(..))")
    private void selectAllMethod() {
        // System.out.println("selectAllMethod");
    }

    @Before("selectAllMethod()") // before adive with pointcut
    private void beforeAdvice() {
        System.out.println("before method invoke");
    }

    @After("selectAllMethod()")
    public void afterAdvice() {
        System.out.println("after method invoked");
    }

    @AfterReturning(pointcut = "selectAllMethod()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("after returned , retval=" + retVal);
    }

    @AfterThrowing(pointcut = "selectAllMethod()", throwing = "ex")
    public void afterThrowingAdive(Exception ex) throws Exception {
        System.out.println("after throw an exception : " + ex);
        throw ex;
    }
}
