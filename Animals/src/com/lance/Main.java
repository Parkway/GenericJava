/**
 * @Version .8
 * This class is a demonstration of object oriented programming with Java.
 * So far, it works around three (3) pet types - dogs, cats, and rabbits.
 * The user inputs each type of animal they have, as well as the names, ages,
 * and weights of those pets. In the end, the input animals are returned to
 * the user in an easily readable format. This program isn't so much about
 * the actual "what it do," but more about the "how it do it."
 */

package com.lance;

import java.util.InputMismatchException;
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
        ExceptionHandler EH = new ExceptionHandler();
        /**
         * This section simply prompts for the
         * number of each type of pet, and
         * adds each to the corresponding
         * $putNum integer.
         */
        try {
            print("How many dogs do you have?");
            dogNum = scn.nextInt();
            print("How many cats?");
            catNum = scn.nextInt();
            print("How many rabbits?");
            bunNum = scn.nextInt();

            if (dogNum == 0 &&
                catNum == 0 &&
                bunNum == 0) {
                print("You have no pets.\n" +
                        "This is a vet's office.\n" +
                        "Go home.");
                System.exit(1000);
            }

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

            Animals[] dogs = new Animals[dogNum];
            Animals[] cats = new Animals[catNum];
            Animals[] buns = new Animals[bunNum];

            try {
                while (dogNum > 0) {
                    dogs[dogNum - 1] = new Animals();
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
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.arrayOOB();
            }

            try {
                while (catNum > 0) {
                    cats[catNum - 1] = new Animals();
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
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                AIOOBE.getStackTrace();
            }

            try {
                while (bunNum > 0) {
                    buns[bunNum - 1] = new Animals();
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
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                AIOOBE.getStackTrace();
            } catch (InputMismatchException IME) {
                EH.inputMismatch();
            }

            try {
                print("\nDogs:");
                print("Number of dogs: " + dogCount);
                if (dogCount == 0) {
                    print("User has no dogs.");
                }
                while (dogCount >= 0) {
                    String dog = dogs[dogCount - 1].getName() + ", "
                            + dogs[dogCount - 1].getAge() + " years old, "
                            + dogs[dogCount - 1].getWeight() + " pounds.";
                    print(dog);
                    dogCount--;
                }
            } catch (NullPointerException NPE) {
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.arrayOOB();
            }
            try {
                print("\nCats:");
                print("Number of cats: " + catCount);
                if (catCount == 0) {
                    print("User has no cats.");
                }
                while (catCount >= 0) {
                    String cat = cats[catCount - 1].getName() + ", "
                            + cats[catCount - 1].getAge() + " years old, "
                            + cats[catCount - 1].getWeight() + " pounds.";
                    print(cat);
                    catCount--;
                }
            } catch (NullPointerException NPE) {
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.arrayOOB();
            }
            try {
                print("\nBunnies:");
                print("Number of rabbits: " + bunCount);
                if (bunCount == 0) {
                    print("User has no rabbits.");
                }
                while (bunCount >= 0) {
                    String bun = buns[bunCount - 1].getName() + ", "
                            + buns[bunCount - 1].getAge() + " years old, "
                            + buns[bunCount - 1].getWeight() + " pounds.";
                    print(bun);
                    bunCount--;
                }
            } catch (NullPointerException NPE) {
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.inputMismatch();
            }
        } catch (InputMismatchException IME) {
            EH.inputMismatch();
        }
    }

    /**
     * This is just a handy little method to
     * use "print" instead of "System.out.println"
     * every darn time. It might be bad practice,
     * but it's so helpful.
     */
    private static void print(String s) {
        System.out.println(s);
    }
}
