import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 4/18/2017
 *
 * This class shows the different ways
 * that a JOptionPane.showInputDialog
 * can display information via the
 * initialValue or via the Title and Type.
 *
 * As far as I know, you cannot set both
 * the Title and InitialValue in the same
 * showInputDialog.
 *****************************************/
public class Input {
    public static void main(String[] args) {
        String example1 = JOptionPane.showInputDialog(null,
                "Message", "What Would You Like To Make?");
        String example2 = JOptionPane.showInputDialog(null,
                "Message", "Title", JOptionPane.PLAIN_MESSAGE);


        JOptionPane.showInputDialog(null,
                "Example", example1 + " " +  example2, JOptionPane.PLAIN_MESSAGE);
    }
}
