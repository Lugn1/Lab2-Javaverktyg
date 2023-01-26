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
        String actual = "1";
        assertEquals(1, Stringcalculator.add(actual));
    }


}