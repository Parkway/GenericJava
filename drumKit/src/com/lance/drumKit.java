/*
I don't know what packages do.
Something something, make classes work together in subdirectory?
*/
package com.lance;

class drumKit {

    /*
    Declaring drumType String for object oriented showcase.
    drumType will be set() by Main.java, lines 27, 31, and 35
     */
    String drumType;

    /*
    These methods take the String sound from Main.java,
    as well as the updated drumType value.
    Then they print out "A $drum makes a $sound sound,"
    where $drum and $sound are set by Main.
    */
    void playSnare(String sound) {
        //A $drum makes a $sound.
        String sentence = "A " + drumType + " makes a " + sound + " sound.\n";
        System.out.println(sentence);
    }

    void playHighHat(String sound) {
        String sentence = "A " + drumType + " makes a " + sound + " sound.\n";
        System.out.println(sentence);
    }

    void playBass(String sound) {
        String sentence = "A " + drumType + " makes a " + sound + " sound.\n";
        System.out.println(sentence);
    }
}
