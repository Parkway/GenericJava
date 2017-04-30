import javax.swing.*;
import static java.lang.Math.*;

/***************************************************
 * Created by Lance Douglas on 4/29/2017 - Math *
 ***************************************************/
public class Squares {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog(null,
                "Enter a positive number:");
        double num = Double.parseDouble(numStr);
        if(num < 1) {
            JOptionPane.showMessageDialog(null,
                    "A postive number. You can't have a negative square root.");
            main(args);
        } else {
            double square = num * num;
            double squareRoot = sqrt(num);

            JOptionPane.showMessageDialog(null,
                    "Squared: " + square +
                            "\nSquare root: " + squareRoot);
        }

    }
}
