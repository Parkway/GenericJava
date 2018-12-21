package com.lance;

public class Main {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        greeter.text = "Hi";
        greeter.greet("Carl");
        greeter.greet("Peter");
        greeter.text = "Hello programmer";
        greeter.greet("Richard");

    }
}
