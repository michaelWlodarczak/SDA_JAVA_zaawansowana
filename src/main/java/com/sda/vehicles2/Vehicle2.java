package com.sda.vehicles2;

public class Vehicle2 {
    int velocity = 0;

    public Vehicle2(int velocity) {
        this.velocity = velocity;
    }

    public Vehicle2() {
    }

    public void run(double velocity) {
        System.out.println("Vehicle running at speed " + velocity);
    }

}
