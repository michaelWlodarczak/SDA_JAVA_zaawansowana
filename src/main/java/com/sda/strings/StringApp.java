package com.sda.strings;

import java.util.ArrayList;
import java.util.List;

public class StringApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sample text 1");
        list.add("sample text 2");
        list.add("sample text 3");
        list.add("sample text 4");

        StringOperations textDuplicate = new StringOperations() {  // implementacja interfejsu za pomoca klasy anonimowej
            @Override
            public String modify(String text) {
                return text + text;
            }
        };

        StringOperations removeLetterE = (String text) -> {  // lambda, interfejs musi miec tylko jedna nie zaimplementowana metode
            return text.replace("e", "");
        };

        StringOperations shortenString = new StringOperations() {  // klasa abstrakcyjna
            @Override
            public String modify(String text) {
                return text.substring(0, 3);
            }
        };

        StringOperations shortenStringTo3Letters = text -> text.substring(0, 3);  // implementacja za pomoca lambdy, jedna drugiej nie wymaga
        // lambda w tym przypadku zapisana jest maxymalnie krotko

        StringOperations doklejHelloOperation = StringApp::doklejHello;  // referencja do metody

        for (String text : list) {
            String doklej = doklejHelloOperation.modify(text);
            System.out.println(doklej);
        }
        for (String text : list) {
            TextUpperCase operation = new TextUpperCase();
            System.out.println(operation.modify(text));
        }
        for (String text : list) {
            String duplicate = textDuplicate.modify(text);
            System.out.println(duplicate);
        }
        for (String text : list) {
            String replace = removeLetterE.modify(text);
            System.out.println(replace);
        }
        for (String text : list) {
            String substring = shortenStringTo3Letters.modify(text);
            System.out.println(substring);
        }


    }


    private static String doklejHello(String text) {
        return "Hello" + text;
    }


}
