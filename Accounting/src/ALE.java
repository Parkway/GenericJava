import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/***********************************************************************
 * Created by Lance Douglas on 8/31/2017
 ***********************************************************************/
public class ALE {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "This program facilitates the math behind measuring the total assets\n" +
                        "of your corporation, sole proprietorship, or partnership.");
        math();
    }
        private static void math() {
            try {
                NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);

                String liabilities = JOptionPane.showInputDialog("Please enter your total liabilities:");
                String noComma = liabilities.replace(",", "");
                String noDolla = noComma.replace("$", "");
                int liabilint = Integer.parseInt(noDolla);
                String equityParts = JOptionPane.showInputDialog(
                        "Please enter your Owner value, Capital value, Withdrawals, Revenue, and Expenses,\n" +
                                "separated by commas.");
                String[] parts = equityParts.split(", ");
                String own = parts[0];
                String capOwn = parts[1];
                String With = parts[2];
                String Rev = parts[3];
                String Exp = parts[4];
                int ownVal = Integer.parseInt(own);
                int capOwnVal = Integer.parseInt(capOwn);
                int WithVal = Integer.parseInt(With);
                int RevVal = Integer.parseInt(Rev);
                int ExpVal = Integer.parseInt(Exp);
                int equity = ownVal + (capOwnVal - ownVal) + (WithVal + (RevVal - ExpVal));

                int correct = JOptionPane.showConfirmDialog(null,
                        "Owner Value: $" + ownVal + "\n" +
                                "Capital Value: $" + capOwnVal + "\n" +
                                "Withdrawals: $" + WithVal + "\n" +
                                "Revenue: $" + RevVal + "\n" +
                                "Expenses: $" + ExpVal + "\n" +
                                "Is this correct?");
                if (correct == JOptionPane.YES_OPTION) {
                    int assets = liabilint + equity;
                    String assetFormat = numberFormat.format(assets);
                    JOptionPane.showMessageDialog(null,
                            "Your total assets should be $" + assetFormat + ".");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Let's try again. :)");
                    math();
                }
            } catch (NumberFormatException NFE) {
                JOptionPane.showMessageDialog(null,
                        "You were supposed to enter\n" +
                                "an integer, nothing else. Try again.");
                math();
            } catch (ArrayIndexOutOfBoundsException AIOOBE) {
                JOptionPane.showMessageDialog(null,
                        "All five values must be entered, please try again.");
                math();
            } catch (NullPointerException NPE) {
                System.exit(66);
            }
        }
}

