package com.company;


import java.util.*;

public class MyObservable {
    ArrayList<Observer> observers = new ArrayList<>();
    public void notifyObservers(int health1, int health2, String moves, String player_1, String player_2){
        for(Observer o : observers)
            o.Display(health1,health2,moves,player_1,player_2);
    }
    public void addObserver(Observer a, Observer b ){

        observers.add(a);
        observers.add(b);
    }

    public void removeObserver(Observer o){

        observers.remove(o);
    }
}
