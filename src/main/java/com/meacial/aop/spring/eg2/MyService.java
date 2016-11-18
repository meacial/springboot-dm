package com.meacial.aop.spring.eg2;

import org.springframework.stereotype.Component;

/**
 * AOP目标类
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:30
 */
// @Service("service")
@Component("service")
public class MyService implements Service {
    public void doService(String msg) {
        System.out.println("doService(string)..."+msg);
    }
}
