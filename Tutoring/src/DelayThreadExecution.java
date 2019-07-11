/*****************************************
 * Created by Lance Douglas on 1/5/2019
 *****************************************/
public class DelayThreadExecution {
    public static void main (String[] main) throws InterruptedException {
        for (int i = 30; i > 0; i--) {
            System.out.println("Tick");
            Thread.sleep(1000);
            System.out.println("Tock");
            Thread.sleep(1000);
        }
        System.out.println("...");
        Thread.sleep(5000);
        System.out.println("Did you really just watch this for an entire minute" +
                "" +
                "?" +
                "\nGet a life, dude.");
    }
}
