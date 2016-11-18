package com.meacial.aop.eg3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

/**
 * 统计方法调用耗时ADVICE
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 上午 11:23
 */
@Aspect
//@Component
//@EnableAspectJAutoProxy
public class ExpiredAopAdviseDefine {


    /**
     * pointcut 表达式：
     *      within  ----   可配置具体的类，不能定义接口
     *      execution --   可定义接口，可定义具体类
     */

    // @Pointcut("within(MyService)")  // 这里一定要对应具体的类，不能对应接口，应为方法执行时，一定是具体类的方法被调用执行
    // @Pointcut("execution(* com.meacial.aop.eg3.MyService.*(..))")  // 这里一定要对应具体的类，不能对应接口，应为方法执行时，一定是具体类的方法被调用执行
    @Pointcut("execution(* com.meacial.aop.eg3.Service.*(..))")  // 这里一定要对应具体的类，不能对应接口，应为方法执行时，一定是具体类的方法被调用执行
    public void pointcut() {
        // noop
    }

    @Around("pointcut()")
    public void arountAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        joinPoint.proceed();
        stopWatch.stop();
        System.out.println(joinPoint.getSignature().toShortString() + " , " + stopWatch.getTotalTimeSeconds());
    }
}
