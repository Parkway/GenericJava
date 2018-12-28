package com.lance;

public class Main {

    public static void main(String[] args) {
        Animals [] cats = new Animals[3];
        int var = 0;

        cats[0] = new Animals();
        cats[1] = new Animals();
        cats[2] = new Animals();

        cats[0].setName("Harold");
        cats[1].setName("Jakob");
        cats[2].setName("Pete");

        cats[0].setAge(2);
        cats[1].setAge(7);
        cats[2].setAge(9);

        cats[0].setWeight(9);
        cats[1].setWeight(15);
        cats[2].setWeight(13);


        while (var < 3) {
            String cat = cats[var].getName() + ", " + cats[var].getAge() + " years old, "
                    + cats[var].getWeight() + " pounds.\n";
            var++;
            System.out.println(cat);
        }
    }
}
