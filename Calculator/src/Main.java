import java.util.Scanner;

public class Main {

    public static String greet = "What would you like to do? Available options are: \nAddition, Subtraction, Multiplication, Division";

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(Scanner scn){
        int number = 50;
        String myChar = "\n8==D~";
        String userinput = scn.nextLine().toLowerCase();
        switch (userinput) {
            case "addition": {
                print("Lets do some addition!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 + num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "subtraction": {
                print("Lets do some subtraction!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 - num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "dicks":
                print("What is your name?");
                String num4 = scn.nextLine();
                while (number >= 0) {
                    print(num4 + " loves " + myChar);
                    number--;
                }
                break;
            case "multiplication": {
                print("Lets do some multiplication!\n");
                print("First number? ");
                Double num1 = scn.nextDouble();
                print("Second number? ");
                Double num2 = scn.nextDouble();
                Double num3 = num1 * num2;
                print("\nThe answer is " + num3);
                break;
            }
            case "division": {
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