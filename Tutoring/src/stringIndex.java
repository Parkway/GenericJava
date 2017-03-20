import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class stringIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase, follow by a number that has " +
                "fewer characters than the total number of letters in your word.");

        System.out.print("Phrase: ");
        String input = scn.nextLine().toLowerCase();
        int inputLength = input.length();
        System.out.print("Number(fewer than or equal to " + inputLength + "): ");
        int num = scn.nextInt();

        try {
            int index = input.charAt(num - 1);
            System.out.println("The character at position " + num + " is " + (char) index + ".");
        } catch (StringIndexOutOfBoundsException SIOOBE) {
            System.out.println("That number is higher than " + inputLength + " dumb fuck.");
        }

    }
}
