import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *
 * Let's you select an index from a String
 *****************************************/
public class stringIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase, follow by a number that has " +
                "fewer characters than the total number of letters in your word.");

        System.out.print("Phrase: ");
        //Input to lowercase for case issues.
        String input = scn.nextLine().toLowerCase();
        //Get length of input
        int inputLength = input.length();
        System.out.println("Please enter a number fewer than or equal to " + inputLength + ".");
        int num = scn.nextInt();

        //Try to do a thing
        try {
            //Index at char index (-1 because 0 index)
            int index = input.charAt(num - 1);
            System.out.println("The character at position " + num + " is " + (char) index + ".");
        //Catch if the number is too high for the string.
        } catch (StringIndexOutOfBoundsException SIOOBE) {
            System.out.println("That number is higher than " + inputLength + ".");
        }

    }
}
