import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/16/2017
 *****************************************/
public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num > 50) {
            System.out.println("The number is greater than or equal ot fifty.");
        }
    }
}
