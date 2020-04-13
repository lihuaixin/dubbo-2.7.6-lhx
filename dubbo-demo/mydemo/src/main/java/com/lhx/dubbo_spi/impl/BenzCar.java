package com.lhx.dubbo_spi.impl;

import com.lhx.dubbo_spi.api.CarInteface;

public class BenzCar implements CarInteface {

    @Override
    public String getColor() {
        return "benz";
    }

    @Override
    public int getSize() {
        return 0;
    }
}
