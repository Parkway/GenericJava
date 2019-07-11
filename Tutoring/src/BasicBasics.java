/*****************************************
 * Created by Lance Douglas on 2/1/2019
 *
 * This is a very basic class to highlight
 * and explain the fundamentals of java,
 * such as declaring/initializing
 * variables, simple output, and so on.
 *****************************************/
public class BasicBasics {
    public static void main(String[] args) {

        /*
        To declare a variable, you use
        dataType $name; which says
        "There is now a data type called
        $name.
        */

        //Declaring a String
        String text = "Text must be within double quotation marks.";
        //Char
        char grade = 'A'; //Must be in single quotes.

        //Declaring an integer value
        int num = 1000; //Range from -2,141,000,000 to 2,141,000,000
        //double
        double doubleNum = 25.234; //numbers with decimals
        //long
        long bigNum = 99999999999999999L; //designated by L

        /*
        To display output to the console, you use the
        phrase `System.out.println()`.
         */
        //Output original text
        System.out.println("This is a user output sample.");
        //Output predefined string
        System.out.println(text);
        System.out.println(grade);
        System.out.println(num + doubleNum);
    }
}
