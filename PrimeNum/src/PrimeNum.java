import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("This program will tell you if a program is prime or not.");
        Scanner scn = new Scanner(System.in);
        boolean prime;
        int inputNum;
        while (true) {
            System.out.println("Please enter an integer. -1 to quit.");
            inputNum = scn.nextInt();
            if (inputNum % 2 == 0) {
                prime = false;
                System.out.println(prime);
            } else if (inputNum % 3 == 0) {
                prime = false;
                System.out.println(prime);
            }
            else if (inputNum == -1) {
                break;
            } else {
                prime = true;
                System.out.println(prime);
            }
        }
    }
}
