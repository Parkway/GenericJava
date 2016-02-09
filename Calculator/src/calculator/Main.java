package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("What would you like to do?");
        Scanner scn = new Scanner(System.in);
        String A = "Addition";
        String S = "Subtraction";
        String M = "Multiplication";
        String D = "Division";
        String userinput = scn.nextLine();
        if (userinput.equals(A)){
            System.out.println("Lets do some addition!");
            System.out.println(" ");
            System.out.println("First number? ");
            Double num1 = scn.nextDouble();
            System.out.println("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 + num2;
            System.out.println(" ");
            System.out.println("The answer is" + num3);
        } else if (userinput.equals(S)){
            System.out.println("Lets do some subtraction!");
            System.out.println(" ");
            System.out.println("First number? ");
            Double num1 = scn.nextDouble();
            System.out.println("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 - num2;
            System.out.println(" ");
            System.out.println("The answer is" + num3);
        } else if (userinput.equals(M)) {
            System.out.println("Lets do some multiplication!");
            System.out.println(" ");
            System.out.println("First number? ");
            Double num1 = scn.nextDouble();
            System.out.println("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 * num2;
            System.out.println(" ");
            System.out.println("The answer is" + num3);
        } else if (userinput.equals(D)) {
            System.out.println(" ");
            System.out.println("First number? ");
            Double num1 = scn.nextDouble();
            System.out.println("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 / num2;
            System.out.println(" ");
            System.out.println("The answer is" + num3);
        }
    }
}
