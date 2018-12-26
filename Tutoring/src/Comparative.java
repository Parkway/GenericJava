import java.util.Scanner;

/***********************************************************************
 * Created by Lance Douglas on 4/30/2017
 *
 * When comparing numbers, you use ==, >=, <=, and so on.
 * When comparing Strings, you use .equals(), .contains().
 ***********************************************************************/
public class Comparative {
    public static void main(String[] args) {

        String greater = "This number is greater than 50.";
        String lesser = "This number is less than 50.";

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        //This is called a ternary operator.
        String newNum = num >= 50 ? greater : lesser;

        System.out.println(newNum);


    }
}
