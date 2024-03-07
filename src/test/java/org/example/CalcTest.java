package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(3, calc.add(1, 2));
    }
}
