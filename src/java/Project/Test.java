package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Test extends JFrame implements ActionListener {
 
    JLabel l, l1, l2, l3, l4, l5,tf1, tf2, tf3, tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14;
    JButton b;
   // JTextField tf1, tf2, tf3, tf4;
    JComboBox bx;
    String str;
 
    Test() {
        setVisible(true);
        setSize(1366,768);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JDBC DEMO");
        l = new JLabel("Select Day:");
        b = new JButton("Submit");
 /*
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
 */
        tf1 = new JLabel();
        tf2 = new JLabel();
        tf3 = new JLabel();
        tf4 = new JLabel();       
        tf5 = new JLabel();       
        tf6 = new JLabel();       
        tf7 = new JLabel();       
        tf7 = new JLabel();       
        tf8 = new JLabel();       
        tf9 = new JLabel();       
        tf10 = new JLabel();       
        tf11 = new JLabel();       
        tf12 = new JLabel();       
        l.setBounds(20, 20, 200, 20);
        b.setBounds(50, 50, 150, 30); 
        add(l);
        add(b);
 /*
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
   */
   b.addActionListener(this);
        try 
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
            PreparedStatement ps = con.prepareStatement("select Day from day");
            ResultSet rs = ps.executeQuery();
            Vector v = new Vector();
            while (rs.next()) 
            {
                String s = rs.getString(1);
                v.add(s);
            }
            bx = new JComboBox(v);
            bx.setBounds(240, 20, 200, 20);
            add(bx); 
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
    } 
    public void actionPerformed(ActionEvent e) 
    {
        try {
            showData();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
 
    public void showData() throws Exception
    {
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(1366,768);
        f1.setLayout(new GridLayout(6,2));   
        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);
        f1.add(tf4); 
        f1.add(tf5); 
        f1.add(tf6); 
        f1.add(tf7); 
        f1.add(tf8); 
        f1.add(tf9); 
        f1.add(tf10); 
        f1.add(tf11); 
        f1.add(tf12);
        tf1.setBounds(240, 110, 200, 20);
        tf2.setBounds(240, 140, 200, 20);
        tf3.setBounds(240, 170, 200, 20);
       /*tf4.setBounds(240, 200, 200, 20); 
        tf5.setBounds(240, 230, 200, 20); 
        tf6.setBounds(240, 260, 200, 20); 
        /*tf7.setBounds(240, 290, 200, 20); 
        tf8.setBounds(240, 320, 200, 20); 
        tf9.setBounds(240, 350, 200, 20); 
        tf10.setBounds(240, 380, 200, 20); 
        tf11.setBounds(240, 410, 200, 20); 
        tf12.setBounds(240, 440, 200, 20);*/
      //tf13.setBounds(240, 470, 200, 20); 
      //tf14.setBounds(240, 500, 200, 20);
      //f1.add(tf13); 
      //f1.add(tf14);
        str = (String) bx.getSelectedItem();
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
            PreparedStatement ps = con.prepareStatement("select * from tyitmon");
            ResultSet rs = ps.executeQuery();
            rs.first();            
            tf1.setText(rs.getString("Time"));
            tf2.setText(rs.getString("Lectures")); 
            rs.next();
            tf3.setText(rs.getString("Time"));
            tf4.setText(rs.getString("Lectures"));
            rs.next();
            tf5.setText(rs.getString("Time"));
            tf6.setText(rs.getString("Lectures"));
            rs.next();
            tf7.setText(rs.getString("Time"));
            tf8.setText(rs.getString("Lectures")); 
            rs.next();
            tf9.setText(rs.getString("Time"));
            tf10.setText(rs.getString("Lectures")); 
            rs.next();
            tf11.setText(rs.getString("Time"));
            tf12.setText(rs.getString("Lectures")); 
            //rs.next();
            //tf13.setText(rs.getString("Time"));
            //tf14.setText(rs.getString("Lectures"));*/
        } 
        
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
    }
     public static void main(String arr[]) {
        new Test();
    }
}