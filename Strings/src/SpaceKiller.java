import java.util.Scanner;

public class SpaceKiller {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("This program removes all spaces from any input.\n" +
                "Enter a phrase: ");
        String input = scn.nextLine();
        String inputFix = input.replace(" ","");
        System.out.print("Your new phrase is: " + inputFix);
    }
}
