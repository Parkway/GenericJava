import java.util.Scanner;

public class UnlimitedIndex {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program allows you to pull certain characters from a string,\n" +
                "based on where they are located in a 0-*phrase-length* count.");
        System.out.print("Please enter a phrase: ");
        String phrase = scn.nextLine();
        int phraseLen = phrase.length();
        System.out.println("Keep the numbers below " + phraseLen + ".");
        System.out.print("Please enter a number.\nThis is the amount of chars you want to extract: ");
        int amount = scn.nextInt();
        System.out.print("Now, what index locations do you want to extract: ");

        while (amount > 0) {
            int charIndex = scn.nextInt() - 1;
            int charNum = phrase.charAt(charIndex++);
            System.out.println("At index " + charIndex + ", the character is '" + (char)charNum + "' ");
            Thread.sleep(500);
            amount--;
        }
    }
}
