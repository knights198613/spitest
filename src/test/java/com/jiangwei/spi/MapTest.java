package com.jiangwei.spi;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/4
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class MapTest {


    @Test
    public void testPut() {
        Map<String, String> map = new HashMap<>();

        String result = map.putIfAbsent("1", "1");

        String result1 = map.putIfAbsent("1", "11");

        String result3 = map.putIfAbsent("1", null);

        map.put(null, "null");

        map.put(null, "null2");
        System.out.println(result);
        System.out.println(result1);
    }
}
