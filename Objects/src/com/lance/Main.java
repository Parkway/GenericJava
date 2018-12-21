package com.lance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Cats cat = new Cats();
        Dogs dog = new Dogs();

        System.out.println("How many cats are there?");
        int catCount = scn.nextInt();
        cat.setCatCount(catCount);

        System.out.println("How many dogs are there?");
        int dogCount = scn.nextInt();
        dog.setDogCount(dogCount);

    }

}
