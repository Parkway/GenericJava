import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colors extends JFrame {
    JPanel Frame = new JPanel();

    JRadioButton JRB1 = new JRadioButton("Red");
    JRadioButton JRB2 = new JRadioButton("Pink");
    JRadioButton JRB3 = new JRadioButton("Blue");

    ButtonGroup Colors = new ButtonGroup();

    private Colors() {
        super("Test GUI");
        setSize(500,250);
        add(Frame);

        Colors.add(JRB1);
        Colors.add(JRB2);
        Colors.add(JRB3);
        JRB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRB1.setBackground(Color.RED);
                JRB2.setBackground(Color.RED);
                JRB3.setBackground(Color.RED);
                Frame.setBackground(Color.RED);
            }
        });
        JRB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRB1.setBackground(Color.PINK);
                JRB2.setBackground(Color.PINK);
                JRB3.setBackground(Color.PINK);
                Frame.setBackground(Color.PINK);

            }
        });
        JRB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRB1.setBackground(Color.BLUE);
                JRB2.setBackground(Color.BLUE);
                JRB3.setBackground(Color.BLUE);
                Frame.setBackground(Color.BLUE);
            }
        });


        Frame.add(JRB1);
        Frame.add(JRB2);
        Frame.add(JRB3);
        Frame.add(JRB1, BorderLayout.SOUTH);
        Frame.add(JRB2, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        Colors GUI = new Colors();
    }
}
//Testing