import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("What would you like to do?");
        Scanner scn = new Scanner(System.in);
            String userinput = scn.nextLine();
            if (userinput.equals("Addition")) {
                System.out.println("Lets do some addition!");
                System.out.println(" ");
                System.out.println("First number? ");
                Double num1 = scn.nextDouble();
                System.out.println("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 + num2;
                System.out.println(" ");
                System.out.println("The answer is " + num3);
            } else if (userinput.equals("Subtraction")) {
                System.out.println("Lets do some subtraction!");
                System.out.println(" ");
                System.out.println("First number? ");
                Double num1 = scn.nextDouble();
                System.out.println("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 - num2;
                System.out.println(" ");
                System.out.println("The answer is " + num3);
            } else if (userinput.equals("Multiplication")) {
                System.out.println("Lets do some multiplication!");
                System.out.println(" ");
                System.out.println("First number? ");
                Double num1 = scn.nextDouble();
                System.out.println("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 * num2;
                System.out.println(" ");
                System.out.println("The answer is " + num3);
            } else if (userinput.equals("Division")) {
                System.out.println(" ");
                System.out.println("First number? ");
                Double num1 = scn.nextDouble();
                System.out.println("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 / num2;
                System.out.println(" ");
                System.out.println("The answer is " + num3);
            }
            System.out.println("Do you want to do another?");
            Scanner sxm = new Scanner(System.in);
            String option = sxm.nextLine();
            if(option.equals("Yes")) {
               System.out.println("Well I don't know how to do that yet, so fuck off.");
            } else if(option.equals("No")) {
                System.out.println("Have a nice day.");
            } else {
                System.out.println("That was a yes or no question. *rage quite*");
            }
        }



    }
