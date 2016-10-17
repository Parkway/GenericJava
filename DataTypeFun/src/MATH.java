import java.util.Scanner;

public class MATH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers.\n" +
                "This program will tell you various things about the numbers.");

        System.out.print("First number: ");
        double num1 = scn.nextDouble();
        System.out.print("Second number: ");
        double num2 = scn.nextDouble();

        double add = num1 + num2;
        double product = num1 * num2;
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        double average = (num1 + num2) / 2;
        double diff = max - min;
        double dividend = num1 / num2;

        System.out.println("Sum of numbers: " + add +
                    "\nDifference of numbers: " + diff +
                    "\nProduct of numbers: " + product +
                    "\nLarger number: " + max +
                    "\nSmaller number: " + min +
                    "\nAverage of numbers: " + average +
                    "\n" + num1 + " divided by " + num2 + " is: " + dividend);

    }
}
