package com.example.builder_pattern;

public class Car {
    private String brand;
    private String model;
    private String color;
    private double engineCapacity;
    private int numberOfDoors;

    // Constructors, getters, setters, and other methods

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Color: " + color +
                ", Engine: " + engineCapacity + "L" +
                ", Doors: " + numberOfDoors;
    }

    public void setBrand(String brand2) {
    }

    public void setModel(String model2) {
    }

    public void setColor(String color2) {
    }

    public void setEngineCapacity(double engineCapacity2) {
    }

    public void setNumberOfDoors(int numberOfDoors2) {
    }
}
