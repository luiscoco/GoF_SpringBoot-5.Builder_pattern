package com.example.builder_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BuilderPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternApplication.class, args);

		ApplicationContext context = SpringApplication.run(BuilderPatternApplication.class, args);
        
        // Using the CarBuilder pattern
        ICarBuilder carBuilder = context.getBean(CarBuilder.class);

        Car car1 = carBuilder.setBrand("Toyota")
                .setModel("Camry")
                .setColor("Red")
                .setEngineCapacity(2.5)
                .setNumberOfDoors(4)
                .build();

        System.out.println("Car 1: " + car1);

        Car car2 = carBuilder.setBrand("Honda")
                .setModel("Civic")
                .setColor("Blue")
                .setEngineCapacity(1.8)
                .setNumberOfDoors(2)
                .build();

        System.out.println("Car 2: " + car2);
	}

}
