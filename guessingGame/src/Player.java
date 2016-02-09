/**
 * Created by Lance on 1/28/2016.
 */
public class Player {
    int number = 0;
// hitler did nothing wrong
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing... " + number);
    }
}
