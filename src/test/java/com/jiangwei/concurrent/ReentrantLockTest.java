package com.jiangwei.concurrent;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/17
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class ReentrantLockTest {

    ReentrantLock lock = new ReentrantLock();


    @Test
    public void testReentrantLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                print("t1");
                lock.unlock();
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                print("t2");
                lock.unlock();
            }
        }, "t2");

        t1.start();
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void print(String arg) {
        System.out.println("I am " + arg+" thread execution!");
    }
}
