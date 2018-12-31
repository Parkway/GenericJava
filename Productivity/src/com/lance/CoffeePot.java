package com.lance;

/******************************************
 * Created by Lance Douglas on 12/31/2018
 ******************************************/
public class CoffeePot {

    int pot = 1;

    boolean Empty() {
        while(pot > 0) {
            pot--;
            return false;
        }
        System.out.println("\nPot is empty.");
        return true;
    }

    void Make() {
        System.out.println(
            "Making a fresh one...");
    }
}
