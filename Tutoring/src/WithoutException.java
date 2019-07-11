/*****************************************
 * Created by Lance Douglas on 1/31/2019
 *****************************************/
import java.util.*;
public class WithoutException {

    static int divider(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //For fun, enter a non-integer value, like a string.
        System.out.println("Enter a numerator: ");
        int topNum = scn.nextInt();

        //For fun, divide by 0
        System.out.println("Enter a denominator: ");
        int botNum = scn.nextInt();

        //Pass both values to divider method,
        //store return value to int named result
        int result = divider(topNum, botNum);


        System.out.printf("\nResult: %d / %d = %d", topNum, botNum, result);
    }
}
