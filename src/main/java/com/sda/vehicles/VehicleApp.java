package com.sda.vehicles;

public class VehicleApp {
    public static void main(String[] args) {
       /* Vehicle vehicle = new Vehicle();
        Motorcycle motorcycle = new Motorcycle();
        vehicle.run(100);
       Car car = new Car();

        car.addPassenger();
        car.addPassenger();
        car.removePassenger();

        car.run(120); */

        /* Vehicle vehicle = new Vehicle(4);
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        vehicle.run(120);

        vehicle = new Car();
        vehicle.run(100);

        vehicle = new Motorcycle();
        vehicle.run(150); */

        Vehicle vehicle = new Vehicle(4);
        runThisVehicle(vehicle);
        Car car = new Car();
        runThisVehicle(car);
        Motorcycle motorcycle = new Motorcycle();
        runThisVehicle(motorcycle);
    }
    private static void runThisVehicle(Vehicle vehicle){
        vehicle.run(100);
    }
}
