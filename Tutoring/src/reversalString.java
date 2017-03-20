import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/20/2017
 *****************************************/
public class reversalString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scn.nextLine();
        String reversedName = new StringBuffer(name).reverse().toString();
        System.out.println("In reverse, your name is " + reversedName);
    }
}
