import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *
 * Displays length of string with and
 * without spaces.
 *****************************************/
public class stringLength {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase.");

        //Length of String is string.length
        String phrase = scn.nextLine();
        int phraseLength = phrase.length();
        System.out.println("With spaces, \"" + phrase + "\"" + " is " + phraseLength + " characters long.");

        //Without spaces, length of string is string.length
        String phraseNoSpaces = phrase.replace(" ","");
        int phraseLengthNoSpaces = phraseNoSpaces.length();
        System.out.println("Without spaces, \"" + phrase + "\"" + " is " + phraseLengthNoSpaces + " characters long.");
    }
}
