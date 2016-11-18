package com.meacial.web.eg1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 1:51
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@Documented
@Controller
@ResponseBody
public @interface RestController {
}
