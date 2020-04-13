package com.lhx.dubbo_spi.impl;

import com.lhx.dubbo_spi.api.CarInteface;

public class RedCar implements CarInteface {
    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public int getSize() {
        return 0;
    }
}
