/************************************************************
 * Created by Lance Douglas on 12/26/2018
 * This program takes information about a student
 * such as name, age, and student ID. This is mostly
 * a class to demonstrate object oriented Java.
 * It also records the student information to a text file.
 ***********************************************************/

package com.lance;

import java.io.*;

class Student {


    private String name, gender;
    private int ID, age;

    // Setting string $out to that, which formats
    // and prints the student info when called.

    /**
    This method is called after each value has been entered
    in Main(), and takes the name String, and ID and age ints.
     */
    void setInfo (String name, String gender, int ID, int age) {
    this.name = name;
    this.gender = gender;
    this.ID = ID;
    this.age = age;
    }


    private String getName () {
        return this.name;
    }
    private String getGender() {
        return this.gender;
    }
    private int getID () {
        return this.ID;
    }
    private int getAge () {
        return this.age;
    }

    /**
    The output method sets up the FileWriter for writing to output.txt
    The first two lines set up the file and printWriters, and the next
    two lines write the $out String to the file and console, respectively.
    Finally, to write to an external file, the method must be configured
    to handle an IOException.
     */
    String output () {
        try {
            String out, write;

            out = "The following information has been recorded:" +
                    "\nName: " + getName() + " \nGender: " + getGender() +
                    " \nID: " + getID() + " \nAge: " + getAge();
            write = "\nName: " + getName() + " \nGender: " + getGender() +
                    " \nID: " + getID() + " \nAge: " + getAge();

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.append(write);

            System.out.println(out);
            writer.close();

            System.exit(1337);

        } catch (IOException IOE) {
            IOE.printStackTrace();
        }
        return null;
    }
}
