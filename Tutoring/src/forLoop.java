/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class forLoop {
    public static void main(String[] args) {
        System.out.println("Rocket Launcher!");
        for (int countdown = 3; countdown > 0; countdown--) {
            System.out.println(countdown);
            if (countdown == 1) {
                System.out.println("Blast off!");
            }
        }
    }
}
