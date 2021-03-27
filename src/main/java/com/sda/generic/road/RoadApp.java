package com.sda.generic.road;

import com.sda.vehicles.Car;
import com.sda.vehicles.Motorcycle;

public class RoadApp {
    public static void main(String[] args) {

        Road<Car> carRoad = new Road<>(new Car());
        carRoad.setItem(new Car());
        carRoad.runThisVehicle(100);

        Road<Motorcycle> motorcycleRoad = new Road<>(new Motorcycle());
        motorcycleRoad.runThisVehicle(125);





    }
}
