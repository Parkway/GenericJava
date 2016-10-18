import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String charList[] = {"can","ink","ne","ig","wh","ni","ck"};
        int charListLength = charList.length;
        int charNum = (int) (Math.random() * charListLength);
        String charName = charList[charNum];
        System.out.println("Please enter a phrase containing the letters '" + charName + "'.");
        String input = scn.nextLine().toLowerCase();
        if (input.contains(charName)) {
            System.out.println("Great, you can follow instructions!");
        } else {
            System.out.println("You had literally one job.");
        }
    }
}
