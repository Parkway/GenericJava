package com.lance;

/******************************************
 * Created by Lance Douglas on 12/31/2018
 ******************************************/
class CoffeePot {

    //Initialize empty variable
    //for the coffeePot
    int potEmpty = 1;

    /**If pot is greater than 0
     *(ie, not empty) do nothing.
     *If potEmpty is 0, state pot is empty.
     */
    boolean Empty() {
        while(potEmpty > 0) {
            potEmpty--;
            //Is empty? False -> Do nothing.
            return false;
        }
        // Pot is empty, True, call coffeePot.Make
        System.out.println("\nPot is empty.");
        return true;
    }

    //Make a fresh pot.
    void Make() {
        System.out.println(
            "Making a fresh one...");
    }
}
