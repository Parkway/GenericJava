/**
 * This class is a demonstration of object oriented programming with Java
 * using arrays of both cats and dogs. It counts for three dogs and three
 * cats, each of which are assigned a name, age, and weight.
 */

package com.lance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int age, weight,
        dogNum, catNum, bunNum,
        dogCount, catCount, bunCount;

        Scanner scn = new Scanner(System.in);

        print("How many dogs do you have?");
        dogNum = scn.nextInt();
        print("How many cats?");
        catNum = scn.nextInt();
        print("How many rabbits?");
        bunNum = scn.nextInt();

        Animals [] dogs = new Animals[dogNum];
        Animals [] cats = new Animals[catNum];
        Animals [] buns = new Animals[bunNum];

       /* dogNum = dogNum-1;
        catNum = catNum-1;
        bunNum = bunNum-1;*/

        dogCount = dogNum;
        catCount = catNum;
        bunCount = bunNum;

        dogs[dogNum-1] = new Animals();
        cats[catNum-1] = new Animals();
        buns[bunNum-1] = new Animals();


        try {
            while (dogNum > 0) {
                print("Dogs1: " + dogNum);
                print("Dog's name:");
                name = scn.next();
                print("Dog's age:");
                age = scn.nextInt();
                print("Dog's weight: ");
                weight = scn.nextInt();

                dogs[dogNum - 1].setName(name);
                dogs[dogNum - 1].setAge(age);
                dogs[dogNum - 1].setWeight(weight);

                dogNum--;
            }
        } catch (NullPointerException NPE) {
            NPE.getStackTrace();
        }

        try {
            while (catNum > 0) {
                print("Cats: " + catNum);
                print("Cat's name:");
                name = scn.next();
                print("Cat's age:");
                age = scn.nextInt();
                print("Cat's weight:");
                weight = scn.nextInt();

                cats[catNum - 1].setName(name);
                cats[catNum - 1].setAge(age);
                cats[catNum - 1].setWeight(weight);

                catNum--;
            }
        } catch (NullPointerException NPE) {
            NPE.getStackTrace();
        }

        try {
            while (bunNum > 0) {
                print("Bunnies: " + bunNum);
                print("Bun's name:");
                name = scn.next();
                print("Bun's age:");
                age = scn.nextInt();
                print("Bun's weight:");
                weight = scn.nextInt();

                buns[bunNum - 1].setName(name);
                buns[bunNum - 1].setAge(age);
                buns[bunNum - 1].setWeight(weight);

                bunNum--;
            }
        } catch (NullPointerException NPE) {
            NPE.getStackTrace();
        }


        print(dogNum + " " + dogCount);
        print(catNum + " " + catCount);
        print(bunNum + " " + bunCount);

        /**
         * These loops each take the animal value
         * and incorporate them into
         */


        try {
            print("\nDogs:");
            print("Dog Count: " + dogCount);
            while (dogCount > 0) {
                Thread.sleep(500);
                String dog = dogs[dogCount-1].getName() + ", "
                    + dogs[dogCount-1].getAge() + " years old, "
                    + dogs[dogCount-1].getWeight() + " pounds.";
                print(dog);
                dogCount--;
            }
        } catch (InterruptedException IE) {
            //Nah
        }

        try {
            print("Cats:");
            while (catCount > 0) {
                Thread.sleep(500);
                String cat = cats[catCount-1].getName() + ", "
                    + cats[catCount-1].getAge() + " years old, "
                    + cats[catCount-1].getWeight() + " pounds.";
                print(cat);
                catCount--;

            }
        } catch (InterruptedException IE) {
            //Nah
        }

        try {
            print("\nBunnies:");
            while (bunCount > 0) {
                Thread.sleep(500);
                String bun = buns[bunCount-1].getName() + ", "
                    + buns[bunCount-1].getAge() + " years old, "
                    + buns[bunCount-1].getWeight() + " pounds.";
                print(bun);
                bunCount--;
            }
        } catch (InterruptedException IE) {
            //Nah
        }
    }

    private static void print(String s) {
        System.out.println(s); //2lazy4System.out.println
    }
}
