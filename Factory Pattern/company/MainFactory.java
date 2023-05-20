package com.company;


import com.type.agile_fighter;
import com.type.range_fighter;
import com.type.strong_fighter;
import com.type.technical_fighter;
import com.type.*;

public class MainFactory {

    public static void main (String a[]) {
        FighterFactory fighter = new FighterFactory();
        fightertype getFighter = fighter.getFighter(2);
        getFighter.style();
        getFighter.power();
        getFighter.health();
        getFighter.mobility();
        getFighter.range();
        getFighter.technique();


    }



}
