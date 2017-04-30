import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OddEven extends JApplet implements ActionListener
{
    //names variables
    private Container contentPane;
    private JLabel correct,wrong;
    private long secretNumber;

    //creates JApplet
    public void init(){
        contentPane = getContentPane( );
        contentPane.setBackground(Color.BLACK);

        //creates a random number
        SecretNumber();

        //creates buttons with listeners
        JButton Odd = new JButton("Odd");
        JButton Even = new JButton("Even");
        Odd.addActionListener(this);
        Even.addActionListener(this);
        Dimension btnSize = new Dimension(69,26);
        Odd.setPreferredSize(btnSize);
        Even.setPreferredSize(btnSize);

        //creates labels with the results that are hidden by default
        correct = new JLabel("You guessed the right number");
        wrong = new JLabel("Sorry You guessed the wrong number");
        correct.setForeground(Color.GREEN);
        wrong.setForeground(Color.RED);
        Reset();

        //creates a Reset button to restart the game
        JButton Reset = new JButton("Reset");
        Reset.addActionListener(this);
        Reset.setPreferredSize(btnSize);

        //adds everything to the JApplet
        contentPane.setLayout(new FlowLayout());
        contentPane.add(Odd);
        contentPane.add(Even);
        contentPane.add(correct);
        contentPane.add(wrong);
        contentPane.add(Reset);

        //sets the applet's size
        Dimension d = new Dimension(220,100);
        this.resize(d);
    }

    public void actionPerformed(ActionEvent e){
        //if statements to direct commands based on which button was pushed
        if (e.getActionCommand( ).equals("Odd")){
            Odd();
        }
        else if(e.getActionCommand( ).equals("Even")){
            Even();
        }
        else if(e.getActionCommand( ).equals("Reset")){
            Reset();
        }
    }
    //displays the text with results after pushing the Odd button
    private void Odd(){
        if(secretNumber%2==0){
            Wrong();
        }
        else if(secretNumber%2!=0){
            Correct();
        }
    }
    //displays the text with results after pushing the Even button
    private void Even(){
        if(secretNumber%2==0){
            Correct();
        }
        else if(secretNumber%2!=0){
            Wrong();
        }
    }
    //displays message telling the user they were right
    private void Correct(){
        correct.setVisible(true);
        wrong.setVisible(false);
    }
    //displays message telling the user they were wrong
    private void Wrong(){
        correct.setVisible(false);
        wrong.setVisible(true);
    }
    //resets the game
    private void Reset(){
        correct.setVisible(false);
        wrong.setVisible(false);
        SecretNumber();
    }
    //picks a random number based on time in milliseconds
    private void SecretNumber(){
        secretNumber = java.util.Calendar.getInstance().getTimeInMillis() % 100;
    }
}