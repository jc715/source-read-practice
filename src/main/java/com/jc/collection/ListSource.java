package com.jc.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author JC.
 * @date 2019-02-08.
 */
public class ListSource {

    public void testList() {

    }

    @Test
    public void testArrayList() {
        ArrayList arrList = new ArrayList();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        List subList = arrList.subList(0, 2);
        System.out.println(subList);
    }

    @Test
    public void testLinkedList() {

    }

    @Test
    public void testVector() {

    }

    @Test
    public void testStack() {
        Stack oStack = new Stack();
        oStack.push("1");
        oStack.push("2");
        oStack.push("3");
        oStack.push("4");
        oStack.push("5");

        System.out.println(oStack.pop());


    }
}
