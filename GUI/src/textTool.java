import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textTool extends JFrame {

    private JPanel Pnl = new JPanel();
    private JTextArea JTA = new JTextArea();

    private JRadioButton JRB1 = new JRadioButton("Red");
    private JRadioButton JRB2 = new JRadioButton("Blue");
    private JRadioButton JRB3 = new JRadioButton("Black");
    private JRadioButton JRB4 = new JRadioButton("Plain");
    private JRadioButton JRB5 = new JRadioButton("Bold");
    private JRadioButton JRB6 = new JRadioButton("Italic");

    private ButtonGroup Clrs = new ButtonGroup();
    private ButtonGroup Fnts = new ButtonGroup();

    private textTool() {
        super("Text Tool");
        setSize(500,250);

        add(Pnl);
        Pnl.add(JTA, BorderLayout.NORTH);
        Pnl.add(JRB1, BorderLayout.EAST);
        Pnl.add(JRB2, BorderLayout.EAST);
        Pnl.add(JRB3, BorderLayout.EAST);
        Pnl.add(JRB4, BorderLayout.SOUTH);
        Pnl.add(JRB5, BorderLayout.SOUTH);
        Pnl.add(JRB6, BorderLayout.SOUTH);

        Clrs.add(JRB1);
        Clrs.add(JRB2);
        Clrs.add(JRB3);

        Fnts.add(JRB4);
        Fnts.add(JRB5);
        Fnts.add(JRB6);

        Pnl.setBackground(Color.white);

        JTA.setBackground(Color.white);
        JTA.setSize(450, 400);
        JTA.setLineWrap(true);
        JTA.setWrapStyleWord(true);
        JTA.setFont(new Font("Ubuntu", Font.PLAIN, 20));


        JRB1.addActionListener((ActionEvent AE) -> {
           JTA.setForeground(Color.red);
        });
        JRB2.addActionListener((ActionEvent e) -> {
                JTA.setForeground(Color.blue);
        });
        JRB3.addActionListener((ActionEvent AE) -> {
                JTA.setForeground(Color.black);
        });
        JRB4.addActionListener((ActionEvent) ->  {
                JTA.setFont(new Font("Ubuntu", Font.PLAIN, 20));
        });
        JRB5.addActionListener((ActionEvent AE) -> {
            JTA.setFont(new Font("Ubuntu", Font.BOLD, 20));
        });
        JRB6.addActionListener((ActionEvent AE) -> {
                JTA.setFont(new Font("Ubuntu", Font.ITALIC, 20));
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        textTool GUI = new textTool();
    }
}