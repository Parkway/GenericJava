import javax.swing.*;

public class SleepCounter {
    public static void main(String[] args) throws InterruptedException {
        JOptionPane.showMessageDialog(null,
                "This program will determine a random number, in milliseconds,\n" +
                        "and wait that amount of time before executing.\n");
        String maxQ = JOptionPane.showInputDialog(
                "What is the maximum amount of time you want to wait, in milliseconds?");
        int maxTime = Integer.parseInt(maxQ);
        for (int num = 5; num > 0; num--) {
            int randomTime = (int) (Math.random() * maxTime);
            Thread.sleep(randomTime);
            JOptionPane.showMessageDialog(null,
                    "The time waited before execution was " + randomTime + " milliseconds.\n");
            System.out.println(randomTime + " milliseconds.");
        }
        JOptionPane.showMessageDialog(null, "Process completed.");
        System.exit(0);
    }
}