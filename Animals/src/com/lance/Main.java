/**
 * @Version 1.0
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

        //New scanner scn, for user input.
        Scanner scn = new Scanner(System.in);

        //Dedicated class for handling any exceptions
        //thrown by Main{}
        ExceptionHandler EH = new ExceptionHandler();

        /**
         * This section simply prompts for the
         * number of each type of pet, and
         * adds each to the corresponding
         * $petNum integer.
         *
         * The entire selection is surrounded
         * by a catch block because that's the
         * only way I can think of handling an
         * inputMismatch in this first section.
         * Otherwise, variables get excluded
         * and the whole thing just goes to hell.
         */
        try {
            print("How many dogs do you have?");
            dogNum = scn.nextInt();
            print("How many cats?");
            catNum = scn.nextInt();
            print("How many rabbits?");
            bunNum = scn.nextInt();

            /*
            If user has no pets,
            leave the pet place. Duh.
            */
            if (dogNum == 0 &&
                catNum == 0 &&
                bunNum == 0) {
                EH.noPets();
            }

            /*
            Setting $petCount to match $petNum,
            This way I can use the original pet
            values at the end for the while loop
            print out of all pets inputted.
            */
            dogCount = dogNum;
            catCount = catNum;
            bunCount = bunNum;

            /**
             * Assigning an array of objects to
             * pet type. Currently, the whole issue
             * of arrays starting at 0 is really
             * dicking up the rest of my program.

             * USER INPUT IN ARRAYS IS ALWAYS N-1

             * Example: three dogs, array of three
             * Animals[] dogs = new Animals[3]
             * dogs[0]
             * dogs[1]
             * dogs[2]
             * dogs[3] -- OOB, fatal
             */

            Animals[] dogs = new Animals[dogNum];
            Animals[] cats = new Animals[catNum];
            Animals[] buns = new Animals[bunNum];

            /**
             * These are embedded in try/catch blocks
             * because they throw all sorts of shit
             * that doesn't actually cause issues with
             * program usage.
             *
             * While dogNum is greater than zero, get
             * the name, age, and weight of the dog,
             * decrement the count, and do it again.
             *
             * In this way, the user can enter info
             * about each one of their dogs, cats,
             * or rabbits.
             */
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

                    /**
                     * Remember, dogNum - 1 because dogNum
                     * var is one higher than the array index
                     * range, and will throw an AIOOBE.
                     */
                    dogs[dogNum - 1].setName(name);
                    dogs[dogNum - 1].setAge(age);
                    dogs[dogNum - 1].setWeight(weight);

                    //Decrement dogNum for next input.
                    dogNum--;
                }
                /**
                 * Like I said, it throws all sorts of shit,
                 * I don't even know how I could cause a Null
                 * Pointer Exception, but here we are.
                 *
                 * In each catch{}, the actual exception is
                 * handled by ExceptionHandler.java, and that
                 * object is called via EH.handlingMethod.
                 */
            } catch (NullPointerException NPE) {
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.arrayOOB();
            }

            //Same as above, but now with the cats.

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

            //Rabbits this time.
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

            /**
             * This here bad boy is for if the user
             * tries to enter letters instead of
             * numbers in integer inputs.
             */
            } catch (InputMismatchException IME) {
                EH.inputMismatch();
            }

            /**
             * This section handles the output of each pet.
             * A string is created to format and display the
             * name, age, and weight for each animal. If there
             * are two dogs, the output lists two dogs with
             * their respective info.
             */
            try {
                print("\nDogs:");
                print("Number of dogs: " + dogCount);

                //In case user has no puppers.
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

            //Random exceptions that just happen when they
            //feel like it, I guess.
            } catch (NullPointerException NPE) {
                EH.nullPointer();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                EH.arrayOOB();
            }

            //Same as above, but with cats.
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

            //Same shit, different animal.
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
                EH.arrayOOB();
            }
        //I don't know, sometimes that just happens.
        } catch (InputMismatchException IME) {
           EH.inputMismatch();
        }

        //Exit Code 999 = Program Executed Succesfully
        System.exit(999);

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
