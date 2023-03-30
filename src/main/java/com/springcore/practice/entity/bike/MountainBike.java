package com.springcore.practice.entity.bike;

import com.springcore.practice.entity.gear.Gear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MountainBike extends AbstractBike {

    @Autowired
    public MountainBike(Gear gear) {
        super(gear);
    }

    @Override
    public void accommodateRider() {
        System.out.println("MountainBike is accommodating rider...");
    }

    @Override
    public void cutLane() {
        System.out.println("MountainBike is cutting lane...");
    }
}
