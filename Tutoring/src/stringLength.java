import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class stringLength {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase.");

        String phrase = scn.nextLine();
        int phraseLength = phrase.length();
        System.out.println("With spaces, \"" + phrase + "\"" + " is " + phraseLength + " characters long.");

        String phraseNoSpaces = phrase.replace(" ","");
        int phraseLengthNoSpaces = phraseNoSpaces.length();
        System.out.println("Without spaces, \"" + phrase + "\"" + " is " + phraseLengthNoSpaces + " characters long.");
    }
}
