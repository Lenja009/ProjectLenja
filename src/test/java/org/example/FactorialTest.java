package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test for simple App.
 */
public class FactorialTest{

    @Test(description = "Positive test")
    public void positiveTest() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test(description = "Negative test")
    public void negativeTest() {
        assertNotEquals(1, Factorial.calculateFactorial(5));
    }
}