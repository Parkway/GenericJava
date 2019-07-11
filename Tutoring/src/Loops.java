/*****************************************
 * Created by Lance Douglas on 1/5/2019
 *
 * This class demonstrates the three main
 * ways to use loops in Java. The while
 * loop, for loop, and do while loops.
 *****************************************/
public class Loops {
    public static void main(String[] args) {

        //Declaring integers for each loop.
        int whileNum = 3;
        int doNum = 3;
        int forNum;

        /*
        While whileNum (3) is greater than
        or equal to zero, display the number
        it currently is, and then decrement
        it. If and when whileNum becomes zero,
        the phrase "Blast off!" is printed.
         */
        while (whileNum >= 0) {
            if (whileNum == 0) {
                System.out.println("Blast off!");
            } else {
                System.out.println(whileNum);
            }
            whileNum--;
        }

        //For nicer looking output.
        System.out.println("\n");


        /*
        for forNum greater than or equal to
        zero, do these steps until its not.
         */
        for (forNum = 3; forNum >= 0; forNum--) {
            if (forNum == 0) {
                System.out.println("Blast off!");
            } else {
                System.out.println(forNum);
            }
        }

        System.out.println("\n");

        /*
        Same as the while loop, except changes
        order of execution -> code is tested
        post execution, not prior to.
         */
        do {
            if (doNum == 0) {
                System.out.println("Blast off!");
            } else {
                System.out.println(doNum);
            }
            doNum--;
        } while (doNum >= 0);

        //This for loop demonstrates a continue statement,
        //which skips execution. This loop prints 25-0,
        //excluding number 19.
        for (forNum = 25; forNum >= 0; forNum--) {
            if (forNum == 19)
                continue;
            else
                System.out.println(forNum);
        }
    }
}
