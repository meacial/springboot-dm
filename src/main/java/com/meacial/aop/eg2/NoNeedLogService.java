package com.meacial.aop.eg2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 上午 11:34
 */
@Service
public class NoNeedLogService extends AbstractService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void someMethod() {
        logger.info("----NoNeedLogService someMethod invoke---");
    }
}
