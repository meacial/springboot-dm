package com.meacial.aop.eg2;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 12:00
 */
public class AbstractService implements Service {
    @Override
    public int logMethod(String params) {
        return 0;
    }

    @Override
    public void exceptionMethod() throws Exception {
        // noop
    }

    @Override
    public void someMethod() throws Exception {
        // noop
    }
}
