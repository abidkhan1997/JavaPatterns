package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Screen1Test {

    @Test
    void display() {
        Screen1 s = new Screen1();
        s.Display(100,100,"punched", "player1", "player2");
    }


}