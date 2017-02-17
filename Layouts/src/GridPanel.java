import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 2/16/2017
 *****************************************/

public class GridPanel extends JPanel
{
    //-----------------------------------------------------------------
    //  Sets up this panel with some buttons to show how grid
    //  layout affects their position, shape, and size.
    //-----------------------------------------------------------------
    public GridPanel()
    {
        setLayout(new GridLayout(2, 3));

        setBackground(Color.green);

        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        add(b1);
        b1.addActionListener((ActionEvent AE) ->
            b1.setText("Clicked!")
        );
        add(b2);
        b2.addActionListener((ActionEvent AE) ->
            b2.setText("Clicked!")
        );
        add(b3);
        b3.addActionListener((ActionEvent AE) ->
            b3.setText("Clicked!")
        );
        add(b4);
        b4.addActionListener((ActionEvent AE) ->
            b4.setText("Clicked!")
        );
        add(b5);
        b5.addActionListener((ActionEvent AE) ->
            b5.setText("Clicked!")
        );
    }
}