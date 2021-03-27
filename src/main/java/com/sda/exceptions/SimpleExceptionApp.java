package com.sda.exceptions;

import com.sda.examples.Greeter;

import java.util.Locale;

public class SimpleExceptionApp {
    public static void main(String[] args) {
        String tekst = "Michal";  //String tekst = "Michal";

        try { //definiuje blok kodu w ktorym przewidujemy, ze moze byc blad
            System.out.println(tekst.toUpperCase());
        } catch (NullPointerException exception){
            System.out.println("Wystapil wyjatek " + exception.getMessage());
        } finally {
            System.out.println("Czyszcze po sobie!");
        }
    }
}
