import java.util.Scanner;

public class posOrNeg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number.");
        double num = scn.nextDouble();
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }
    }
}
