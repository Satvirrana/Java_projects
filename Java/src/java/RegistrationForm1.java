import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class RegistrationForm1 extends JFrame implements ActionListener   
{  
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;  
    JTextField tf1, tf2, tf5, tf6, tf7;  
    JButton btn1, btn2;  
    JPasswordField p1, p2;  
    RegistrationForm1()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Registration Form in Java");  
        l1 = new JLabel("Registration Form:");  
        l1.setForeground(Color.GREEN);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("Email-ID:");  
        l4 = new JLabel("Create Passowrd:");  
        l5 = new JLabel("Confirm Password:");  
        l6 = new JLabel("Country:");  
        l7 = new JLabel("State:");  
        l8 = new JLabel("Phone No:");   
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf5 = new JTextField();  
        tf6 = new JTextField();  
        tf7 = new JTextField();  
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear");  
        btn1.addActionListener(this);  
        btn2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
        l8.setBounds(80, 310, 200, 30);  
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);  
        tf5.setBounds(300, 230, 200, 30);  
        tf6.setBounds(300, 270, 200, 30);  
        tf7.setBounds(300, 310, 200, 30);  
        btn1.setBounds(50, 350, 100, 30);  
        btn2.setBounds(170, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(tf1);  
        add(l3);  
        add(tf2);  
        add(l4);  
        add(p1);  
        add(l5);  
        add(p2);  
        add(l6);  
        add(tf5);  
        add(l7);  
        add(tf6);  
        add(l8);  
        add(tf7);  
        add(btn1);  
        add(btn2);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
       
                try
                {  
                    String query="insert into student1 values(?,?,?,?,?,?)";
                    
                    Class.forName("com.mysql.jdbc.Driver");  
                     System.out.println("Driver loded");
                     
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root",""); 
                    System.out.println("conectiom stablish");
                    
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, tf1.getText());    
                    ps.setString(2, tf2.getText());  
                    ps.setString(3, p1.getText());  
                    ps.setString(4, tf5.getText());  
                    ps.setString(5, tf6.getText());  
                    ps.setString(6, tf7.getText());
                    
                   int count= ps.executeUpdate();
                    System.out.println(count+  "  update");
                                           
                    JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
                    
                     ps.close();
                     con.close();
                      JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");  
               
              }
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }  
            }

    
                public static void main(String args[])  
    {  
        new RegistrationForm1();  
    }  
}  