package com.jiangwei.spi.main;

import com.jiangwei.spi.Roboot;

import java.util.ServiceLoader;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/1
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<Roboot> serviceLoader = ServiceLoader.load(Roboot.class);
        System.out.println("JAVA SPI");
        serviceLoader.forEach(Roboot::sayHello);
    }
}
