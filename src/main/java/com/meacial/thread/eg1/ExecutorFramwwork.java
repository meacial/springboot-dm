package com.meacial.thread.eg1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK 线程池框架Executor
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/16 0016 下午 6:15
 * @since 1.8
 */
public class ExecutorFramwwork {

    public ExecutorService cachedThreadPoolExecutor() {
        return Executors.newCachedThreadPool(); // 阻塞队列SynchronousQueue
    }

    public ExecutorService fixedThreadPool(int poolSize) {
        return Executors.newFixedThreadPool(poolSize); // 阻塞队列LinkedBlockingQueue
    }

    public ExecutorService singleThreadPool() {
        return Executors.newSingleThreadExecutor(); // 阻塞队列LinkedBlockingQueue
    }



}
