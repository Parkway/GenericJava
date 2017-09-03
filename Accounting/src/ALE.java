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
                NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US); //Allows for number formatting

                String liabilities = JOptionPane.showInputDialog("Please enter your total liabilities:");
                String noChars = liabilities.replace(",", "").replace("$","");
                //Removes $ and , from inputted numbers, in case of annoying users.
                int liabilint = Integer.parseInt(noChars); //Converts the above string to an integer.

                //take all parts of equity formula as input and separate by commas
                String equityParts = JOptionPane.showInputDialog(
                        "Please enter your Owner value, Capital value, Withdrawals, Revenue, and Expenses,\n" +
                                "separated by commas.\nDo not add dollar signs or commas to the numbers.");
                String[] parts = equityParts.split(", "); //Takes all input, then splits it by comma location.
                String own = parts[0]; //First part of equity piece.
                String capOwn = parts[1];
                String With = parts[2];
                String Rev = parts[3];
                String Exp = parts[4]; //Last part.

                //Converts each value to integer for calculations.
                int ownVal = Integer.parseInt(own);
                int capOwnVal = Integer.parseInt(capOwn);
                int WithVal = Integer.parseInt(With);
                int RevVal = Integer.parseInt(Rev);
                int ExpVal = Integer.parseInt(Exp);

                //Formulae (with an e at the end for fancy)
                int equity = ownVal + (capOwnVal - ownVal) + (WithVal + (RevVal - ExpVal));

                //Confirmation dialog
                int correct = JOptionPane.showConfirmDialog(null,
                        "Owner Value: $" + ownVal + "\n" +
                                "Capital Value: $" + capOwnVal + "\n" +
                                "Withdrawals: $" + WithVal + "\n" +
                                "Revenue: $" + RevVal + "\n" +
                                "Expenses: $" + ExpVal + "\n" +
                                "Is this correct?");

                //if correct, math out total asset value
                if (correct == JOptionPane.YES_OPTION) {
                    int assets = liabilint + equity;
                    String assetFormat = numberFormat.format(assets);
                    JOptionPane.showMessageDialog(null,
                            "Your total assets should be $" + assetFormat + ".");

                //otherwise, try again.
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Let's try again. :)");
                    math();
                }

            //Not important, catches goofs in input
            } catch (NumberFormatException NFE) {
                JOptionPane.showMessageDialog(null,
                        "Please only enter integers. Try again.");
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

