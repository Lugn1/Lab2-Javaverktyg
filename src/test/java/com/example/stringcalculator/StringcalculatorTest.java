package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StringcalculatorTest {


    @Test
    void callAddMethodWIthAnEmptyStringShouldReturn0(){
        assertEquals(0, Stringcalculator.add(""));
    }

    @Test
    void callAddMethodWithOneIntegerShouldReturnTheSameInteger(){
        assertEquals(1, Stringcalculator.add("1"));
    }

    @Test
    void addAStringWithTwoNumbersCommaSeperatedShouldReturnTheSum() {
        assertEquals(2, Stringcalculator.add("1,1"));
    }

    @Test
    void addAStringWithMultipleNumbersAndReturnTheSum(){
        String input = "1,3,4,20,2";
        assertEquals(30, Stringcalculator.add(input));
    }

    @Test
    void addNumbersWithCommaAndNewLineSignShouldStillReturnSumOfAllNumbers() {
        assertEquals(6,Stringcalculator.add("1\n2,3"));
    }

    @Test
    void addNumbersWithSeparateLineOfCodeAndSemicolonAsDelimiterShouldReturnSum() {
        assertEquals(8, Stringcalculator.add(";\n//;\n1;2;5"));
    }

    @Test
    void callingAddWithNegativeNumberShouldThrowAnException() {
        String input = ";\n//;\n1;-2;5";
        assertThatThrownBy(() -> Stringcalculator.add(input)).isInstanceOf(IllegalArgumentException.class);
    }

}