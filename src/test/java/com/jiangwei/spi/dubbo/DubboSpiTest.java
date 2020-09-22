package com.jiangwei.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author: wuma (wuma@helijia.com)
 * @createDate: 2020/9/3
 * @company: (C) Copyright WWW.HELIJIA.COM 2020
 * @since: JDK 1.8
 * @description:
 */
public class DubboSpiTest {

    @Test
    public void sayHello() {
        ExtensionLoader<Animal> extensionLoader = ExtensionLoader.getExtensionLoader(Animal.class);
        Animal dog = extensionLoader.getExtension("dog");
        dog.sayHello();
        Animal pig = extensionLoader.getExtension("pig");
        pig.sayHello();
    }
}
