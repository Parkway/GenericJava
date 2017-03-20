import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Are you a college student? Yes/No");
        String student = scn.nextLine();

        switch(student) {
            case "Yes" :
                System.out.println("Yes, you are a college student.");
                break;
            case "No" :
                System.out.println("No, you are not a college student.");
                break;
            default:
                System.out.println("Try again, and please enter 'Yes' or 'No'");
        }
    }
}
