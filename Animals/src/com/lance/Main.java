/**
 * @Version .3
 * This class is a demonstration of object oriented programming with Java.
 * So far, it works around three (3) pet types - dogs, cats, and rabbits.
 * The user inputs each type of animal they have, as well as the names, ages,
 * and weights of those pets. In the end, the input animals are returned to
 * the user in an easily readable format. This program isn't so much about
 * the actual "what it do," but more about the "how it do it."
 */

package com.lance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaring Strings and ints
        //for the entirety of the program.
        String name;
        int age, weight,
        dogNum, catNum, bunNum,
        dogCount, catCount, bunCount;

        //New scanner object scn
        Scanner scn = new Scanner(System.in);

        /**
         * This section simply prompts for the
         * number of each type of pet, and
         * adds each to the corresponding
         * $putNum integer.
         */
        print("How many dogs do you have?");
        dogNum = scn.nextInt();
        print("How many cats?");
        catNum = scn.nextInt();
        print("How many rabbits?");
        bunNum = scn.nextInt();

        dogCount = dogNum;
        catCount = catNum;
        bunCount = bunNum;

        /**
         * Assigning an array of objects to
         * pet type. Currently, the whole issue
         * of arrays starting at 0 is really
         * dicking up the rest of my program.
         *
         * USER INPUT IN ARRAYS IS ALWAYS N-1
         */

        Animals [] dogs = new Animals[dogNum-1];
        Animals [] cats = new Animals[catNum-1];
        Animals [] buns = new Animals[bunNum-1];


        print(dogNum + " " + catNum + " " + bunNum);

        /**
         * TODO unfuck this
         * I think the issue is that i am declaring an array
         * index(?) to the number of each animal type, but
         * not for each total animal. This is to say that I
         * am creating Dog[2] (third dog) but not Dog[0]
         * and Dog[1]. While loop?
         */

        dogs[dogNum-1] = new Animals();
        cats[catNum-1] = new Animals();
        buns[bunNum-1] = new Animals();


        try {
            while (dogNum >= 0) {
                print("Dogs: " + dogNum);
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
            while (catNum >= 0) {
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
            while (bunNum >= 0) {
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
        } catch (NullPointerException NPE) {
            //Nah
        }

        try {
            print("\nCats:");
            print("Cat Count: " + catCount);
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
        } catch (NullPointerException NPE) {
            //Do nothing
        }

        try {
            print("\nBunnies:");
            print("Bunny Count: " + bunCount);
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
        } catch (NullPointerException NPE) {
            //Oops
        }
    }

    private static void print(String s) {
        System.out.println(s); //2lazy4System.out.println
    }
}
