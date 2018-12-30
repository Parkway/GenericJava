/***********************************************************************
 * Created by Lance Douglas on 12/30/2018
 *
 * This class handles the various exceptions that occur
 * within the program. Each of the possible occurrences
 * has a method with an explanation for the user, and
 * a unique exit code. This is done to make diagnosing
 * a fault in the program much easier, as each issue
 * has a unique identifying number.
 *
 * inputMismatch = 9;
 * nullPointer = 99;
 * arrayOOB = 199;
 * noPets = 299
 ***********************************************************************/
package com.lance;


/**
 * Most of these should not happen. Many of them
 * do not contain any handling because simply
 * acknowledging that the exception occurred is
 * apparently good enough.
 *
 */
public class ExceptionHandler {
    void inputMismatch() {
        //Turns out, simply having it caught fixes it.
        //I guess.

        /*System.out.println("You have entered a non-numeric value.\n" +
        "This field requires an integer between\n" +
        "-2147483648 and 2147483647.\n" +
        "Please try again.");
        System.exit(9);*/
    }
    void nullPointer() {
        System.out.println("Whatever you did caused a \n" +
        "null pointer exception in the program.\n" +
        "Take a break and think about what you've done.");
        System.exit(99);
    }
    void arrayOOB() {
        //Do nothing.
    }
    void noPets() {
        System.out.println("You have no pets.\n" +
                "This is a vet's office.\n" +
                "Go home.");
        System.exit(299);
    }
}

