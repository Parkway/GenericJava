import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class BasicGUI extends JFrame {
    private JPanel JP = new JPanel();
    private JLabel JLbl = new JLabel("Test");

    private BasicGUI() {
        super("GUI Title");
        setSize(250,250);
        add(JP);
        JP.add(JLbl);

        setVisible(true);
    }
    public static void main(String[] args) {
        BasicGUI GUI = new BasicGUI();
    }

}
