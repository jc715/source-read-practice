package com.jc.concurrent.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * @author JC.
 * @date 2019-03-05.
 */
public class AtomicIntegerSource {

    @Test
    public void testGetAndUpdate() {
        AtomicInteger oAtomicInteger = new AtomicInteger(1);
        int methodResult = oAtomicInteger.getAndUpdate(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return 10;
            }
        });
        System.out.println(String.valueOf(methodResult));
        System.out.println(String.valueOf(oAtomicInteger));
    }

    @Test
    public void testGetAndAccumulate() {
        AtomicInteger oAtomicInteger = new AtomicInteger(1);
        oAtomicInteger.getAndAccumulate(10, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                System.out.println("left = [" + left + "], right = [" + right + "]");
                return 100;
            }
        });
        System.out.println(oAtomicInteger);
    }

}
