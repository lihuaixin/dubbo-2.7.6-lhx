package com.lhx.dubbo_spi.impl;

import com.lhx.dubbo_spi.api.CarInteface;

public class BlackCar implements CarInteface {

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public int getSize() {
        return 0;
    }
}
