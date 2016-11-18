package com.meacial.aop.eg2;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 上午 11:59
 */
public interface Service {
    public int logMethod(String params);

    public void exceptionMethod() throws Exception;

    public void someMethod() throws Exception;
}
