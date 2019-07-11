/*****************************************
 * Created by Lance Douglas on 2/1/2019
 *****************************************/
public class Arrays {
    public static void main(String[] args) throws InterruptedException {

        /*
        This is one example of an array declaration.
        I am creating an array with [6] values, ranging
        from 0-5, or {0, 1, 2, 3, 4, 5}. Below, I am
        using a for loop to iterate through each index
        of the array and print out the given value.
        In this way, I display the entire phrase in the
        console. For fun, change the array count on line
        17 from 6 to 5, and running the program.
        */

        String[] words = new String[6];

        words[0] = "This "; words[1] = "is ";
        words[2] = "an "; words[3] = "array ";
        words[4] = "of "; words[5] = "words.\n";

        for (int s = 0; s <= 5; s++) {
            System.out.print(words[s]);
        }

        /*
        This is another way to declare and populate
        an array with one statement.
         */

        int[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i <= 9; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
