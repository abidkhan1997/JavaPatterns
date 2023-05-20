package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultPunchTest {

    @Test
    void getName() {
        PunchBehavior p = new DefaultPunch();
        assertEquals("default punch",p.getName());

    }

    @Test
    void getDamage() {
        PunchBehavior p = new DefaultPunch();
        assertEquals(10, p.getDamage());
    }
}