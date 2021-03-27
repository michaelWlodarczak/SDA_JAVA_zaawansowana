package com.sda.vehicles2;

public class Car2 extends Vehicle2 {
    int passengers;

    public Car2 () {
        super();
        System.out.println("Stworzono nowy samochod");
    }
    @Override
    public String toString() {
        return "Car2{" +
                "passengers=" + passengers +
                '}';
    }
    @Override
    public void run(double velocity) {
        super.run(velocity);
        System.out.println("Car with " + passengers + " passengers run at " + velocity);
    }
    public void addPassengers() {
        if (passengers >= 4) {
            System.out.println("Nie moze byc wiecej niz czterech pasazerow");
        } else {
            passengers += 1;
            System.out.println("Aktualna liczba pasazerow to " + passengers);
        }
    }
    public void removePassengers() {
        if (passengers <= 0) {
            System.out.println("Nie moze byc zero pasazerow");
        } else {
            passengers -= 1;
            System.out.println("Aktualna liczba pasazerow to " + passengers);
        }
    }
}