package com.example.builder_pattern;

public interface ICarBuilder {

    ICarBuilder setBrand(String brand);
    ICarBuilder setModel(String model);
    ICarBuilder setColor(String color);
    ICarBuilder setEngineCapacity(double engineCapacity);
    ICarBuilder setNumberOfDoors(int numberOfDoors);
    Car build();
}
