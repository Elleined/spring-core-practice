package com.springcore.practice.entity.rider;

import com.springcore.practice.entity.bike.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FoodPandaRider extends AbstractRider {

    @Autowired
    public FoodPandaRider(Bike bike) {
        super(bike);
    }

    @Override
    public void travel() {
        System.out.println("FoodPandaRider is traveling...");
    }

    @Override
    public void deliver() {
        System.out.println("FoodPandaRider is delivering...");
    }
}
