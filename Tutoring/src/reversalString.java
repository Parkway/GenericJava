import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/20/2017
 *
 * Just tells you your name backwards.
 *****************************************/
public class reversalString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scn.nextLine();
        //Reverses String.
        String reversedName = new StringBuffer(name).reverse().toString();
        System.out.println("In reverse, your name is " + reversedName);
    }
}
