package com.sda.generic.box;

import com.sda.generic.box.Box;

public class BoxApp {   //typ generyczny
    public static void main(String[] args) {
        Box<Integer> boxLiczba = new Box<Integer>();
        boxLiczba.set(9876);
        System.out.println(boxLiczba.get());

        Box <String> boxTekst = new Box<String>();
        boxTekst.set("Text");
        System.out.println(boxTekst.get());
    }
}
