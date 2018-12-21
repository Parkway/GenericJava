
/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Rocket Launcher!");
        //Countdown is 3
        int countDown = 3;

        //While countdown is higher than 0, do this
        while (countDown > 0) {
            System.out.println(countDown);
            if (countDown == 1) {
                System.out.println("Blast off!");
            }
            //Decrement countdown by 1.
            countDown--;
        }
    }
}
