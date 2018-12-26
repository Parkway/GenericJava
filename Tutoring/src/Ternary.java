import java.util.Scanner;

/***********************************************************************
 * Created by Lance Douglas on 12/26/2018
 * This class demonstrates a ternary conditional operator,
 * which is a handy way to decrease the footprint of an if else statement.
 ***********************************************************************/

public class Ternary {
    public static void main(String[] args) {
        int a, b, result;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = scn.nextInt();
        b = scn.nextInt();


        //if a is greater than b, print a, else print b
        result = a > b ? a : b;

        System.out.println("The greater number is: " + result);
    }
}
