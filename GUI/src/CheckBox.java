import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/*****************************************
 * Created by Lance Douglas on 3/12/2017
 *****************************************/
public class CheckBox extends JFrame {
    private JPanel Pnl = new JPanel();
    private JTextArea JTA = new JTextArea();

    private JCheckBox JCB = new JCheckBox("Full Time");

    private CheckBox() {
        super("CheckBoxTester");
        setSize(250,250);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(Pnl);
        Pnl.add(JCB);

        JCB.addActionListener((ActionEvent AE) -> {
           if (JCB.isSelected()) {
               JCB.setText("True");
           }
           else {
               JCB.setText("False");
           }
        });

        Pnl.setVisible(true);
        setVisible(true);
    }
    public static void main(String[] args) {
        CheckBox GUI = new CheckBox();
    }
}