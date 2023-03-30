package com.springcore.practice.entity.bike;

import com.springcore.practice.entity.gear.Gear;


public abstract class AbstractBike implements Bike {
    private final Gear gear;


    public AbstractBike(Gear gear) {
        this.gear = gear;
    }

    @Override
    public void rollTire() {
        this.gear.rollTire();
    }

    @Override
    public void stopTire() {
        this.gear.stopTire();
    }
}
