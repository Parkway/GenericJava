/***********************************************************************
 * Created by Lance Douglas on 4/30/2017
 *
 * When comparing numbers, you use ==, >=, <=, and so on.
 * When comparing Strings, you use .equals(), .contains().
 ***********************************************************************/
public class Comparative {
    public static void main(String[] args) {

        String text = "Example";
        int number = 45;

        if (text.equals("Example")) {
            System.out.println("The String \'text\' equals example");
        }

        if (number==45) {
            System.out.println("The number is 45.");
        }

    }
}
