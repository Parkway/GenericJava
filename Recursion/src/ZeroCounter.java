import java.util.Scanner;

public class ZeroCounter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program counts the zeroes in the number you enter.\n");
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        zeroCheck(num);
        if (zeroCheck(num) == 1) {
            System.out.println("There is " + zeroCheck(num) + " zero in " + num);
            System.exit(0);
        } else {
            System.out.println("There are " + zeroCheck(num) + " zeroes in " + num);
            System.exit(0);
        }
    }
    private static int zeroCheck(int num) {
        int result;

        if (num < 0) {
            num = num*(-num);
            zeroCheck(num);
        }
        if (num == 0) {
            result = 1;
        } else if (num < 10 && num >= 1) {
            result = 0;
        } else if (num % 10 == 0) {
            result = zeroCheck(num / 10) + 1;
        } else {
            result = zeroCheck(num / 10);
        }
        return result;
    }
}
