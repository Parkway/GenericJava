package com.lance;

public class Main {

    public static void main(String[] args) {
        drumKit d = new drumKit();
        d.drumType = "Snare Drum";
        d.playSnare("Tsst");
        d.drumType = "Top Hat";
        d.playTopHat("Boop");
        d.drumType = "Bass";
        d.playBass("Boom");
    }
}
