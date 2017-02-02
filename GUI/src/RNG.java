import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RNG extends JFrame {
    public static void main(String[] args) {
        String minRange = JOptionPane.showInputDialog("Lowest number in the range.");
        String maxRange = JOptionPane.showInputDialog("Highest number in the range.");
        Random rand = new Random();

        JFrame JF = new JFrame();
        JTextArea JTA = new JTextArea();
        JButton B1 = new JButton("<html><center>"+"Click me to generate a random number" +
                "<br>"+"within the range!"+"</center></html>");

        JF.setLayout(new FlowLayout(FlowLayout.CENTER));
        JF.setSize(250,250);
        JF.add(B1);
        JF.add(JTA);
        JF.getContentPane().setBackground(Color.blue);

        JTA.setEditable(false);
        JTA.setFocusable(false);
        JTA.setBackground(Color.blue);
        JTA.setFont(new Font("Ubuntu", Font.BOLD, 100));

        B1.setBackground(Color.blue);
        B1.setForeground(Color.white);

        B1.addActionListener((ActionEvent AE) -> {
            int maxR = Integer.parseInt(maxRange);
            int minR = Integer.parseInt(minRange);
            int RNG = minR + rand.nextInt((maxR - minR) + 1);
            String RNGStr = Integer.toString(RNG);
            JTA.setText(RNGStr);
        });

        JF.setVisible(true);
    }
}
