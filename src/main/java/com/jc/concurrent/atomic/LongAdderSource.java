package com.jc.concurrent.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author JC.
 * @date 2019-03-05.
 */
public class LongAdderSource {

    @Test
    public void testAdd() {
        LongAdder oLongAdder = new LongAdder();
        oLongAdder.add(1);
        oLongAdder.add(2);
    }
}
