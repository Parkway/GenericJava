package com.lance;

/***********************************************************************
 * Created by Lance Douglas on 12/27/2018
 ***********************************************************************/
public class Movie {
    String title, genre;
    int rating;

    void playIt() {
        System.out.println("Now playing: " + title +
                "\nGenre: " + genre +
                "\nRating: " + rating + "\n");
    }
}
