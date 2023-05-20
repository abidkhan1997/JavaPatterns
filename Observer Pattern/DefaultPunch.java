package com.company;

public class DefaultPunch extends PunchBehavior {
    int damage = 10;
    String name = "default punch";

    public String getName() {

        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }
}
