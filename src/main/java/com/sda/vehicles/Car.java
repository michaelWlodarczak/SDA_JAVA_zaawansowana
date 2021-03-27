package com.sda.vehicles;

public class Car extends Vehicle{
    private int passenger;

    public Car (){
        System.out.println("Stworzony Car");
    }
    @Override
    public void run (double velocity){
        System.out.println("Car with " + passenger + " passengers running at " + velocity);
    }
    public void addPassenger(){
        passenger += 1;
        System.out.println("Aktualnie liczba pasazerow to: " + passenger);
    }
    public void removePassenger(){
        passenger -= 1;
        System.out.println("Aktualnie liczba pasazerow to: ");
    }
}