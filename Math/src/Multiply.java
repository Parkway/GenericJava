import java.util.Scanner;

/***************************************************
 * Created by Lance Douglas on 4/29/2017 - Math *
 ***************************************************/
public class Multiply {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter two numbers to multiply:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int total = num1*num2;
        System.out.println(num1 + "x" + num2 + "=" + total);
    }
}
