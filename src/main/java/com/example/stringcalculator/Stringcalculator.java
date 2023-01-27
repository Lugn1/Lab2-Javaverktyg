package com.example.stringcalculator;

public class Stringcalculator {

    public static int add(String numbers) {

        int sum = 0;
        String[] stringNumbers = numbers.split(",|\n");

        if (numbers.equals(""))
            return 0;
        else {
            for (String stringNumber : stringNumbers) {
                sum += Integer.parseInt(stringNumber);
            }
        }
        return sum;
    }
}
