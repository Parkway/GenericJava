/**************************************************
 * If I'm gonna get serious about programming,    *
 * I should get serious about comments.           *
 **************************************************/

package com.lance;

//Need Scanner for user input.
import java.util.Scanner;

public class Main {

    /*
    The point of this method is simply to call drummer().
    This is done so that at the end of the program, the user
    can choose to re run the program. The most straightforward
    way that I know of to do that is simply call the method.
    As of now, I have no idea if this is bad practice.
     */
    public static void main(String[] args) {
        drummer();
    }

    private static void drummer() {

        //New drumKit and Scanner objects.
        drumKit d = new drumKit();
        Scanner scn = new Scanner(System.in);

        //Two user input instances
        String input1, input2;

        //Drum Names
        String snare = "snare drum";
        String highHat = "high hat";
        String bass = "bass";

        //Drum Sounds
        String snareSound = "tsst";
        String highSound = "pop";
        String bassSound = "boom";

        //Ask user what drum type they want to test
        System.out.println("What drum would you like to hear?" +
                "\nSnare" +
                "\nHigh Hat" +
                "\nBass");

        /*
        Take input from user, convert all input to lower case.
        This approach ensures compatibility with available inputs.
        */
        input1 = scn.nextLine().toLowerCase();

        /*
        Each acceptable input corresponds to the
        requested drum type. When the user types snare,
        for example, the drumType of d (drumKit) is
        set to $snare, and passes the $snareSound string.
        The try{} block is necessary for the Thread.sleep
        that you can see below.
        */
        try {
            if (input1.equals("snare")) {
                //Set drumType to snare
                d.drumType = snare;
                //Call playSnare method with
                //snareSound constructors.
                d.playSnare(snareSound);
                //Pause execution for 1.5 seconds.
                Thread.sleep(1500);
                //Repeat
                drummer();
            } else if (input1.equals("high hat")) {
                d.drumType = highHat;
                d.playHighHat(highSound);
                Thread.sleep(1500);
                drummer();
            } else if (input1.equals("Bass")) {
                d.drumType = bass;
                d.playBass(bassSound);
                Thread.sleep(1500);
                drummer();
            } else {
                System.out.println("You did not select a correct option." +
                        "\nWould you like to try again?");

                input2 = scn.nextLine().toLowerCase();

                if (input2.contains("y")) {
                    drummer();
                } else {
                    System.out.println("Good bye.");
                    //Exit program.
                    System.exit(0);
                }
            }
        } catch (InterruptedException IE) {
            //Doesn't need content.
        }
    }
}
