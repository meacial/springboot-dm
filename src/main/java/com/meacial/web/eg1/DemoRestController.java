package com.meacial.web.eg1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 1:54
 */
@RestController
public class DemoRestController {
    @RequestMapping("say/{name}")
    public Message say(@PathVariable String name) {
        Message message = new Message();
        message.setName(name);
        message.setText("Hello , " + name);
        return message;
    }

}
