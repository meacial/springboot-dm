package com.meacial.web.eg3.client;

import com.meacial.web.eg3.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 3:15
 */
public class Client {

    private final static String url = "http://localhost:8080/";

    public static void main(String[] args) {
        new Client().doWork3();
    }


    private void doWork1() {

    }

    private void doWork2() {

    }

    /**
     * 此处使用Future来完成非阻塞，这样的话我们也需要给它一个回调接口来拿结果； Future和Callable是一对，一个消费结果，一个产生结果。
     * 调用完模板后会立即返回，不会阻塞；有结果时会调用其回调。
     * <p>
     * AsyncRestTemplate默认使用SimpleClientHttpRequestFactory，即通过java.net.HttpURLConnection实现；另外我们也可以使用
     * apache的http components；使用template.setAsyncRequestFactory(new HttpComponentsAsyncClientHttpRequestFactory());设置即可。
     */
    private void doWork3() {
        AsyncRestTemplate asyncRestTemplate = new AsyncRestTemplate();
        ListenableFuture<ResponseEntity<User>> future = asyncRestTemplate.getForEntity(url + "async", User.class);
        future.addCallback(new ListenableFutureCallback<ResponseEntity<User>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println("====client cause exception : " + ex);
            }

            @Override
            public void onSuccess(ResponseEntity<User> result) {
                System.out.println("====client get result : " + result.getBody());
            }
        });
        System.out.println("no wait");
    }
}
