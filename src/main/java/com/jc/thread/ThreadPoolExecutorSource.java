package com.jc.thread;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author JC.
 * @date 2019-02-14.
 */
public class ThreadPoolExecutorSource {

    @Test
    public void testThreadPool() {
        ThreadPoolExecutor oThreadPoolExecutor = new ThreadPoolExecutor(5, 10, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue(60));

    }
}
