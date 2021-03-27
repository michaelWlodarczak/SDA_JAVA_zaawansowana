package com.sda.vehicles2;

import java.util.concurrent.Callable;

public class VehicleApp2 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run(100);

        /* Car2 car2 = new Car2();
        car2.addPassengers();
        car2.run(140); */

        /* ConvertibleCar convertibleCar = new ConvertibleCar();
        convertibleCar.openRoof(true);
        convertibleCar.openRoof(false);
        convertibleCar.closeRoof(convertibleCar.roofStatus); */

    }
}