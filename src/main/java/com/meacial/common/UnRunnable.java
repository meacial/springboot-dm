package com.meacial.common;

import java.lang.annotation.*;

/**
 * type with this annonation is't runnable.
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 2:51
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PACKAGE)
@Deprecated
public @interface UnRunnable {
}
