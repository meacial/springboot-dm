package com.meacial.aop.eg1.controller;

import com.meacial.aop.eg1.annation.AuthChecker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 上午 11:38
 */
@RestController
//@Component
public class DemoController {
    @RequestMapping("/aop/http/alive")
    public String alive() {
        return "服务正常";
    }

    @AuthChecker
    @RequestMapping("/aop/http/user_info")
    public String callInterface() {
        return "user-info request success!";
    }

    @RequestMapping("/")
    public String home() {
        return "HeloWorld";
    }
}
