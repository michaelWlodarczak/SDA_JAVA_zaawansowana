package com.sda.zoo;

public abstract class Animal {

    boolean eatsMeat;

    abstract void eat (String something);

    boolean doYouEatMeat(){
        return eatsMeat;
    }

}

