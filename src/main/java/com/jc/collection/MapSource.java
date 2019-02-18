package com.jc.collection;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Interval;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author JC.
 * @date 2019-02-08.
 */
public class MapSource {

    @Test
    public void testHashMap() {
        System.out.println((1 << 31) -1);
        /**
         * put

        HashMap putHashMap = new HashMap();
        putHashMap.put("a", "oldValue");
        Object putResult = putHashMap.putIfAbsent("a", "newValue");
        System.out.println(putResult);
         */

        /*
         * computeIfAbsent

        HashMap oHashMap = new HashMap();
        oHashMap.put("a", "a_old");
        oHashMap.computeIfAbsent("a", new Function() {
            @Override
            public Object apply(Object o) {
                System.out.println(o);
                return "a_new";
            }
        });
        System.out.println(oHashMap);
        */

        /**
         * merge

        HashMap mergeHashMap = new HashMap();
        mergeHashMap.put("a", "old_value");

        mergeHashMap.merge("a", "new_value", new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return String.valueOf(o) + "_" + String.valueOf(o2);
            }
        });
        System.out.println(mergeHashMap);
         */
    }

    public void testHashTable() {

    }

    public void testTreeMap() {

    }

    public void testSortedMap() {
    }
}
