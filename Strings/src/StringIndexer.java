import java.util.Scanner;

public class StringIndexer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a phrase and a number less than or equal to the amount of letters in the phrase.");
        try {
            System.out.print("Phrase: ");
            String input = scn.nextLine().toLowerCase();
            System.out.print("Number: ");
            int num = scn.nextInt();
            int index = input.charAt(num - 1);
            System.out.println("The character at position " + num + " is " + (char) index);
        } catch(StringIndexOutOfBoundsException SIOOBE) {
            System.out.println("This number is out of bounds, please try again.");
        }
    }
}
