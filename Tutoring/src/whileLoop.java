/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Rocket Launcher!");
        int countDown = 3;

        while (countDown > 0) {
            System.out.println(countDown);
            if (countDown == 1) {
                System.out.println("Blast off!");
            }
            countDown--;
        }
    }
}
