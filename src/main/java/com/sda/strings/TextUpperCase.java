package com.sda.strings;

import java.util.Locale;

public class TextUpperCase implements StringOperations{
    @Override
    public String modify (String text){
        return text.toUpperCase();
    }
}
