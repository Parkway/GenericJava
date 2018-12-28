/**
 * This class is a demonstration of object oriented programming with Java
 * using arrays of both cats and dogs. It counts for three dogs and three
 * cats, each of which are assigned a name, age, and weight.
 */

package com.lance;

public class Main {

    public static void main(String[] args) {
        /**
         * I am declaring three new objects
         * from the Animals class.
         * Cats, dogs, and buns. Oh my!
         */
        Animals [] cats = new Animals[3];
        Animals [] dogs = new Animals[3];
        Animals [] buns = new Animals[2];

        /**
         * This is all about defining the first array
         * entry, or in this case, cat 0. First we 
         * declare each instance of cat() as an object,
         * and then assign values via the setStuff methods.
         * Cat 0 is a new cat, his name is Harold, he's two
         * years old, and 9 pounds.
         */
        
        cats[0] = new Animals();
        cats[0].setName("Harold");
        cats[0].setAge(2);
        cats[0].setWeight(9);

        cats[1] = new Animals();
        cats[1].setName("Jakob");
        cats[1].setAge(7);
        cats[1].setWeight(15);

        cats[2] = new Animals();
        cats[2].setName("Pete");
        cats[2].setAge(9);
        cats[2].setWeight(13);

        //Same thing as above, but dogs now.
        dogs[0] = new Animals();
        dogs[0].setName("Fido");
        dogs[0].setAge(14);
        dogs[0].setWeight(85);

        dogs[1] = new Animals();
        dogs[1].setName("Hitler");
        dogs[1].setAge(2);
        dogs[1].setWeight(140);

        dogs[2] = new Animals();
        dogs[2].setName("Spot");
        dogs[2].setAge(3);
        dogs[2].setWeight(30);

        //Rabbits
        buns[0] = new Animals();
        buns[0].setName("Harvey");
        buns[0].setAge(2);
        buns[0].setWeight(3);

        buns[1] = new Animals();
        buns[1].setName("Theodore");
        buns[1].setAge(1);
        buns[1].setWeight(4);
        
        /**
         * These are for the following while and
         * do while loops , respectively. The third
         * is a for loop, which defines the value
         * of the variable when the loop is
         * instantiated. */
        int catCount = 0;
        int dogCount = 0;
        int bunCount;

        /**
         * These loops each take the animal value
         * and incorporate them into
         */
        System.out.println("Cats:");
        while (catCount < 3) {
            String cat = cats[catCount].getName() + ", " + cats[catCount].getAge() + " years old, "
                    + cats[catCount].getWeight() + " pounds.";
            catCount++;
            System.out.println(cat);
        }

        System.out.println("\nDogs:");
        do {
            String dog = dogs[dogCount].getName() + ", " +
                    dogs[dogCount].getAge() + " years old, " +
                    dogs[dogCount].getWeight() + " pounds.";

            System.out.println(dog);
            dogCount++;

        } while (dogCount < 3);

        System.out.println("\nBunnies:");
        for (bunCount = 0; bunCount < 2; bunCount++) {
            String bun = buns[bunCount].getName() + ", " +
                    buns[bunCount].getAge() + " years old, "
                    + buns[bunCount].getWeight() + " pounds.";
            System.out.println(bun);

        }

    }
}
