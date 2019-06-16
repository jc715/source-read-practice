package com.jc.thread;

/**
 * @author JC.
 * @date 2019-02-07.
 */
public class RunnableSource implements Runnable{

    public static void main(String[] args) {
        Thread threadA = new Thread(new RunnableSource());
        threadA.start();
        System.out.println("main thread end");
    }

    @Override
    public void run() {
        System.out.println("Run ...");
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
