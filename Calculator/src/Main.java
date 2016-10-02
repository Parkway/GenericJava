import java.util.Scanner;

public class Main {

    private static String greet = "What would you like to do? Available options are: \nAddition[1], " +
            "\nSubtraction[2], " +
            "\nMultiplication[3], " +
            "\nDivision[4]";

    private static void print(String s) {
        System.out.println(s);
    }

    private static void main(Scanner scn){
        String userinput = scn.nextLine().toLowerCase();
        switch (userinput) {
            case "addition":
            case "1": {
                print("Lets do some addition!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 + num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "subtraction":
            case "2": {
                print("Lets do some subtraction!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 - num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "multiplication":
            case "3": {
                print("Lets do some multiplication!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 * num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "division":
            case "4": {
                print("\nFirst number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 / num2;
                print("\nThe answer is " + num3);
                break;
            }
            default:
                print("Not a valid option");
                break;
        }
        print("Do you want to do another?");
        Scanner sxm = new Scanner(System.in);
        String option = sxm.nextLine().toLowerCase();
        switch (option) {
            case "yes":
            case "yeah":
                print("\n" + greet);
                Scanner newinput = new Scanner(System.in);
                main(newinput);
                break;
            case "no":
            case "nope":
                print("Have a nice day.");
                break;
            default:
                print("That was a yes or no question. *rage quit*");
                break;
        }
    }
    public static void main(String[] args) {

        print(greet);
        Scanner scn = new Scanner(System.in);
        main(scn);
    }
}