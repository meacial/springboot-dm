package com.meacial.aop.eg2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 需要记录日志的服务
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/17 0017 上午 11:29
 */
@Service
public class NeedLogService extends AbstractService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private Random random = new Random(System.currentTimeMillis());

    public int logMethod(String params) {
        logger.info("---NeedLogService logMethod invoke , param : {}------", params);
        return random.nextInt();
    }

    public void exceptionMethod() throws Exception {
        logger.error("---NeedLogServcie exceptionMethod invoke------");
        throw new Exception();
    }
}
