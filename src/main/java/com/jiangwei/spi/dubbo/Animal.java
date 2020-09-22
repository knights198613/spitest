package com.jiangwei.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/3
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
@SPI
public interface Animal {

    void sayHello();
}
