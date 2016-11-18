package com.meacial.aop.spring.eg3;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Advice：用于定义拦截行为，祖先接口为org.aopalliance.aop.Advice，该接口只是标识接口，
 *  应用中可直接实现BeforeAdvice ，ThrowsAdvice，MethodInterceptor ，AfterReturningAdvice ，IntroductionInterceptor 等子接口
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:23
 */
public class MyAdvice implements MethodBeforeAdvice {
    /**
     * Callback before a given method is invoked.
     *
     * @param method method being invoked
     * @param args   arguments to the method
     * @param target target of the method invocation. May be {@code null}.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("my before advice");
        // method.invoke(target, args); // 如果再次调用这句，目标方法会多执行一次
    }
}
