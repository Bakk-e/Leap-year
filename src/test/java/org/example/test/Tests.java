package org.example.test;

import org.junit.jupiter.api.Test;
import static org.example.Main.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void leapYearTrue() {
        assertTrue(isLeapYear(1860), "Calculation failed. 1860 is a leap year");
        assertTrue(isLeapYear(1836), "Calculation failed. 1836 is a leap year");
        assertTrue(isLeapYear(2140), "Calculation failed. 2140 is a leap year");
        assertFalse(isLeapYear(2021), "Calculation failed. 2021 is not a leap year");
        assertTrue(isLeapYear(2008), "Calculation failed. 2008 is a leap year");
        assertTrue(isLeapYear(2032), "Calculation failed. 2032 is a leap year");
        assertFalse(isLeapYear(2033), "Calculation failed. 2033 is not a leap year");
        assertFalse(isLeapYear(2044), "Calculation failed. 2044 is a leap year");
        assertFalse(isLeapYear(2000), "Calculation failed. 2000 is a leap year");
    }

    @Test
    public void yearDivisibleBy4ButNot100() {
        assertTrue(isLeapYear(2024), "Calculation failed on divisible by 4 but not 100 on: 2024");
        assertTrue(isLeapYear(1900), "Calculation failed on divisible by 4 but not 100 on: 1900");
        assertTrue(isLeapYear(1996), "Calculation failed on divisible by 4 but not 100 on: 1996");
        assertFalse(isLeapYear(1700), "Calculation failed on divisible by 4 but not 100 on: 1700");
    }
    @Test
    public void yearDivisibleBy400() {
        assertTrue(isLeapYear(2000), "Calculation failed on divisible by 400 on: 2000");
        assertFalse(isLeapYear(2100), "Calculation failed on divisible by 400 on: 2100");
        assertFalse(isLeapYear(3700), "Calculation failed on divisible by 400 on: 3700");
        assertTrue(isLeapYear(2012), "Calculation failed on divisible by 400 on: 2012");
    }
    @Test
    public void yearNotDivisibleBy4() {
        assertTrue(isLeapYear(2024), "Calculation failed on divisible by 4 on: 2024");
        assertTrue(isLeapYear(2024), "Calculation failed on divisible by 4 on: 2064");
        assertFalse(isLeapYear(1900), "Calculation failed on divisible by 4 on: 2061");
        assertFalse(isLeapYear(1997), "Calculation failed on divisible by 4 on: 1997");
    }
    @Test
    public void yearDivisibleBy100ButNot400() {
        assertFalse(isLeapYear(1800), "Calculation failed on divisible by 100 but not 400 on: 1800");
        assertFalse(isLeapYear(2100), "Calculation failed on divisible by 100 but not 400 on: 2100");
        assertFalse(isLeapYear(2500), "Calculation failed on divisible by 100 but not 400 on: 2600");
        assertFalse(isLeapYear(3100), "Calculation failed on divisible by 100 but not 400 on: 3100");
    }
}
