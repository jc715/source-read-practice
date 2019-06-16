package com.jc.string;

import org.junit.Test;

import java.util.Stack;

/**
 * @author JC.
 * @date 2019-02-13.
 */
public class StringSource {

    @Test
    public void testCodePointAt() {
        String str = "123";
        System.out.println(str.codePointAt(1));
    }

    @Test
    public void testReplace() {
        String strA = "abc";
        strA.replace("a", "x");
    }

    @Test
    public void testJoin() {
        System.out.println(String.join("-", "a", "b", "c"));
    }

    @Test
    public void testTrim() {
        System.out.println(' ' <= ' ');
    }
}
