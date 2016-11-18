package com.meacial.utils;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 4:16
 */
final public class StringUtils {

    /**
     * 按空格分割字符串
     * @return
     */
    public static final String[] splitByWhite(String source) {
        return source.split("\\s+");
    }




















    private StringUtils() {
        throw new IllegalAccessError();
    }
}
