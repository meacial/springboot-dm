package com.meacial.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The proxy class
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 下午 5:00
 */
final public class SimulatorProxy implements Simulator {

    protected InvocationHandler invocationHandler;

    public SimulatorProxy(InvocationHandler invocationHandler) {
        this.invocationHandler = invocationHandler;
    }

    @Override
    public short simulate(int arg1, long arg2, String arg3) throws Throwable {
        // 第一步是获取 simulate 方法的 Method 对象
        Method method = null;
        method = Simulator.class.getMethod("simulate",new Class[]{Integer.class, Long.class, String.class});
        // 第二步是调用 handler 的 invoke 方法分派转发方法调用
        Object r = null;
        r = invocationHandler.invoke(this, method, new Object[]{arg1, arg2, arg3});
        return (Short) r;
    }
}
