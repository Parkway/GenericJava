import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Are you a college student? Yes/No");
        String student = scn.nextLine();
        if (student.equals("Yes")) {
            System.out.println("Yes, you are a college student.");
        } else if (student.equals("No")) {
            System.out.println("No, you are not a college student.");
        } else {
            System.out.println("Please enter 'Yes' or 'No'.");
        }
    }
}
