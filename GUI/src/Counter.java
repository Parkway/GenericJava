import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/********************************************
 * Created by Lance Douglas on 1/26/17
 *********************************************/

public class Counter extends JFrame {
    //TODO: Literally everything. This was just to test a default file template (Yeah at the top, that.)
    JPanel Pnl = new JPanel(null);
    JButton adder = new JButton("Plus One");
    JButton miner = new JButton("Minus One");
    JLabel Lbl = new JLabel("0");

    int clickCount = 0;

    private Counter() {
        super("Clicker Counter");
        setSize(250,250);

        add(Pnl);
        Pnl.add(Lbl, BorderLayout.CENTER);
        Pnl.add(adder, BorderLayout.NORTH);
        Pnl.add(miner, BorderLayout.SOUTH);
        Pnl.setBackground(Color.white);

        Lbl.setSize(50,50);
        Lbl.setBounds(120,110,50,10);

        adder.setFocusable(false);
        adder.setSize(250, 20);
        adder.setBackground(Color.WHITE);
        adder.setBounds(15,10,225,20);

        miner.setFocusable(false);
        miner.setSize(250,20);
        miner.setBackground(Color.WHITE);
        miner.setBounds(15,210,225,20);

        adder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                String newClick = Integer.toString(clickCount);
                Lbl.setText(newClick);
            }
        });
        miner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount--;
                String newClick = Integer.toString(clickCount);
                Lbl.setText(newClick);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        Counter GUI = new Counter();
    }

}
