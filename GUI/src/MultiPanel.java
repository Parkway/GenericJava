import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/*****************************************
 * Created by Lance Douglas on 3/9/2017
 *****************************************/
public class MultiPanel {


    public static void main(String[] argumentation) {
        MultiPanel obj = new MultiPanel();
        obj.counterMethod();
    }
    public void counterMethod() {
        JFrame JF = new JFrame("Title");
        JButton JB = new JButton("Button");
        JTextField JTF = new JTextField("Text Field");
        JF.add(JB);
        JF.add(JTF);
        JTF.setEditable(false);

        JB.addActionListener((ActionEvent AE) -> {
            JF.setTitle("Clicker");
            JTF.setText("MagicClicks");
        });




        JF.setLayout(new FlowLayout(FlowLayout.CENTER));
        JF.setLocationRelativeTo(null);
        JF.pack();
        JF.setVisible(true);
    }

}
