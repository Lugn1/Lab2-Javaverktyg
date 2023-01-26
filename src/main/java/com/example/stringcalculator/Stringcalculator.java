package com.example.stringcalculator;

public class Stringcalculator {

    public static int add(String s) {
        int number;
        if (s.equals(""))
            return 0;
        else {
            number = Integer.parseInt(s);
            return number;
        }
    }
}
