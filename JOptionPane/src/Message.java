import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 4/18/2017
 *
 * This class shows the different
 * functionalities of a JOptionPane
 * showMessageDialog as well as the
 * organization of the statement.
 *****************************************/
public class Message {
    public static void main(String[] args) {
        /* Parent Component: null
         * Message: String output
         * Title: Title of Pane
         * Magic Constant: Type of Pane
         */

        String recipe = "Tomatoes: 1\n" +
                "Dough: 15\n" +
                "Cheese: One Pound.";
        JOptionPane.showMessageDialog(null,
                recipe,"Recipe for Pizza", JOptionPane.PLAIN_MESSAGE);

        JOPSMD("Message","Title", JOptionPane.PLAIN_MESSAGE);
    }
    private static void JOPSMD(String Message, String Title, int Type) {
        JOptionPane.showMessageDialog(null, Message, Title, Type);
    }
}
