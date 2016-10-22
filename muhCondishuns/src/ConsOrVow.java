import java.util.Scanner;

public class ConsOrVow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a single letter.");
        String letter = scn.nextLine();
        if (letter.equals("a") || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o")
                || letter .equalsIgnoreCase("u")) {
            System.out.println(letter + " is a vowel.");
        } else if (letter.equalsIgnoreCase("y")) {
            System.out.println(letter + " can be a vowel or a consonant");
        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
