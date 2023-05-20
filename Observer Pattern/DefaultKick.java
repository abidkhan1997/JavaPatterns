package com.company;

public class DefaultKick extends KickBehavior{
    int damage = 10;
    String name = "Default Kick";

    public String getName() {

        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }



}
