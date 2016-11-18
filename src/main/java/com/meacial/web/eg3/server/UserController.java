package com.meacial.web.eg3.server;

import com.meacial.web.eg3.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Callable;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 3:08
 */
@RestController
public class UserController {


    @RequestMapping("/test")
    public User view() {
        User user = new User();
        user.setName("meacial");
        user.setId(1);
        return user;
    }

    @RequestMapping("/test2")
    public String view2() {
        return "{\"id\":1}";
    }

    @RequestMapping("/async")
    public Callable<User> async() {
        System.out.println("async entry...");
        return new Callable<User>() {
            @Override
            public User call() throws Exception {
                Thread.sleep(10 * 1000);
                User user = new User();
                user.setId(2);
                user.setName("liganpging");
                return user;
            }
        };
    }



}