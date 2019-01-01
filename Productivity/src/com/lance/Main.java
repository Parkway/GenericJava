/**
 * This class is just something I whipped up
 * based on a mug that a family friend got me
 * for christmas this year. The entirety of
 * the do {} while loop is printed on the mug.
 * Just for fun, I decided to turn the code
 * into a reality.
 */

package com.lance;

public class Main {

    public static void main(String[] args) {
        /**
         * Creating each object: coffeeCup,
         * workTask, and coffeePot.
         */

        /**
         * While workTask.Done is false,
         * execute these commands.
         *
         * One, drink from the cup.
         * Two, work on... the work.
         * Three, if coffeeCup is empty,
         * check if the coffeePot is
         * empty, and if so refill the pot
         * and then refresh the cup.
         *
         * Again, do this until the task is done.
         */
        CoffeeCup coffeeCup = new CoffeeCup();
        WorkTask workTask = new WorkTask();
        CoffeePot coffeePot = new CoffeePot();
        do {
            coffeeCup.Drink(); //Slurp
            workTask.Execute(); //Working
            if (coffeeCup.Empty()) { //If cup empty,
                if (coffeePot.Empty()) //If pot empty,
                    coffeePot.Make(); //Make a fresh pot
                coffeeCup.Refill(); //Refill your mug
            }
        } while (!workTask.Done()); //While work isn't done.
    }
}
