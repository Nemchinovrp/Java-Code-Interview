package com.nemchinovrp.code.strings;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromTest {

    @Test
    public void testPositive() {
        assertTrue(Palindrom.isPalindromic("ротатор"));
    }

    @Test
    public void testNegative() {
        assertFalse(Palindrom.isPalindromic("венигрет"));
    }

}