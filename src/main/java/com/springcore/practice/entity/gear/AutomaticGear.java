package com.springcore.practice.entity.gear;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AutomaticGear implements Gear {
    @Override
    public void rollTire() {
        System.out.println("AutomaticGear is rolling tire...");
    }

    @Override
    public void stopTire() {
        System.out.println("AutomaticGear is stopping tire...");
    }
}
