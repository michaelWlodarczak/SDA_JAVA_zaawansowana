/*package com.sda.exceptions;
public class MyException {
    public static void main(String[] args) {
        try {
            MyException.greet("a");
        } catch (InvalidNameExceptionApp invalidNameException){
            System.out.println("Hej, masz błąd w imieniu: " + InvalidNameExceptionApp);
        }
    }
    static void greet(String name) throws InvalidNameExceptionApp{
        if (name == null || name.isEmpty()) {
            throw new InvalidNameExceptionApp("Imię jest puste");
        }
        if (name.length() == 1) {
            throw new InvalidNameExceptionApp("Imię jest za krótkie");
        }
        System.out.println("Hello " + name);
    }
}*/