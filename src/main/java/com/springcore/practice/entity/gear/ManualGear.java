package com.springcore.practice.entity.gear;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ManualGear implements Gear {

    @Override
    public void rollTire() {
        System.out.println("ManualGear is rolling tire...");
    }

    @Override
    public void stopTire() {
        System.out.println("ManualGear is stopping tire...");
    }
}

