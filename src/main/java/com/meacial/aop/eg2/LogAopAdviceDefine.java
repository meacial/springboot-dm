package com.meacial.aop.eg2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 上午 11:35
 */
@Component
@ImportResource("classpath:application-bean.xml")
@Aspect
public class LogAopAdviceDefine {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 定义Pointcut,使用切点表达式函数，来描述对那些Joint ponit使用Advise
     */
    @Pointcut("within(NeedLogService)")
    public void pointcut() {
        // noop
    }
    @Before("pointcut()")
    public void logMethodInvokedParams(JoinPoint joinpoint) {
        logger.info("^^^^^^^^Before method : {} invoke ,params : {}^^^^^^^", joinpoint.getSignature().toShortString(), joinpoint.getArgs());
    }

    @AfterReturning(pointcut = "pointcut()", returning = "retVal")
    public void logMethodInvokedResult(JoinPoint joinoint, Object retVal) {
        logger.info("^^^^^^^^After method : {} invoked,result : {}^^^^^^^^", joinoint.getSignature().toShortString(), retVal);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void logMethodInvokedException(JoinPoint joinPoint, Exception exception) {
        logger.info("^^^^^^^^After method : {} invoked,throw exception : {}^^^^^^", joinPoint.getSignature().toShortString(), exception);
    }
}
