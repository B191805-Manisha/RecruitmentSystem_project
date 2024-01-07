
//import java.awt.EventQueue;

//import java.io.*;

//import java.util.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//import java.awt.BorderLayout;

//import java.awt.Color;

//import java.awt.Dimension;

//import java.awt.FlowLayout;

//import javax.swing.JScrollPane;

//import javax.swing.border.LineBorder;

//import java.awt.BorderLayout;

//import javax.swing.Timer;

public class Homepage implements ActionListener

{

JFrame f;

JLabel l1,l2,l3,l4,l5,l6;

JButton b1,b2,b3,b4,b7,b8,b9,b10;

Button b5,b6;

Homepage()


{

 

f= new JFrame("Recruiment");

l1=new JLabel("Welcome to the Recruitments System");

ImageIcon img=new ImageIcon("image/jobvacancy.jpg");

l3=new JLabel(img);

l6=new JLabel("REGISTER YOUR ACCOUNT");

l2=new JLabel("Get your dream job today[Careers With Us]");

l4=new JLabel("Think as a team");

l5=new JLabel("Enjoy work like never before");

b1=new JButton("Company Login");

b2=new JButton("Student Login");

b3=new JButton("Admin Login");

b4=new JButton("cancel");

b5=new Button("About Us");

b7=new JButton("Register");

b6=new Button("FAQ");
b8=new JButton("Student register");
b9=new JButton("Company register");
b10=new JButton("Admin register");

 

f.setVisible(true);

f.setSize(200,200);

f.setLayout(null);

l1.setBounds(345,50,800,90);

b5.setBounds(700,30,150,30);

b7.setBounds(900,500,150,30);

l2.setBounds(450,100,900,80);

l3.setBounds(0,160,1300,300);

l4.setBounds(10,20,200,40);

l5.setBounds(10,40,300,40);

l6.setBounds(900,450,150,30);

b1.setBounds(100,500,150,50);

b2.setBounds(300,500,150,50);

b3.setBounds(500,500,150,50);

b4.setBounds(700,500,150,50);

b6.setBounds(650,30,150,50);
b8.setBounds(900,200,150,50);
   b9.setBounds(900,300,150,30);
   b10.setBounds(900,400,150,30);

l1.setFont(new Font("Arial",Font.BOLD,40));

l2.setFont(new Font("Arial",Font.BOLD,30));

l4.setFont(new Font("Arial",Font.BOLD,20));

l5.setFont(new Font("Arial",Font.BOLD,20));

 

f.add(l1);

f.add(b5);

f.add(l3);

f.add(l2);

f.add(b1);

f.add(b2);

f.add(b3);

f.add(b4);

f.add(b6);

f.add(l4);

f.add(l5);

f.add(l6);

f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);

b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

b4.addActionListener(this);

b5.addActionListener(this);

b6.addActionListener(this);

b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)

{

if(ae.getSource().equals(b8))

{

f.setVisible(false);

new Stdregister();

}
if(ae.getSource().equals(b9))

{

f.setVisible(false);

new CompanyRegister();

}
if(ae.getSource().equals(b10))

{

f.setVisible(false);

new Adminregister();

}

if(ae.getSource().equals(b1))

{

f.setVisible(false);

new CLogin();

}

 

if(ae.getSource().equals(b2))

{

f.setVisible(false);

new Login();

}

 

if(ae.getSource().equals(b3))

{

f.setVisible(false);

new ALogin();

}

 

if(ae.getSource().equals(b4))

{

 f.setVisible(false);

}

if(ae.getSource().equals(b5))

{

 new TextArea();

}

if(ae.getSource().equals(b6))

{

new ScrollPane();

}

}

public static void main(String []args)

{

new Homepage();

}

}
