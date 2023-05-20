package com.company;

public class Main {

    public static void main(String[] args) {
        Fighter player1 = new Kendo();
        Fighter player2 = new TigerLi();
        Observer screen1 = new Screen1();
        Observer screen2 = new Screen2();
        player1.addObserver(screen1,screen2);
        player2.addObserver(screen1,screen2);
        player1.throwPunch(player2);
        player2.throwPunch(player1);
        player1.throwKick(player2);


    }
}
