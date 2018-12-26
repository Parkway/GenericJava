import java.util.Scanner;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Are you a college student? Yes/No");
        String student = scn.nextLine();

        //switch (input variable)
        switch(student) {
            //cases for each option
            case "Yes" :
                System.out.println("You entered: \"Yes\".");
                //Close switch with break, or will continue.
                break;
            case "No" :
                System.out.println("You entered: \"No\".");
                break;
            //Final else in case no matching input
            default:
                System.out.println("Try again, and please enter 'Yes' or 'No'");
        }
    }
}
