package com.bloomtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassSecond {
    @Test
    public void passesFromSecond() {
        assertEquals(2+2,4);
    }

    @Test
    public void failsFromSecond() {
        assertEquals(2+2,5);
    }
}
