import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 3/17/2017
 *****************************************/
public class BasicGUI extends JFrame {
    //Declaring Panel and Label
    private JPanel JP = new JPanel();
    private JLabel JLbl = new JLabel("Test");

    //Instantiating GUI
    private BasicGUI() {
        //Title of GUI
        super("GUI Title Here");
        //Size of GUI
        setSize(350,150);
        //Adding Panel to GUI
        add(JP);
        //Adding Label to Panel
        JP.add(JLbl);

        //Making sure GUI will be visible.
        setVisible(true);
    }
    public static void main(String[] args) {
        BasicGUI GUI = new BasicGUI();
    }
}
