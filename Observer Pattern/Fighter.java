package com.company;

public class Fighter extends MyObservable {

    private int health = 100;
    private String name = "";
    private KickBehavior kickbehavior;
    private PunchBehavior punchbehavior;


    public Fighter(String name,KickBehavior kickbehavior,PunchBehavior punchbehavior){
        this.name = name;
        this.kickbehavior = kickbehavior;
        this.punchbehavior = punchbehavior;

    }

    public void throwPunch(Fighter fighter2){
         fighter2.setHealth(fighter2.getHealth() - this.punchbehavior.getDamage());
         notifyObservers(this.health, fighter2.getHealth(), this.punchbehavior.getName(), this.name, fighter2.getName());

    }

    public void throwKick(Fighter fighter2){
        fighter2.setHealth(fighter2.getHealth() - this.kickbehavior.getDamage());
        notifyObservers(this.health, fighter2.getHealth(), this.kickbehavior.getName(), this.name, fighter2.getName());
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
}

