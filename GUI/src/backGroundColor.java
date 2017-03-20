import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="backGroundColor" height=300 width=300>
</applet>
*/
public class backGroundColor extends JApplet implements ActionListener
{
    JButton bcolor1,bcolor2,bcolor3;
    String str;
    private Container contentPane;
    public void init()
    {
        contentPane = getContentPane();

        //Declaring buttons
        bcolor1 = new JButton("Red");
        bcolor2 = new JButton("White");
        bcolor3 = new JButton("Blue");

//Adding buttons to the applet
        contentPane.add(bcolor1);
        contentPane.add(bcolor2);
        contentPane.add(bcolor3);

        bcolor1.addActionListener(this);
        bcolor2.addActionListener(this);
        bcolor3.addActionListener(this);

        contentPane.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent ae)
    {
        str = ae.getActionCommand();

        if(str.equals("Red"))
            contentPane.setBackground(Color.red);
        if(str.equals("White"))
            contentPane.setBackground(Color.white);
        if(str.equals("Blue"))
            contentPane.setBackground(Color.blue);
    }
}