import java.awt.*;
import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 2/16/2017
 *****************************************/

public class BoxPanel extends JPanel
{
    //-----------------------------------------------------------------
    //  Sets up this panel with some buttons to show how a vertical
    //  box layout (and invisible components) affects their position.
    //-----------------------------------------------------------------
    public BoxPanel()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
    }
}
