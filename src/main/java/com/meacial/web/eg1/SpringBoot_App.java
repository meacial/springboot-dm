package com.meacial.web.eg1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Starting the boot service.
 *
 * We can access with url "localhost:8080/say/ligangping.json" as default.
 *
 * We also can access with url "localhost:8080/say/ligangping.xml" and annonation the {@code Message} with <tt>@XmlRootElement</tt>,then xml style response as default.
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 1:55
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.meacial.web.eg1")
//@Configuration

@SpringBootApplication
public class SpringBoot_App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBoot_App.class, args);

        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String beanName : beans) {
            System.out.println(beanName);
        }

    }
}
