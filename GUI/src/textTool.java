import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textTool extends JFrame {

    JPanel Pnl = new JPanel();
    JTextArea JTA = new JTextArea();

    JRadioButton JRB1 = new JRadioButton("Red");
    JRadioButton JRB2 = new JRadioButton("Blue");
    JRadioButton JRB3 = new JRadioButton("Black");

    //TODO: Add three more radioButtons for PLAIN, BOLD, ITALIC font choices. Can't wait!

    ButtonGroup BG = new ButtonGroup();

    private textTool() {
        super("Text Tool");
        setSize(500,250);

        add(Pnl);
        Pnl.add(JTA, BorderLayout.SOUTH);
        Pnl.add(JRB1, BorderLayout.EAST);
        Pnl.add(JRB2, BorderLayout.EAST);
        Pnl.add(JRB3, BorderLayout.EAST);
        BG.add(JRB1);
        BG.add(JRB2);
        BG.add(JRB3);
        Pnl.setBackground(Color.white);

        JTA.setBackground(Color.white);
        JTA.setSize(450, 400);
        JTA.setLineWrap(true);
        JTA.setWrapStyleWord(true);
        JTA.setFont(new Font("Ubuntu", Font.ITALIC, 20));


        JRB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTA.setForeground(Color.red);
            }
        });
        JRB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTA.setForeground(Color.blue);
            }
        });
        JRB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTA.setForeground(Color.black);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        textTool GUI = new textTool();
    }
}