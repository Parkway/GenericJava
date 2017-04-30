import java.util.InputMismatchException;
import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/30/2017 - Tutoring *
 ***************************************************/
public class Exceptions {
    public static void main(String[] args) {
        // Try to do this code.
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scn.nextInt();
            System.out.println("You entered: " + num);

        // Catch the listed exceptions if they occur, and do this instead of crashing.
        } catch (InputMismatchException nameOfException) {
            System.out.println("Please enter a number, not text.");
            //Prints what caused issue. Unnecessary as we already know it was an IME.
            nameOfException.getStackTrace();
        }
    }
}
