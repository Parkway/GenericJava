import javax.swing.*;

/***************************************************
 * Created by Lance Douglas on 4/29/2017 - Math *
 ***************************************************/
public class Fibonacci {
    private static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main (String args[]) {
        String numStr = JOptionPane.showInputDialog(null,
                "Enter the nth digit of the Fibonacci Sequence: ");
        int n = Integer.parseInt(numStr);
        JOptionPane.showMessageDialog(null,
                fib(n));
    }
}
