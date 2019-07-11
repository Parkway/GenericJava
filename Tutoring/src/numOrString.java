import java.util.Scanner;

/***********************************************************************
 * Created by Lance Douglas on 4/30/2017
 *
 * This program tells you what kind of text you entered, and whether
 * it is a String or Number. I did it in kind of a cheap way.
 * Instead of actually checking, it simply expects an integer or double,
 * and throws an error which prints String if it's not a number.
 ***********************************************************************/
public class numOrString {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter something, and I will say if it's a number or letter: ");
            String input = scn.next();
            double inputDouble = Double.parseDouble(input);
            System.out.println("You entered a number.");
        } catch (NumberFormatException NFE) {
            System.out.println("You entered a String.");

        }
    }
}
