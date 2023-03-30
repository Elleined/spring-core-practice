package com.springcore.practice.entity.rider;

import com.springcore.practice.entity.bike.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GrabFoodRider extends AbstractRider {

    @Autowired
    public GrabFoodRider(Bike bike) {
        super(bike);
    }

    @Override
    public void travel() {
        System.out.println("GrabFoodRider is traveling...");
    }

    @Override
    public void deliver() {
        System.out.println("GrabFoodRider is delivering...");
    }
}
