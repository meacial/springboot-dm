package com.meacial.aop.spring.eg1;

import org.springframework.stereotype.Component;

/**
 * Aop目标类
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 3:35
 */
@Component("student") // 通过注解注入bean时，需要
public class Studeng {
    private Integer age;
    private String name;

    public Integer getAge() {
        System.out.println("getAge()..." + age);
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge("+age+")");
        this.age = age;
    }

    public String getName() {
        System.out.println("getName()..." + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("setName("+age+")");
        this.name = name;
    }

    public Exception throwAnException() {
        System.out.println("throw an exception here..");
        throw new IllegalAccessError();
    }

}
