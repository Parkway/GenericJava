import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        replacer();
    }
    private static void replacer() {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program allows you to replace input with other input.\n" +
                "Be aware, input is case sensitive. example != eXaMPle.");
        System.out.print("Enter a phrase: ");
        String phrase = scn.nextLine();
        System.out.println("What character would you like to replace?");
        String let = scn.nextLine();
        if (phrase.contains(let)) {
            System.out.println("What would you like to replace it with?");
            String newLet = scn.nextLine();
            String newPhrase = phrase.replace(let, newLet);
            System.out.println("\nOriginal String: " + phrase);
            System.out.println("New String: " + newPhrase);
            System.out.print("Would you like to convert more characters?");
            String again = scn.nextLine().toLowerCase();
            if (again.contains("y")) {
                replacer();
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("Your input does not contain " + let + ".\n" +
                    "Unable to process." +
                    "Would you like to try again?");
                    String again = scn.nextLine().toLowerCase();
                    if (again.contains("y")) {
                        replacer();
                    } else {
                        System.exit(0);
                    }
        }
    }
}

