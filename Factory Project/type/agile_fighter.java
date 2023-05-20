package com.type;

public class agile_fighter implements fightertype{
    @Override
    public void style() {
        System.out.println("Fighter style: Agile");
    }

    @Override
    public void power() {
        System.out.println("Power level: 3");
    }

    @Override
    public void health() {
        System.out.println("Health level: 2");
    }

    @Override
    public void mobility() {
        System.out.println("Mobility level: 5");
    }

    @Override
    public void technique() {
        System.out.println("Technique level: 3");
    }

    @Override
    public void range() {
        System.out.println("Range level: 3");
    }
}
