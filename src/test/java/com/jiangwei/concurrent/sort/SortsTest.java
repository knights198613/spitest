package com.jiangwei.concurrent.sort;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/22
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class SortsTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {3, 11, 20, 2, 17, 22, 9, 19, 49, 8, 50};

        //arr = bubbleSort(arr);

        arr = selectionSort(arr);

        System.out.println(JSON.toJSONString(arr));
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    private int[] bubbleSort(int[] arr) {
        if(arr.length == 0)
            return arr;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j+1] < arr[j]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }


    /**
     * 选择排序
     * @param arr
     * @return
     */
    private int[] selectionSort(int[] arr) {
        if(arr.length == 0)
            return arr;
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
}
