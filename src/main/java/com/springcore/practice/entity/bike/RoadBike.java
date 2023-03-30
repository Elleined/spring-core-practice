package com.springcore.practice.entity.bike;

import com.springcore.practice.entity.gear.Gear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RoadBike extends AbstractBike {

    @Autowired
    public RoadBike(Gear gear) {
        super(gear);
    }

    @Override
    public void accommodateRider() {
        System.out.println("RoadBike is accommodating rider...");
    }

    @Override
    public void cutLane() {
        System.out.println("RoadBike is cutting lane...");
    }
}
