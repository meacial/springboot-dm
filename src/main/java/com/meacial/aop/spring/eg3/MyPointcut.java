package com.meacial.aop.spring.eg3;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 5:26
 */
public class MyPointcut implements Pointcut {
    /**
     * Return the ClassFilter for this pointcut.
     *
     * @return the ClassFilter (never {@code null})
     */
    @Override
    public ClassFilter getClassFilter() {
        return new MyClassFilter();
    }

    /**
     * Return the MethodMatcher for this pointcut.
     *
     * @return the MethodMatcher (never {@code null})
     */
    @Override
    public MethodMatcher getMethodMatcher() {
        return new MyMethodMatcher();
    }
}

class MyClassFilter implements ClassFilter {

    /**
     * Should the pointcut apply to the given interface or target class?
     *
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    @Override
    public boolean matches(Class<?> clazz) {
        if (clazz.getSimpleName().startsWith("My")) {
            return true;
        }
        return false;
    }
}


class MyMethodMatcher implements MethodMatcher {


    /**
     * Perform static checking whether the given method matches. If this
     * returns {@code false} or if the {@link #isRuntime()} method
     * returns {@code false}, no runtime check (i.e. no.
     * {@link #matches(Method, Class, Object[])} call) will be made.
     *
     * @param method      the candidate method
     * @param targetClass the target class (may be {@code null}, in which case
     *                    the candidate class must be taken to be the method's declaring class)
     * @return whether or not this method matches statically
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        if (targetClass.getSimpleName().startsWith("My") && method.getName().contains("Service")) {
            return true;
        }
        return false;
    }

    /**
     * Is this MethodMatcher dynamic, that is, must a final call be made on the
     * {@link #matches(Method, Class, Object[])} method at
     * runtime even if the 2-arg matches method returns {@code true}?
     * <p>Can be invoked when an AOP proxy is created, and need not be invoked
     * again before each method invocation,
     *
     * @return whether or not a runtime match via the 3-arg
     * {@link #matches(Method, Class, Object[])} method
     * is required if static matching passed
     */
    @Override
    public boolean isRuntime() {
        return true;
    }

    /**
     * Check whether there a runtime (dynamic) match for this method,
     * which must have matched statically.
     * <p>This method is invoked only if the 2-arg matches method returns
     * {@code true} for the given method and target class, and if the
     * {@link #isRuntime()} method returns {@code true}. Invoked
     * immediately before potential running of the advice, after any
     * advice earlier in the advice chain has run.
     *
     * @param method      the candidate method
     * @param targetClass the target class (may be {@code null}, in which case
     *                    the candidate class must be taken to be the method's declaring class)
     * @param args        arguments to the method
     * @return whether there's a runtime match
     * @see MethodMatcher#matches(Method, Class)
     */
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object... args) {
        return matches(method, targetClass);
    }
}