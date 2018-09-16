package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class StartScreen
{
    JLabel j1;
    Home h;
    Frame f;
    
    StartScreen() throws FontFormatException, IOException
    {
     f=new Frame("Start Screen");
     h=new Home();
     j1=new JLabel(new ImageIcon("C:\\Users\\Ahad\\Documents\\NetBeansProjects\\Timetable project\\src\\java\\Project\\Jai-Hind-College.jpeg"));
     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     f.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseClicked(MouseEvent ae)
    {
       f.setVisible(false);
       h.setVisible(true);
       
    }});
     f.add(j1);     
     f.setBackground(new Color(52,29,150));
     f.setVisible(true);
     //f.setSize(1366,768);
     f.setSize(screenSize);
    }
    public static void main(String[] args) throws FontFormatException, IOException
    {
        new StartScreen();
    }
}
