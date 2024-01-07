//package recruitment;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//import java.sql.*;

//import java.net.*;

public class StdMenu implements ActionListener


{

JFrame f;

JMenuBar menubar;

JMenu menu,options;

JMenuItem View_vacancy,All_Company,logout,view_advertisements;

JLabel l1,l2;

StdMenu()

{

ImageIcon obj = new ImageIcon("image/extra2.jpg");

l2=new JLabel(obj);

f=new JFrame(" Student DashBoard ");


menubar=new JMenuBar();

options=new JMenu("Options");

logout =new JMenuItem("Logout");

 

View_vacancy=new JMenuItem("View_vacancy");

menu=new JMenu("Menu");

 

view_advertisements=new JMenuItem("view_advertisements");

All_Company=new JMenuItem("All_Company");

l1=new JLabel("Student DashBoard");

f.setVisible(true);

f.setSize(600,600);

f.setLayout(null);

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

menubar.setBounds(0,2,1500,50);

l1.setBounds(500,100,400,20);

l2.setBounds(50,130,1200,600);

l1.setFont(new Font("algerian",Font.BOLD,20));

f.add(menubar);

menubar.add(menu);

menubar.add(options);

 


menu.add(View_vacancy);

menu.add(view_advertisements);

menu.add(All_Company);

options.add(logout);

 

f.add(l1);

f.add(l2);

menu.addActionListener(this);

logout.addActionListener(this);

View_vacancy.addActionListener(this);

view_advertisements.addActionListener(this);

}


public void actionPerformed(ActionEvent e)

{

 

if(e.getSource().equals(logout))

{

f.setVisible(false);

 new Login();

}

else if(e.getSource().equals(View_vacancy))

{

//new JTableDatabase1();

}


else if(e.getSource().equals(view_advertisements))

{

//new Ad();

}

}

public static void main(String sd[])

{

new StdMenu();

}

}

