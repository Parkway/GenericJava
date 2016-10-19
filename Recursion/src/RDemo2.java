import java.util.Scanner;

public class RDemo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a non negative number: ");
        int num = scn.nextInt();
        System.out.println(num + " contains " + getNumberOfZeroes(num) + " zeroes.");
    }
    private static int getNumberOfZeroes(int num) {
        int result;

        if (num == 0) {
            result = 1;
        } else if (num < 10) {
            result = 0;
        } else if (num % 10 == 0) {
            result = getNumberOfZeroes(num / 10) + 1;
        } else {
            result = getNumberOfZeroes(num / 10);
        }
        return result;
    }
}
