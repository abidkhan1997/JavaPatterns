package com.type;

public class strong_fighter implements fightertype{
    @Override
    public void style() {
        System.out.println("Fighter style: Strong");
    }

    @Override
    public void power() {
        System.out.println("Power level: 5");
    }

    @Override
    public void health() {
        System.out.println("Health level: 4");
    }

    @Override
    public void mobility() {
        System.out.println("Mobility bar level: 1");
    }

    @Override
    public void technique() {
        System.out.println("Technique level: 2");
    }

    @Override
    public void range() {
        System.out.println("Range level: 2");
    }
}
