package com.meacial.aop.eg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动器
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 上午 10:28
 */
@EnableAutoConfiguration
//@ImportResource(locations = {"classpath:application-bean.xml"})
@ComponentScan(basePackages = {"com.meacial.aop.eg1"})
public class Application_Boot {
    public static void main(String[] args) {
        SpringApplication.run(Application_Boot.class, args);
    }
}
