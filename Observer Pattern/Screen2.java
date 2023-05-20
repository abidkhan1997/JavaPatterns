package com.company;

public class Screen2 implements Observer {
    public void Display(int health1, int health2, String moves, String player_1, String player_2){

        System.out.println("Player2's screen1\n" +player_1 + " just " + moves + " at " + player_2);
        if(health2 <= 0) System.out.println(player_2 + " has been defeated,game over");

        else{
            System.out.println(player_1 + " hp: " + health1);
            System.out.println(player_2 + " hp: " + health2 + "\n------------------------");
        }
    }
}
