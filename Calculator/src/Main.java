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
        if (userinput.equals("addition")) {
            print("Lets do some addition!\n");
            print("First number? ");
            Double num1 = scn.nextDouble();
            print("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 + num2;
            print("\nThe answer is " + num3);
        } else if (userinput.equals("subtraction")) {
            print("Lets do some subtraction!\n");
            print("First number? ");
            Double num1 = scn.nextDouble();
            print("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 - num2;
            print("\nThe answer is " + num3);
        } else if (userinput.equals("dicks")) {
            print("What is your name?");
            String num4 = scn.nextLine();
            while(number >= 0) {
                print(num4 + " loves "+ myChar);
                number--; }
        } else if (userinput.equals("multiplication")) {
            print("Lets do some multiplication!\n");
            print("First number? ");
            Double num1 = scn.nextDouble();
            print("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 * num2;
            print("\nThe answer is " + num3);
        } else if (userinput.equals("division")) {
            print("\nFirst number? ");
            Double num1 = scn.nextDouble();
            print("Second number? ");
            Double num2 = scn.nextDouble();
            Double num3 = num1 / num2;
            print("\nThe answer is " + num3);
        }
        else print("Not a valid option");
        print("Do you want to do another?");
        Scanner sxm = new Scanner(System.in);
        String option = sxm.nextLine().toLowerCase();
        if(option.equals("yes")) {
            print("\n" + greet);
            Scanner newinput = new Scanner(System.in);
            main(newinput);
        } else if(option.equals("no")) {
            print("Have a nice day.");
        } else {
            print("That was a yes or no question. *rage quit*");
        }
    }

    public static void main(String[] args) {

        print(greet);
        Scanner scn = new Scanner(System.in);
        main(scn);
    }

}
