package com.csc205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        // SEAT

        //setup
        int expected = 4;

        //exercise
        int actual = new Calculator().add(2,2);

        // assertion
        assertEquals(expected,actual);


    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        int expected = 6;
        int actual = new Calculator().add(2,2, 2);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int expected = 2;
        int actual = new Calculator().subtract(4,2);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int expected = 4;
        int actual = new Calculator().multiply(2,2);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        int expected = 4;
        int actual = new Calculator().divide(8,2);

        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () ->  {
            new Calculator().divide(0,0);
        });
    }
}