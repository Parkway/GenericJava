import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program computes the second, third, and fourth powers of any input.");
        double num = scn.nextDouble();
        double squared = num * num;
        double cubed = num * num * num;
        double fourthed = num * num * num * num;
        System.out.println("Squared, " + num + " is " + squared + ".\n" +
                "Cubed, " + num + " is " + cubed + ".\n" +
                "Fourthed, " + num + " is " + fourthed + ".");
    }
}
