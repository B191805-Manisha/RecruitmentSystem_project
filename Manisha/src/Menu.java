//package recruitment;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//import java.sql.*;

//import java.net.*;

public class Menu implements ActionListener

{

JFrame f;

JMenuBar menubar;

JMenu menu,options;

JMenuItem view_std_details,post_vacancy,logout;

JLabel l1,l2;

Menu()

{

ImageIcon obj = new ImageIcon("image/registra.jpg");

l2=new JLabel(obj);


f=new JFrame(" comapany details ");

menubar=new JMenuBar();

options=new JMenu("Options");

logout =new JMenuItem("Logout");

 

menu=new JMenu("Menu");

 

view_std_details=new JMenuItem("view_std_details");

post_vacancy=new JMenuItem("post_vacancy");

l1=new JLabel("Company process");

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

 


menu.add(view_std_details);

menu.add(post_vacancy);

options.add(logout);

 

f.add(l1);

f.add(l2);

menu.addActionListener(this);

logout.addActionListener(this);

view_std_details.addActionListener(this);

post_vacancy.addActionListener(this);

 

}


public void actionPerformed(ActionEvent e)

{

if(e.getSource().equals(logout))

{

f.setVisible(false);

 new Login();

}

else if(e.getSource().equals(view_std_details))

{

//new JTableDatabase();

}

 


else if(e.getSource().equals(post_vacancy))

{

f.setVisible(false);

new Postvacancyy();

}

}

public static void main(String sd[])

{

new Menu();

}

}
