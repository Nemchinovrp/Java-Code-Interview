package com.nemchinovrp.code.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToStringTest {

    @Test
    public void intToString() {
        assertEquals(333, IntToString.stringToInt("333"));
    }

    @Test
    public void stringToInt() {
        assertEquals("22", IntToString.intToString(22));
    }
}
