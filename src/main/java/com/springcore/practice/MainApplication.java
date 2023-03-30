package com.springcore.practice;

import com.springcore.practice.entity.rider.FoodPandaRider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		FoodPandaRider foodPandaRider =  context.getBean( FoodPandaRider.class );
		foodPandaRider.deliver();
		foodPandaRider.travel();
		foodPandaRider.cutLane();
		foodPandaRider.accommodateRider();
		foodPandaRider.rollTire();
		foodPandaRider.stopTire();

	}
}
