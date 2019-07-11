import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/20/2017
 *
 * Checks if String is a palindrome.
 *****************************************/
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase, I will determine if " +
                "\nit is a palindrome or not.");

        //Accept input, convert to lower case.
        String phrase = scn.nextLine().toLowerCase();
        //StringBuffer to reverse phrase.
        String reversedPhrase = new StringBuffer(phrase).reverse().toString();
        //If original.equals(reverse), than its a palindrome
        if (phrase.equals(reversedPhrase)) {
            System.out.println("Congrats, \"" + phrase + "\" is a palindrome!");
        //Else it isn't
        } else {
            System.out.println("Unfortunately, \"" + phrase + "\" is not a palindrome.");
        }
    }
}