import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/16/2017
 *****************************************/
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What college year are you in? 1, 2, 3, or 4?");

        int year = scn.nextInt();

        switch (year) {
            case 1:
                System.out.println("You are a freshman.");
                break;
            case 2:
                System.out.println("Number is two.");
                break;
            default:
                System.out.println("I couldn't be bothered to account for whatever you entered.");
        }
    }
}
