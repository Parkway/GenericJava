import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/29/2017 - Math *
 ***************************************************/

public class Multiply { //Class

    public static void main(String[] args) { //main method

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter two numbers to multiply:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int total = num1*num2;
        print(num1 + "x" + num2 + "=" + total);

    }
    public static void print(String s) {
        System.out.println(s);
    }
}
