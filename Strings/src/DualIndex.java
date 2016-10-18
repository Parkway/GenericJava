import java.util.Scanner;

public class DualIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter a phrase: ");
        String str = scn.nextLine().toLowerCase();
        System.out.println("Now enter two numbers, both less than the length of your string.\n" +
                "For reference, your string is " + str.length() + " characters long.\n" +
                "Hit enter between numbers.");
        try {
            int num = scn.nextInt();
            int num2 = scn.nextInt();
            System.out.println("Original String : " + str);
            int cHAR = str.charAt(num);
            int nextChar = str.charAt(num2);
            System.out.println("The characters you've extracted are: " + (char)cHAR + " and " + (char)nextChar);
        } catch (StringIndexOutOfBoundsException SIOOBE) {
            System.out.println("I told you to keep the numbers in range.");
        }
    }
}

