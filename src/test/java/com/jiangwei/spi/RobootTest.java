package com.jiangwei.spi;

import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/1
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class RobootTest {

    @Test
    public void testRoboot() {
        ServiceLoader<Roboot> serviceLoader = ServiceLoader.load(Roboot.class);
        System.out.println("java SPI");
        serviceLoader.forEach(Roboot::sayHello);
    }


}
