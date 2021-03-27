package com.sda.examples;

public class Greeter {  // przeciazanie metod
    public static void main(String[] args) {
        Greeter obiektGreeter = new Greeter();
        obiektGreeter.greet();
        obiektGreeter.greet("Michal");
        obiektGreeter.greet("Hi","Michal");
    }
        void greet(){
            System.out.println("Hello, World!");
        }
        void greet(String name){
            System.out.println("Hello " + name + "!");
        }
        static void greet(String greeting,String name){
            System.out.println(greeting + "," + name);
    }
}