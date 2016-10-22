import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("This program computes the second, third, and fourth powers of any input.\n" +
                "Then, lets you select the power to use.");
        System.out.print("Enter a number: ");
        double num = scn.nextDouble();
        counted(num);
        System.out.print("Now, the number you want to power " + num + " by: ");
        double pow = scn.nextDouble();
        exact(num, pow);
    }
     private static void counted(double num) {
        int count = 2;
        while (count <= 5) {
            double powered = Math.pow(num, count);
            Long toPowered = Double.doubleToLongBits(powered);
            if (count == 2) {
                System.out.println(num + " squared is " + toPowered);
            } else if (count == 3) {
                System.out.println(num + " cubed is " + toPowered);
            } else {
                System.out.println("To the power of " + count + ", " + num + " is " + toPowered + ".");
            }
            count++;
        }
    }
    private static void exact(double num, double pow) {
        double toPow = Math.pow(num, pow);
        Long tooPow = Double.doubleToLongBits(toPow);
        System.out.println(num + " to the power of " + pow + " is " + tooPow + ".");
    }
}
