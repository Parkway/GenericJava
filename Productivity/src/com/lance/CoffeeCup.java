package com.lance;

/***********************************************************************
 * Created by Lance Douglas on 12/31/2018
 ***********************************************************************/
public class CoffeeCup {

    int empty = 1;

    void Drink() {
        System.out.println(
                "Slurp...\n" +
                "Slurp...\n" +
                "Slurp...\n");
    }

    boolean Empty() {
        while (empty > 0) {
            empty--;
            if (empty == 0) {
                System.out.println(
                        "Cup is empty, refreshing...");
                empty = 2;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    void Refill() {
        System.out.println("Refilling cup...\n");
    }
}
