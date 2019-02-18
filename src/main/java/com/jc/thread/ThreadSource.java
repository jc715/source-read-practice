package com.jc.thread;

import org.junit.Rule;
import org.junit.Test;

/**
 * @author JC.
 * @date 2019-02-09.
 */
public class ThreadSource {

    @Test
    public void testThread() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);

        System.out.println(4 & 4);
    }

    public void testJoin() throws InterruptedException {
        Thread oThread = new Thread();
        oThread.join();
    }

    @Test
    public void testInterrupt() throws InterruptedException {
        Thread oThread = new Thread(){
            @Override
            public void run() {
                while (!this.isInterrupted()) {
                    try {
                        System.out.println("running");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        oThread.start();
        Thread.sleep(5000);
        oThread.interrupt();
    }
}
