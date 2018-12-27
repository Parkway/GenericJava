package com.lance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the student's full name: ");
        String name = scn.nextLine();
        System.out.println("Enter the student's ID: ");
        int ID = scn.nextInt();
        System.out.println("Enter the student's age: ");
        int age = scn.nextInt();

        student.setInfo(name, ID, age);
        student.output();

        System.exit(000);
    }
}
