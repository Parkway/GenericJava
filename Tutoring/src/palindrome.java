import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/20/2017
 *****************************************/
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase, I will determine if " +
                "\nit is a palindrome or not.");
        String phrase = scn.nextLine();
        String reversedPhrase = new StringBuffer(phrase).reverse().toString();
        if (phrase.equals(reversedPhrase)) {
            System.out.println("Congrats, " + phrase + " is a palindrome!");
        } else {
            System.out.println("Unfortunately, " + phrase + " is not a palindrome.");
        }
    }
}
