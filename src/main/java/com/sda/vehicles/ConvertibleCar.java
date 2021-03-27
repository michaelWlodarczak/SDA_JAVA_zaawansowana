package com.sda.vehicles;

public class ConvertibleCar extends Car {
    boolean roofStatus;
    public void openRoof (boolean roofStatus){
        if (roofStatus){
            System.out.println("Roof is open");
        }else {
            roofStatus = true;
        }
    }
    public void closeRoof (boolean roofStatus){
        if (!roofStatus){
            System.out.println("Roof is close");
        }else {
            roofStatus = false;
        }
    }
    public boolean isRoofStatus() {
        return roofStatus;
    }
    public void setRoofStatus(boolean roofStatus) {
        this.roofStatus = roofStatus;
    }
}