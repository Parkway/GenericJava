import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 2/16/2017
 *****************************************/

public class BorderPanel extends JPanel
{
    //-----------------------------------------------------------------
    //  Sets up this panel with a button in each area of a border
    //  layout to show how it affects their position, shape, and size.
    //-----------------------------------------------------------------
    public BorderPanel()
    {
        setLayout(new BorderLayout());

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1, BorderLayout.CENTER);
        b1.setText("Click me!");
        b1.addActionListener((ActionEvent AE) ->
            b1.setText("Go fuck yourself.")
        );
        add(b2, BorderLayout.NORTH);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.WEST);
    }
}