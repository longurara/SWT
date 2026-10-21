package com.longurara.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test case #1: n= 5!, expected = 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);


        //so sanh bang com hay bang framework
        //bang com, in log file, da choi va nay ko choi, xem ben main()

        //so sanh bang tool xanh do
        assertEquals(expected, actual);
    }

    //test case #2; n=6!
    @Test
    void testFactorialGivenValidN6ReturnsWell120(){
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);

        assertEquals(expected,actual);
    }

    @Test
    void testFactorialGivenInvalidMinus1ThrowsException(){
        int invalidN = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(invalidN);
        });
    }
}