package com.springboot.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test void testAdd1() { assertEquals(5, service.add(2, 3)); }
    @Test void testAdd2() { assertEquals(0, service.add(-1, 1)); }

    @Test void testSubtract1() { assertEquals(1, service.subtract(3, 2)); }
    @Test void testSubtract2() { assertEquals(-5, service.subtract(0, 5)); }

    @Test void testMultiply1() { assertEquals(6, service.multiply(2, 3)); }
    @Test void testMultiply2() { assertEquals(0, service.multiply(5, 0)); }

    @Test void testDivide1() { assertEquals(2, service.divide(6, 3)); }
    @Test void testDivide2() { assertEquals(1, service.divide(3, 2)); }

    @Test void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> service.divide(5, 0));
    }

    @Test void testNegativeNumbers() {
        assertEquals(-6, service.multiply(-2, 3));
    }
}