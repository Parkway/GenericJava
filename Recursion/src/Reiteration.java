import java.util.Scanner;

public class Reiteration {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        displaySharp(num);
    }
    private static void displaySharp(int num) {
        while (num > 0) {
            System.out.print("#");
            num--;
        }
        System.out.println();
    }
}
