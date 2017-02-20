import java.util.Random;

/*****************************************
 * Created by Lance Douglas on 2/18/2017
 *****************************************/
public class randomTime {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int countDown = 5;

        while (countDown > 0) {
            int random = rand.nextInt(1000);
            Thread.sleep(random);
            System.out.println("Execution delayed: " + random + " milliseconds.");
            countDown--;
        }
    }
}
