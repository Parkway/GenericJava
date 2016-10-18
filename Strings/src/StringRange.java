import java.util.Scanner;

public class StringRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a phrase: ");
        String phrase = scn.nextLine();
        int phraseLength = phrase.length();
        System.out.println("Now, enter two numbers; both less than the total number\n" +
                "of characters in your phrase, at " + phraseLength + " characters");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        for (int Char = min; Char < max; Char++) {
            int range = phrase.charAt(Char);
            System.out.print((char)range);
        }
    }
}
