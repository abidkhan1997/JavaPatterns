package com.type;


public class FighterFactory {

    public fightertype getFighter(int choice){
        if(choice == 1){
            return new strong_fighter();
        }
        else if (choice == 2){
            return new agile_fighter();
        }
        else if (choice == 3){
            return new range_fighter();
        }
        else if (choice == 4){
            return new technical_fighter();
        }
        else{
            return null;
        }

    }


}
