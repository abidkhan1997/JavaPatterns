package com.type;

public class technical_fighter implements fightertype{
    @Override
    public void style() {
        System.out.println("Fighter Style: Technical");
    }

    @Override
    public void power() {
        System.out.println("Power level: 3");
    }

    @Override
    public void health() {
        System.out.println("Health level: 3");
    }

    @Override
    public void mobility() {
        System.out.println("Mobility level: 4");
    }

    @Override
    public void technique() {
        System.out.println("Technique level: 5");
    }

    @Override
    public void range() {
        System.out.println("Range level: 2");
    }
}
