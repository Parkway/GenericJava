import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/********************************************
 * Created by Lance Douglas on 1/26/17
 *********************************************/

public class Counter extends JFrame {

    //TODO: Perhaps implement FlowLayout? Eh, I should learn how to use it first.

    //Adding ints, strings, and Panel stuff.
    //private because they can be and goodCodingPractices™

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

        //Adding all elements to the JPanel

        add(Pnl);
        Pnl.add(Lbl);
        Pnl.add(adder);
        Pnl.add(miner);
        Pnl.add(total);
        Pnl.add(reset);
        Pnl.setBackground(Color.white);

        /*  Hard coded location for buttons and textAreas. Bad coding practices!
            Don't do this, it's just for educational purposes and practice
            While I learn how to make it not shitty. */

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

        /* Today, I learned about the magic of Lambda expressions. They're my new best friend.
           They turn this hideous conglomeration (once known as the Dixie Chicks):
            * adder.addActionListener(new ActionListener() {
            * @Override
            * public void actionPerformed(ActionEvent AE) {
            *
            * }
            * });
           Into this gorgeous succinct piece of art:
            * adder.addActionListener((ActionEvent AE) -> {
            *
            * });
           Moral of the story they make me happy.
         */

        adder.addActionListener((ActionEvent AE) -> { //Now this here is some facking magic. Lambda expressions are the bomb.
            clickCount++;
            totalClicks++;
            String newClick = Integer.toString(clickCount); //Converts the clickCount Int to a String - necessary.
            Lbl.setText(counterIndex + newClick);
            total.setText(totalCount + totalClicks);
        });
        miner.addActionListener((ActionEvent AE) -> {
            clickCount--;
            totalClicks++;
            String newClick = Integer.toString(clickCount);
            Lbl.setText(counterIndex + newClick);
            total.setText(totalCount + totalClicks);
        });
        reset.addActionListener((ActionEvent AE) -> {
            clickCount = zero;
            totalClicks = zero; //Else it keeps counting.
            Lbl.setText(counterIndex + zero);
            total.setText(totalCount + zero);
        });

        setVisible(true); //Invisible GUI == Bad GUI.
    }
    public static void main(String[] args) {
        Counter GUI = new Counter();
    }
}