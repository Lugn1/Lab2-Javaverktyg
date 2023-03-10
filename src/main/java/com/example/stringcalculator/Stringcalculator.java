package com.example.stringcalculator;


public class Stringcalculator {

    public static int add(String numbers) {

        int number;
        int sum = 0;

        String[] stringNumbers = numbers.split("[/,\\\\;*%\\[\\]a-z\n]");

        for (String stringNumber : stringNumbers) {
            if (!stringNumber.equals("")) {
                number = Integer.parseInt(stringNumber);
                if (number < 0)
                    throw new IllegalArgumentException("negatives not allowed");
                if (number > 1000)
                    continue;
                sum += number;
            }
        }
        return sum;
    }
}
