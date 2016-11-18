package com.meacial.aop.eg1.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * The advice contain the pointcut and the advice.
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 上午 11:21
 */
@Aspect
@Component
public class HttpAopAuthCheckAdvice {

    @Pointcut("@annotation(com.meacial.aop.eg1.annation.AuthChecker)")
    public void pointcut() {
    }


    @Around("pointcut()")
    public Object authCheck(ProceedingJoinPoint joinpoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = getUserToken(request);
        if (!"123456".equals(token)) {
            return "错误，权限不合法";
        }
        return joinpoint.proceed();
    }

    private String getUserToken(HttpServletRequest request) {
        if (null == request) {
            throw new NullPointerException("request is null!");
        }
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("user_token")) {
                return cookie.getValue();
            }
        }
        return "";
    }

}
