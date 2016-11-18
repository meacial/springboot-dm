package com.meacial.aop.spring.eg2;

import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:41
 */
@Component("log")
public class LoggerforAspet {
    public void before() {
        System.out.println("before...");
    }

    public void after() {
        System.out.println("after...");
    }

    public void around() {
        System.out.println("around...");
    }

    public void afterReturning(Object retVal) {
        System.out.println("afterRetuining..."+retVal);
    }

    public void afterThrow(Exception ex) {
        System.out.println("afterThrowing..." + ex);
    }
}
