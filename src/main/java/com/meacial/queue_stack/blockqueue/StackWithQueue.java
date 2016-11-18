package com.meacial.queue_stack.blockqueue;

import java.util.Queue;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 上午 10:48
 */
public class StackWithQueue {


    private Queue<Object> queue1 = null;



}


class Node {
    Object data;
    Node pre;
    public Node(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }
    public Node getPre() {
        return pre;
    }
    public void setPre(Node pre) {
        this.pre = pre;
    }
}
