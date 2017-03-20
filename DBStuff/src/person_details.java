import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class person_details extends JFrame implements ActionListener {

    //Declaring the labels and text fields for the GUI

    JLabel l_name, l_year, l_major, l_ft, l_email;
    JTextField name, major, email;

    // Making two arrays for accompanying JComboBoxes

    String[] choice = {"Yes","No"};
    String[] arrayYear = {"1","2","3","4"};

    // Declaring & Initializing JComboBoxes for
    // fullTime and year.

    JComboBox fullTime = new JComboBox(choice);
    JComboBox year = new JComboBox(arrayYear);

    JButton Insert, Clear; //declaring button for insert and clear

    public static void main(String[] args) {
        person_details obj = new person_details();
        obj.person_details();
    }
    private void person_details() {


        //Setting up the GUI

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBackground(Color.white);
        setVisible(true);
        setSize(700,150);
        setTitle("Person Details");
        setLocationRelativeTo(null);

        // Adding text the label

        l_name = new JLabel("Name:");
        l_year = new JLabel("Year:");
        l_major = new JLabel("Major:");
        l_ft = new JLabel("Full Time:");
        l_email = new JLabel("Email:");

        // Creating text field to input data

        name = new JTextField("",10);
        major = new JTextField("",10);
        email = new JTextField("",10);

        //Creating buttons and adding actionListeners.

        Insert = new JButton("Insert");
        Insert.addActionListener(this);
        Clear = new JButton("Clear");
        Clear.addActionListener(this);

        //Adding elements to the frame.

        add(l_name);  add(name);
        add(l_year);  add(year);
        add(l_major); add(major);
        add(l_ft);    add(fullTime);
        add(l_email); add(email);
        add(Insert);  add(Clear);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Insert) //If event is "Insert" i.e Insert button is clicked
        {
            insert();
        }
        else
        {
            clear();
        }
    }
    private void insert() {
        Connection con;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://classes.accdb");

            String sql = "Insert Into StudentData (name,year,major,fullTime,email)" +
                    "Values ('" +
                    name.getText() + "','" + year.getSelectedIndex() + "','" + major.getText() + "','" +
                    fullTime.getSelectedIndex() + "','" + email.getText() + "')";


            Statement statement = con.createStatement();
            statement.execute(sql);
            display("Student " + name.getText()+ " inserted successfully");
            clear();
        }
        catch(Exception e) {
            display(e.getMessage());
        }
    }
    public void display(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    public void clear() {
        name.setText("");
        major.setText("");
        email.setText("");
    }
}

/*String s1="jdbc:ucanaccess://";
            String user="";
            String pass="";
            String s2="classes.accdb";
            String URL = s1+s2;
            ResultSet result;
            result = connectToDB(URL); printDB(result);
            try
            {
                String database="classes.mdb";//Databse with full path. In this case database exists in the current directory
                String url=("jdbc:ucanaccess:///Users/jdoe/mydb.mdb");
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection con=DriverManager.getConnection("jdbc:ucanaccess://Classes.accdb");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("insert into StudentData values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"'");
            }
            catch (Exception ex)
            {
                System.out.println(ex);
            }*/