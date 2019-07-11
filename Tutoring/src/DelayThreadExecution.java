/*****************************************
 * Created by Lance Douglas on 1/5/2019
 *****************************************/
public class DelayThreadExecution {
    public static void main (String[] main) throws InterruptedException {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Zero!");
    }
}
