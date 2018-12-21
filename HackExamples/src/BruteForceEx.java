import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/***********************************************************************
 * Created by Lance Douglas on 9/29/2017
 ***********************************************************************/
public class BruteForceEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
            Array of top 25 most used passwords.
         */
        List<String> cmnPswds = Arrays.asList("password","123456","12345678","1234" +
                "qwerty","12345","dragon","pussy","baseball","football" +
                "letmein","monkey","696969","abc123","mustang","micheal" +
                "shadow","master","jennifer","111111","2000","jordan" +
                "superman","harley","1234567");
        System.out.print("Enter a password: ");
        String pswd = scn.nextLine();
        /*
        Boolean for whether or not user input is found in array.
         */
        boolean contains = cmnPswds.contains(pswd);
        /*
        If password is in list, bad user. If not, good user.
         */
        if (contains) {
            System.out.println("Your password is in the top 25 passwords of 2016\n" +
                    "and will be easily brute forced in mere seconds.\n" +
                    "Consider using something stronger.");
        } else {
            System.out.println("Your password is not in the top 25 most used passwords list,\n" +
                    "but that still does not mean you are safe.");
        }
    System.out.println("Consider reading this article: " +
            "\nhttp://www.practicallynetworked.com/sharing/good_passwords.htm");
    }
}

