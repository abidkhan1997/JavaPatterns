package com.company;

import com.company.Fighter;

public class Kendo extends Fighter {

    public Kendo(){

        super("Kendo", new TornadoKick(), new DefaultPunch());
    }
}
