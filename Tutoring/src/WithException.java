import java.util.InputMismatchException;
import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/30/2017 - Tutoring *
 ***************************************************/
public class WithException {

    static int quotient (int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean continueLoop = true;

        do {// Try to do this code.
            try {
                System.out.println("Enter a numerator: ");
                int topNum = scn.nextInt();
                System.out.println("Enter a denominator: ");
                int botNum = scn.nextInt();
                int result = quotient(topNum, botNum);
                System.out.printf("\nResult: %d / %d = %d", topNum, botNum, result);
                continueLoop = false;

            // Catch the listed exceptions if they occur,
            // and execute nested code instead of crashing.
            } catch (InputMismatchException IME) {
                System.err.printf("Exception: %s\n", IME);
                scn.nextLine();
                System.out.println("Enter only integers.\n");
            } catch (ArithmeticException AE) {
                System.err.printf("Exception: %s\n", AE);
                scn.nextLine();
                System.out.println("You can't divide by zero.\n");
            } catch (Exception exception) {
                System.err.println("Don't do that.\n");
            } finally {
                System.out.println("\n");
            }
        } while (continueLoop);
    }
}
