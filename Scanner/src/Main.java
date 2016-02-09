import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First number: ");
        Scanner scn = new Scanner (System.in);
        int a1 = scn.nextInt();
        System.out.println("Second number: ");
        int a2 = scn.nextInt();
        int a3 = a1 + a2;
        System.out.println(a3);
    }
}
