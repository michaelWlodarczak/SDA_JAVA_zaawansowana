package com.sda.exceptions;

import java.util.Scanner;

public class ExeptionApp {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj swoje imie ");
            String name = input.nextLine();
            greet(name);

        } catch (IllegalArgumentException exception) {
            System.out.println("Nie podales swojego imienia");
        }
        System.out.println("Zamykam program");
    }

    static void greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty");
        }
        System.out.println("Hello " + name);
    }
}
