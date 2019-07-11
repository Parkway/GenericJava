import java.util.InputMismatchException;
import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/30/2017 - Tutoring
 *
 * This class demonstrates how to determine if a
 * number is odd or even. Very simple stuff.
 ***************************************************/
public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        try {
            int num = scn.nextInt();
            //If the number has a remainder of 0, is even.
            if (num % 2 == 0) {
                System.out.println("Number is even.");

                //If num has remainder of something other than zero, is odd.
            } else if (num % 2 == 1) {
                System.out.println("Number is odd.");
            } else {
                System.out.println("What did you even enter?");
            }
        } catch (InputMismatchException IME) {
            System.out.println("Invalid input.");
        }
    }
}
