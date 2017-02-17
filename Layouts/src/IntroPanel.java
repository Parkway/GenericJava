import java.awt.*;
import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 2/16/2017
 *****************************************/

public class IntroPanel extends JPanel
{
    //-----------------------------------------------------------------
    //  Sets up this panel with two labels.
    //-----------------------------------------------------------------
    public IntroPanel()
    {
        setBackground(Color.black);

        JLabel l1 = new JLabel("Layout Manager Demonstration:");
        JLabel l2 = new JLabel("Choose a tab to see an example of " +
                "a layout manager.");

        add(l1);
        l1.setForeground(Color.WHITE);
        add(l2);
        l2.setForeground(Color.WHITE);
    }
}