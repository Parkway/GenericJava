import java.util.Scanner;

public class ConsOrVow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a single letter.");
        String letter = scn.nextLine().toLowerCase();
        if (letter.equals("a") 
                || letter.equals("e")
                || letter.equals("i") 
                || letter.equals("o")
                || letter .equals("u")) {
            System.out.println(letter + " is a vowel.");
        } else if (letter.equals("y")) {
            System.out.println(letter + " can be a vowel or a consonant");
        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
