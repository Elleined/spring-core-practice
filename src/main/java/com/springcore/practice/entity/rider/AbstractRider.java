package com.springcore.practice.entity.rider;

import com.springcore.practice.entity.bike.Bike;
import lombok.Data;


@Data
abstract class AbstractRider implements Rider {
    private final Bike bike;
    private String name;
    public AbstractRider(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void rollTire() {
        this.bike.rollTire();
    }

    @Override
    public void stopTire() {
        this.bike.stopTire();
    }

    @Override
    public void accommodateRider() {
        this.bike.accommodateRider();
    }

    @Override
    public void cutLane() {
        this.bike.cutLane();
    }
}
