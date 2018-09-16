package Project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class login extends JFrame
{
    Font ft;
    
 login() throws FontFormatException, IOException
  {
     super("Login");
     Font ft = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Ahad\\Documents\\NetBeansProjects\\Timetable project\\src\\java\\Project\\timesbd.ttf")).deriveFont(32f);
     
     setBackground(new Color(52,29,150));
     setLayout(new BorderLayout());
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setSize(1366,768);
  }
     public static void main(String[] args) throws IOException, FontFormatException
     {
        login l=new login();
        l.setVisible(true);
     }
}