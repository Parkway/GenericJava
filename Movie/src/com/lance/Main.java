package com.lance;

public class Main {

    public static void main(String[] args) {
        Movie one = new Movie();
        Movie two = new Movie();
        Movie three = new Movie();

        one.title = "Terminator";
        one.genre = "Action";
        one.rating = 8;
        one.playIt();

        two.title = "Holes";
        two.genre = "Family";
        two.rating = 6;
        two.playIt();

        three.title = "The Meg";
        three.genre = "Sci-Fi";
        three.rating = 7;
        three.playIt();
    }
}
