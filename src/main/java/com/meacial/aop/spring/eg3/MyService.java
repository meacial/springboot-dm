package com.meacial.aop.spring.eg3;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 3:48
 */
public class MyService implements Service {

    @Override
    public void doService(String string) {
        System.out.println("MyService doService Invoked...");
    }
}
