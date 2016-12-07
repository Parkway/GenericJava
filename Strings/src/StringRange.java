import java.util.InputMismatchException;
import java.util.Scanner;

public class StringRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program allows you to retrieve a portion of the entered text by entering a range of two numbers.\n");
        System.out.print("Please enter a phrase: ");
        String phrase = scn.nextLine();
        int phraseLength = phrase.length();
        System.out.println("Now, enter two numbers; both less than the total number\n" +
                "of characters in your phrase, at " + phraseLength + " characters");
        try {
            int num1 = scn.nextInt();
            num1 = num1 - 1;
            int num2 = scn.nextInt();
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            System.out.print("You have selected: '");
            for (int Char = min; Char < max; Char++) {
                int range = phrase.charAt(Char);
                System.out.print((char) range);
            }
            System.out.print("'");
        } catch (StringIndexOutOfBoundsException SIOOBE) {
            System.out.println("One of the numbers is higher than " + phraseLength + "." +
                    "\nPlease try again.");
        } catch (InputMismatchException IME) {
            System.out.println("Okay, so that wasn't even a number. Prick.");
        }
    }
}
