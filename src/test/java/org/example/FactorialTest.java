package org.example;
import org.junit.jupiter.api.DisplayName;
import junit.framework.Test;
import static junit.framework.Assert.*;


public class FactorialTest {
    @Test
    @DisplayName("positive test")
    public void positiveTest() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    @DisplayName("Negative test")
    public void negativeTest() {
        assertFalse(1 == Factorial.calculateFactorial(5));
    }
}
