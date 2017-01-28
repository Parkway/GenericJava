import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colors extends JFrame {
    private JPanel Frame = new JPanel();

    private JRadioButton JRB1 = new JRadioButton("Red");
    private JRadioButton JRB2 = new JRadioButton("Green");
    private JRadioButton JRB3 = new JRadioButton("Blue");

    private ButtonGroup Colors = new ButtonGroup();

    private Colors() {
        super("Color Switcher");
        setSize(500,250);
        add(Frame);

        Frame.add(JRB1);
        Frame.add(JRB2);
        Frame.add(JRB3);

        Colors.add(JRB1);
        Colors.add(JRB2);
        Colors.add(JRB3);

        JRB1.addActionListener((ActionEvent e) -> {
                JRB1.setBackground(Color.RED);
                JRB2.setBackground(Color.RED);
                JRB3.setBackground(Color.RED);
                Frame.setBackground(Color.RED);
        });
        JRB2.addActionListener((ActionEvent e) -> {
                JRB1.setBackground(Color.GREEN);
                JRB2.setBackground(Color.GREEN);
                JRB3.setBackground(Color.GREEN);
                Frame.setBackground(Color.GREEN);
        });
        JRB3.addActionListener((ActionEvent e) -> {
                JRB1.setBackground(Color.BLUE);
                JRB2.setBackground(Color.BLUE);
                JRB3.setBackground(Color.BLUE);
                Frame.setBackground(Color.BLUE);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        Colors GUI = new Colors();
    }
}
//Testing