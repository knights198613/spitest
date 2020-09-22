package com.jiangwei.spi.impl;

import com.jiangwei.spi.Roboot;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/1
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class OptimusPrime implements Roboot {

    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
