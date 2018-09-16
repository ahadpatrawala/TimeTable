package Project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Home extends JFrame
{
    JSplitPane jp;
    JMenuBar jm;
    fyit fy;
    syit sy;
    tyit ty;
    JLabel j1;
    JPanel p1;
    JButton b1,b2,b3,b4,b5;
    Font ft;
    
 Home() throws FontFormatException, IOException
  {
     super("Home");
     p1=new JPanel();
     fy=new fyit();
     sy=new syit();
     ty=new tyit();
     jm=new JMenuBar();
     Font ft = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Ahad\\Documents\\NetBeansProjects\\Timetable project\\src\\java\\Project\\timesbd.ttf")).deriveFont(32f);
     b1=new JButton("FY IT");
     b1.setFont(ft);
     b1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            fy.setVisible(true);
        }
    });
     b2=new JButton("SY IT");
     b2.setFont(ft);
     b2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            sy.setVisible(true);
        }
    });
     b3=new JButton("TY IT");
     b3.setFont(ft);
     b3.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            ty.setVisible(true);
        }
    });        
     b4=new JButton("Home");
     b4.setFont(ft);
     b4.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            setVisible(true);
        }
    });
     b5=new JButton("Notifications");
     b5.setFont(ft);
     /*b5.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            abt.setVisible(true);
        }
    });*/
     Container c=getContentPane();
     setJMenuBar(jm);
     JMenu menu=new JMenu("Menu");
     JMenu classes=new JMenu("Classes");
     jm.add(menu);
     jm.add(classes);
     JMenuItem home=new JMenuItem("Home");
     JMenuItem login=new JMenuItem("Login");
     JMenuItem about=new JMenuItem("About");
     JMenuItem exit=new JMenuItem("Exit");
     JMenuItem fyit=new JMenuItem("FY BSc IT");
     JMenuItem syit=new JMenuItem("SY BSc IT");
     JMenuItem tyit1=new JMenuItem("TY BSc IT");
     menu.add(home);
     menu.add(login);
     menu.add(about);
     menu.add(exit);
     home.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            setVisible(true);
        }
     });
     exit.addActionListener(new ActionListener()
 {
         public void actionPerformed(ActionEvent ae)
         {
             System.exit(0);
         }
 });     
     classes.add(fyit);
     fyit.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            ty.setVisible(true);
        }
     });
     classes.add(syit);
     syit.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            ty.setVisible(true);
        }
     });
     classes.add(tyit1);
     tyit1.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent ae)
        {
            setVisible(false);
            ty.setVisible(true);
        }
     });
     c.setBackground(new Color(52,29,150));
     p1.setLayout(new GridLayout(5,1));
     p1.add(b1);
     p1.add(b2);
     p1.add(b3);
     p1.add(b4);
     p1.add(b5);
     setLayout(new BorderLayout());     
     add(p1,BorderLayout.WEST);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setSize(1366,768);
  }
     public static void main(String[] args) throws IOException, FontFormatException
     {
        Home h=new Home();
        h.setVisible(true);
     }
}