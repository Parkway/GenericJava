import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First number: ");
        Scanner scn = new Scanner (System.in);
        long a1 = scn.nextLong();
        System.out.println("Second number: ");
        long a2 = scn.nextLong();
        long a3 = a1 + a2;
        System.out.println(" ");
        System.out.println("This answer is: " + a3);
    }
}
