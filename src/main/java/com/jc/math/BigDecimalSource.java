package com.jc.math;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author JC.
 * @date 2019-02-11.
 */
public class BigDecimalSource {

    @Test
    public void testBigDecimal() {
        BigDecimal aBigDecimal = new BigDecimal(0.1);
        BigDecimal bBigDecimal = new BigDecimal(0.2);
        System.out.println(aBigDecimal.add(bBigDecimal));
    }
}
