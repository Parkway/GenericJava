import javax.swing.*;
import java.math.BigInteger;

public class Factorial {
    public static void main(String args[]) {
        try {
            //Declare variables.
            int num, i;
            BigInteger inc =  new BigInteger("1");
            BigInteger fact = new BigInteger("1");

            //Read number.
            String numStr = JOptionPane.showInputDialog(null,
                    "Enter an integer to calculate it's factorial");
            num = Integer.parseInt(numStr);

            //If num is less than one, say gotta be positive.
            if (num < 1) {
                JOptionPane.showMessageDialog(null,
                        "Number should be non-negative.");
                main(args);
            } else {
                for (i = 1; i <= num; i++) {
                    fact = fact.multiply(inc);
                    inc = inc.add(BigInteger.ONE);
                }
                JOptionPane.showMessageDialog(null,
                        num + "! = " + fact);
            }
        } catch (NullPointerException NPE) {
            System.exit(1);
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(null,
                    "Number too large.");
            main(args);
        }
    }
}