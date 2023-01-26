package com.example.stringcalculator;

import org.junit.jupiter.api.Test;

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
        String input = "1,3";
        assertEquals(4, Stringcalculator.add(input));
    }
}