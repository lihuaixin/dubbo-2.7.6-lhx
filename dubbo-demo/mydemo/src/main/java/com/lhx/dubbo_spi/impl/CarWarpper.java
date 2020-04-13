package com.lhx.dubbo_spi.impl;

import com.lhx.dubbo_spi.api.CarInteface;

public class CarWarpper implements CarInteface {
    private CarInteface carInteface;

    public void setCarInteface(CarInteface carInteface) {
        this.carInteface = carInteface;
    }

    @Override
    public String getColor() {
        System.out.println("warpper");
        return carInteface.getColor();
    }

    @Override
    public int getSize() {
        return 0;
    }
}
