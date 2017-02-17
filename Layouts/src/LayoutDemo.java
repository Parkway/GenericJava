import javax.swing.*;

/*****************************************
 * Created by Lance Douglas on 2/16/2017
 *****************************************/

public class LayoutDemo extends JFrame {
    public static void main(String[] args) {
        JFrame JF = new JFrame("Manager Demo");

        JTabbedPane JTP = new JTabbedPane();
        JTP.addTab("Intro", new IntroPanel());
        JTP.addTab("Flow", new FlowPanel());
        JTP.addTab("Grid", new GridPanel());
        JTP.addTab("Box", new BoxPanel());
        JTP.addTab("Border", new BorderPanel());

        JF.getContentPane().add(JTP);
        JF.pack();
        JF.setVisible(true);
    }
}
