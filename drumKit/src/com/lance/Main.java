package com.lance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        drummer();
    }

    static void drummer() {
        drumKit d = new drumKit();

        Scanner scn = new Scanner(System.in);

        String snareDrum = "snare drum";
        String highHat = "high hat";
        String bass = "bass";

        System.out.println("What drum would you like to hear?" +
            "\nSnare" +
            "\nHigh Hat" +
            "\nBass");

        String input = scn.nextLine().toLowerCase();

        if (input.equals("snare")) {
            d.drumType = snareDrum;
            d.playSnare("tsst");

        } else if (input.equals("high hat")) {
            d.drumType = highHat;
            d.playHighHat("pop");

        } else if (input.equals("Bass")) {
            d.drumType = bass;
            d.playBass("boom");
        } else {
            System.out.println("You did not select a correct option. Restarting.");
            drummer();
        }
    }
}
