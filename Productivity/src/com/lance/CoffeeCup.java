package com.lance;

/******************************************
 * Created by Lance Douglas on 12/31/2018
 ******************************************/
public class CoffeeCup {

    //Initialize empty variable
    //for the coffeeCup.
    int cupEmpty = 1;

    //Drink from the cup.
    void Drink() {
        System.out.println(
                "Slurp...\n" +
                "Slurp...\n" +
                "Slurp...\n");
    }

    //If cup is empty, prepare to refill.
    //If cup is not empty, do nothing.
    boolean Empty() {
        while (cupEmpty > 0) {
            cupEmpty--;
            if (cupEmpty == 0) {
                System.out.println(
                        "Cup is empty, refreshing...");
                cupEmpty = 2;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //Actually refills the cup.
    void Refill() {
        System.out.println("Refilling cup...\n");
    }
}
