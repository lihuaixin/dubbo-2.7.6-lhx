package com.lhx.dubbo_spi;

import com.lhx.dubbo_spi.api.CarInteface;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class SpiDemo {
    public static void main(String[] args) {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(CarInteface.class);


    }
}
