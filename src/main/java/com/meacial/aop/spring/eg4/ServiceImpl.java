package com.meacial.aop.spring.eg4;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 2:42
 */
public class ServiceImpl implements Service {

    @Override
    public void doWork(String string) {
        System.out.println("ServiceImpl doWork invoke");
    }
}
