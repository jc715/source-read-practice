package com.jc.thread;

import java.util.concurrent.Callable;

/**
 * @author JC.
 * @date 2019-02-07.
 */
public class CallableSource implements Callable{

    @Override
    public Object call() throws Exception {
        Thread.sleep(1000000L);
        return "";
    }

    public static void main(String[] args) throws Exception {
        CallableSource oCallableSource = new CallableSource();
        System.out.println("****");
    }
}
