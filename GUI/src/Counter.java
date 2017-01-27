import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/********************************************
 * Created by Lance Douglas on 1/26/17
 *********************************************/

public class Counter extends JFrame {
    //TODO: Literally everything. This was just to test a default file template (Yeah at the top, that.)

    private int clickCount = 0;
    private int totalClicks = 0;
    private int zero = 0;
    private String totalCount = "Total clicks: ";
    private String counterIndex = "Counter Index: ";

    private JPanel Pnl = new JPanel(null);
    private JButton adder = new JButton("Plus One");
    private JButton miner = new JButton("Minus One");
    private JButton reset = new JButton("Reset");
    private JLabel Lbl = new JLabel(counterIndex);
    private JLabel total = new JLabel(totalCount);

    private Counter() {
        super("Clicker Counter");
        setSize(250,250);

        add(Pnl);
        Pnl.add(Lbl, BorderLayout.CENTER);
        Pnl.add(adder, BorderLayout.NORTH);
        Pnl.add(miner, BorderLayout.SOUTH);
        Pnl.add(total, BorderLayout.CENTER);
        Pnl.add(reset, BorderLayout.SOUTH);
        Pnl.setBackground(Color.white);

        Lbl.setSize(50,50);
        Lbl.setBounds(80,140,150,10);
        Lbl.setText(counterIndex + zero);

        total.setSize(50,50);
        total.setBounds(80,90,150,10);
        total.setText(totalCount + zero);

        adder.setFocusable(false);
        adder.setBackground(Color.green);
        adder.setBounds(15,10,225,20);

        miner.setFocusable(false);
        miner.setBackground(Color.red);
        miner.setBounds(15,180,225,20);

        reset.setFocusable(false);
        reset.setBackground(Color.white);
        reset.setBounds(15, 200,225,20);

        adder.addActionListener((ActionEvent e) -> {
                clickCount++;
                totalClicks++;
                String newClick = Integer.toString(clickCount);
                Lbl.setText(counterIndex + newClick);
                total.setText(totalCount + totalClicks);
        });
        miner.addActionListener((ActionEvent e) -> {
                clickCount--;
                totalClicks++;
                String newClick = Integer.toString(clickCount);
                Lbl.setText(counterIndex + newClick);
                total.setText(totalCount + totalClicks);
        });
        reset.addActionListener((ActionEvent e) -> {
                clickCount = 0;
                totalClicks = 0;
                Lbl.setText(counterIndex + zero);
                total.setText(totalCount + zero);
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        Counter GUI = new Counter();
    }

}
