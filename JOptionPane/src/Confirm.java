import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 4/18/2017
 *****************************************/
public class Confirm {
    public static void main(String[] args) {
        String[] words = {"titties"}; //This makes main() recursive.
        int again = JOptionPane.showConfirmDialog(null,
                "Would you like to try again?", "Title", JOptionPane.YES_NO_OPTION);
        if (again == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Kay Second chancerino.");
            main(words);
        } else if (again == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Kthx bai");
            System.exit(222);
        }
    }
}
