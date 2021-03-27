package com.sda.vehicles;

public class Vehicle {
    int wheels;

    public void run (double velocity ){
        System.out.println("Vehicle running at " + velocity);
    }

    public Vehicle() {
        wheels = 4;
        System.out.println("Stworzony Vehicle z " + wheels + " kolami");
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Stworzony Vehicle z " + wheels + " kolami ");
    }
}
