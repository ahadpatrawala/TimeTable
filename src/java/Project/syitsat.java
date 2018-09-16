package Project;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.sql.*;

public class syitsat extends JFrame
{
    JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14;
    Font f;
    syitsat() throws IOException, FontFormatException
    {
     super("SYIT saturday");
     Font f = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Ahad\\Documents\\NetBeansProjects\\Timetable project\\src\\java\\Project\\timesbd.ttf")).deriveFont(32f);
     j1=new JLabel("Time");
     j1.setForeground(Color.white);
     j1.setFont(f);
     j2=new JLabel("Lecture");
     j2.setForeground(Color.white);
     j2.setFont(f);
     j1=new JLabel("Time");
     j1.setForeground(Color.white);
     j1.setFont(f);
     j2=new JLabel("Lecture");
     j2.setForeground(Color.white);
     j2.setFont(f);
     j3=new JLabel();
     j4=new JLabel();
     j5=new JLabel();
     j6=new JLabel();
     j7=new JLabel();
     j8=new JLabel();
     j9=new JLabel();
     j10=new JLabel();
     j11=new JLabel();
     j12=new JLabel();
     j13=new JLabel();
     j14=new JLabel();
     try 
     {
      Class.forName("org.gjt.mm.mysql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
      PreparedStatement ps = con.prepareStatement("select * from syitsat");
      ResultSet rs = ps.executeQuery();
      rs.first();            
      j3.setText(rs.getString("Time"));
      j3.setForeground(Color.white);
      j3.setFont(f);
      j4.setText(rs.getString("Lectures")); 
      j4.setForeground(Color.white);
      j4.setFont(f);
      rs.next();
      j5.setText(rs.getString("Time"));
      j5.setForeground(Color.white);
      j5.setFont(f);
      j6.setText(rs.getString("Lectures"));
      j6.setForeground(Color.white);
      j6.setFont(f);
      rs.next();
      j7.setText(rs.getString("Time"));
      j7.setForeground(Color.white);
      j7.setFont(f);
      j8.setText(rs.getString("Lectures"));
      j8.setForeground(Color.white);
      j8.setFont(f);
      rs.next();
      j9.setText(rs.getString("Time"));
      j9.setForeground(Color.white);
      j9.setFont(f);
      j10.setText(rs.getString("Lectures"));
      j10.setForeground(Color.white);
      j10.setFont(f);
      rs.next();
      j11.setText(rs.getString("Time"));
      j11.setForeground(Color.white);
      j11.setFont(f);
      j12.setText(rs.getString("Lectures"));
      j12.setForeground(Color.white);
      j12.setFont(f);
      rs.next();
      j13.setText(rs.getString("Time"));
      j13.setForeground(Color.white);
      j13.setFont(f);
      j14.setText(rs.getString("Lectures"));
      j14.setForeground(Color.white);
      j14.setFont(f);
     }
     catch(Exception e)
         {
             System.out.println(e);
         }
     Container c=getContentPane(); 
     c.setBackground(new Color(52,29,150));
     c.setLayout(new GridLayout(7,2));
     c.add(j1);     
     c.add(j2);     
     c.add(j3);     
     c.add(j4);     
     c.add(j5);     
     c.add(j6);     
     c.add(j7);     
     c.add(j8);     
     c.add(j9);     
     c.add(j10);     
     c.add(j11);     
     c.add(j12);     
     c.add(j13);     
     c.add(j14);     
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setSize(1366,768);
    }
    public static void main(String[] args) throws IOException, FontFormatException
    {
        syitsat sy6=new syitsat();
        sy6.setVisible(true);
    }
}
