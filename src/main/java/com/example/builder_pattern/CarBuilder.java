package com.example.builder_pattern;

import org.springframework.stereotype.Component;

@Component
public class CarBuilder implements ICarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public ICarBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    @Override
    public ICarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public ICarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public ICarBuilder setEngineCapacity(double engineCapacity) {
        car.setEngineCapacity(engineCapacity);
        return this;
    }

    @Override
    public ICarBuilder setNumberOfDoors(int numberOfDoors) {
        car.setNumberOfDoors(numberOfDoors);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}

