package com.example.stringcalculator;

public class Stringcalculator {

    public static int add(String numbers) {

        int sum = 0;
        String[] stringNumbers = numbers.split("//|,|\n|;");

        for (String stringNumber : stringNumbers) {
            if (!stringNumber.equals("")) {
                sum += Integer.parseInt(stringNumber);
            }
        }
        return sum;
    }
}
