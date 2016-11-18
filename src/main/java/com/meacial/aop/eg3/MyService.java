package com.meacial.aop.eg3;

import java.util.Random;

/**
 *
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 上午 11:30
 */
//@Component
public class MyService implements Service {
    @Override
    public void doService() throws InterruptedException {
        System.out.println("MyService doService() invoking...");
        Thread.sleep(new Random().nextInt(500));
        System.out.println("MyService doService() invoked....");
    }
}
