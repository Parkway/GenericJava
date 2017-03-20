import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class maths {
    public static void main(String[] thiscanbeanythingalso) {
        Scanner scn = new Scanner(System.in);
        double num1,num2,sum,product,dividend,larger,smaller;

        System.out.println("Enter two numbers.");
        num1 = scn.nextDouble();
        num2 = scn.nextDouble();

        sum = num1+num2;
        product = num1*num2;
        dividend = num1/num2;
        larger = Math.max(num1, num2);
        smaller = Math.min(num1, num2);

        System.out.println(
                "The sum of these numbers is: " + sum + ",\n" +
                "The product is " + product + ",\n" +
                "The dividend is " + dividend + ",\n" +
                "The larger number is " + larger + ",\n" +
                "The smaller number is " + smaller + ".");


        int num = 5;
        double dub = 5;
        System.out.println(num + " and " + dub + " are different numbers in java.");
    }
}
