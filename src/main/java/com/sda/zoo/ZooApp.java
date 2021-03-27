package com.sda.zoo;

public class ZooApp {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly(120);
        eagle.eat("Mouse");
        Duck duck = new Duck();
        duck.fly(90);
        duck.eat("vegetable");

        FlyBehavior flyBehavior = new Duck();

        Air air = new Air();
        air.flyInAir(eagle);
        air.flyInAir(duck);

        Animal anotherDuck = new Duck();
        anotherDuck.eat("vegetable");

        Animal anotheEagle = new Eagle();
        anotheEagle.eat("Mouse");

        FlyBehavior plane = new FlyBehavior() {     //implementacja klasy anonimowej
            @Override
            public void fly(double h) {
                if (h >= 3000) {
                    System.out.println("Latam na wysokosci " + h);
                } else {
                    System.out.println("Latam na wysokosci 3000");
                }
            }
        };
        plane.fly(1500);  //jedyny obiekt klasy anonimowej
    }


}
