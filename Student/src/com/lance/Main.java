package com.lance;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialize Student and Scanner objects.
        Student student = new Student();
        Scanner scn = new Scanner(System.in);

        /**Pretty standard stuff here, just taking user inputs.
         * @param name, gender, ID, age.
         */
        try {
            System.out.println("Enter the student's full name: ");
            String name = scn.nextLine();
            System.out.println("Enter the student's gender: ");
            String gender = scn.nextLine();
            System.out.println("Enter the student's ID: ");
            int ID = scn.nextInt();
            System.out.println("Enter the student's age: ");
            int age = scn.nextInt();

            /**
             * First use of student object. Sends the input
             * to student.setInfo, or the setInfo() method in
             * the Student class. In the call, I pass the
             * four user ins as parameters.
             */
            student.setInfo(name, gender, ID, age);
            student.output();

        } catch (InputMismatchException IME) {
            System.out.println("Student age and ID are numeric values only.");
        }
    }
}
