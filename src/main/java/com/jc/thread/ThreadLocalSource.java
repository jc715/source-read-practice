package com.jc.thread;

import org.junit.Test;

/**
 * @author JC.
 * @date 2019-02-14.
 */
public class ThreadLocalSource {

    @Test
    public void testThreadLocal() {
        ThreadLocal<Integer> intThreadLocal = new ThreadLocal(){
            @Override
            public Object get() {
                System.out.println("***get***");
                return super.get();
            }

            @Override
            protected Object initialValue() {
                System.out.println("***initialValue***");
                return super.initialValue();
            }
        };
        intThreadLocal.set(1);
        intThreadLocal.remove();
        System.out.println(intThreadLocal.get());
    }
}
