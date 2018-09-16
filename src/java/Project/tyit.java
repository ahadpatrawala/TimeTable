package Project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;

public class tyit extends JFrame
{
    JMenuBar jm;
    JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17;
    JButton b1,b2,b3,b4,b5,b6;
    Font f;
    tyitmon ty1;
    tyittue ty2;
    tyitwed ty3;
    tyitthurs ty4;
    tyitfri ty5;
    tyitsat ty6;
    
  tyit() throws FontFormatException, IOException
  {     
    jm=new JMenuBar();
    //fy=new fyit();
    //sy=new syit();
    ty1=new tyitmon();
    ty2=new tyittue();
    ty3=new tyitwed();
    ty4=new tyitthurs();
    ty5=new tyitfri();
    ty6=new tyitsat();
    setJMenuBar(jm);
    JMenu menu=new JMenu("Menu");
    JMenu classes=new JMenu("Classes");
    jm.add(menu);
    jm.add(classes);
    JMenuItem home=new JMenuItem("Home");
    JMenuItem about=new JMenuItem("About");
    JMenuItem exit=new JMenuItem("Exit");
    JMenuItem fyit1=new JMenuItem("FY BSc IT");
    fyit1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            //fy.setVisible(true);
        }
    });
    JMenuItem syit1=new JMenuItem("SY BSc IT");
    syit1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            //sy.setVisible(true);
        }
    });
    JMenuItem tyit1=new JMenuItem("TY BSc IT");
    tyit1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            setVisible(true);
        }
    });
    menu.add(home);
    menu.add(about);
    menu.add(exit);
    classes.add(fyit1);
    classes.add(syit1);
    classes.add(tyit1);
    Font f = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Ahad\\Documents\\NetBeansProjects\\Timetable project\\src\\java\\Project\\timesbd.ttf")).deriveFont(32f);
     j1=new JLabel("Courses");
     j1.setForeground(Color.white);
     j1.setFont(f);
     j2=new JLabel("Semester V");
     j2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
     j2.setForeground(Color.white);
     j2.setFont(f);
     j3=new JLabel("01) Network Security");
     j3.setForeground(Color.white);
     j3.setFont(f);
     j4=new JLabel("02)Asp.Net With C#");
     j4.setForeground(Color.white);
     j4.setFont(f);
     j5=new JLabel("03)Software Testing");
     j5.setForeground(Color.white);
     j5.setFont(f);
     j6=new JLabel("04)Advanced Java");
     j6.setForeground(Color.white);
     j6.setFont(f);
     j7=new JLabel("05)Linux Administration");
     j7.setForeground(Color.white);
     j7.setFont(f);
     j8=new JLabel("Semester VI");
     j8.setForeground(Color.white);
     j8.setFont(f);
     j9=new JLabel("01)Internet Technology");
     j9.setForeground(Color.white);
     j9.setFont(f);
     j10=new JLabel("02)Project Management");
     j10.setForeground(Color.white);
     j10.setFont(f);
     j11=new JLabel("03)Data Warehousing");
     j11.setForeground(Color.white);
     j11.setFont(f);
     j12=new JLabel("07)Project Report");
     j12.setForeground(Color.white);
     j12.setFont(f);
     j13=new JLabel("08)Project Viva Voce Elective");
     j13.setForeground(Color.white);
     j13.setFont(f);
     j14=new JLabel("04)IPR and Cyber Laws");
     j14.setForeground(Color.white);
     j14.setFont(f);
     j15=new JLabel("05)Digital Signal And Systems");
     j15.setForeground(Color.white);
     j15.setFont(f);
     j16=new JLabel("06)Geographic Information Systems");
     j16.setForeground(Color.white);
     j16.setFont(f);
     b1=new JButton("Monday");
     b1.setFont(f);
     b1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
          ty1.setVisible(true);
        }
    });
     b2=new JButton("Tuesday");
     b2.setFont(f);
     b2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            ty2.setVisible(true);
        }
    });
     b3=new JButton("Wednesday");
     b3.setFont(f);
     b3.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            ty3.setVisible(true);
        }
    });
     b4=new JButton("Thursday");
     b4.setFont(f);
     b4.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            ty4.setVisible(true);
        }
    });
     b5=new JButton("Friday");
     b5.setFont(f);
     b5.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            ty5.setVisible(true);
        }
    });
     b6=new JButton("Saturday");
     b6.setFont(f);
     b6.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            ty6.setVisible(true);
        }
    });
     Container c=getContentPane();
     c.setBackground(new Color(52,29,150));
     c.setLayout(new GridLayout(22,1));
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
     c.add(j15);
     c.add(j16);
     c.add(b1);
     c.add(b2);
     c.add(b3);
     c.add(b4);
     c.add(b5);
     c.add(b6);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setSize(1366,768);
  }

  public static void main(String[] args) throws FontFormatException, IOException
    {
        tyit ty=new tyit();
        ty.setVisible(true);
    }
}