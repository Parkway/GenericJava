import java.util.InputMismatchException;
import java.util.Scanner;

/***********************************************************************
 * Created by Lance Douglas on 4/30/2017
 ***********************************************************************/
public class Conditions {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);

            String gNum = "The greater number is: ";

            System.out.println("Enter two numbers: ");
            int num2 = scn.nextInt();
            int num3 = scn.nextInt();

            int result = num2 > num3 ? num2 : num3;

            System.out.println(gNum + result);
        } catch (InputMismatchException IME) {
            System.out.println("That's not a number, try again.");
        } finally {
            System.err.println("Goodbye.");
        }

    }
}
