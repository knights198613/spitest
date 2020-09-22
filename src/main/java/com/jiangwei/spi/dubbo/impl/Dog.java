package com.jiangwei.spi.dubbo.impl;

import com.jiangwei.spi.dubbo.Animal;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/3
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class Dog implements Animal {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am dog!");
    }
}
