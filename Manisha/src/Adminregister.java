
//import java.io.*;

//import java.util.*;

import java.sql.*;

//import java.net.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Adminregister implements 

ActionListener

{

JFrame f;

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;

TextField t1,t2,t3,t4,t5,t6,t7;

JButton b1,b2,b3,b4;

Adminregister()

{

f= new JFrame("Admin Register");

l8=new JLabel("Admin Registration From");

ImageIcon img=new ImageIcon("image/adminlogin.jpg");

l9=new JLabel(img);


l1=new JLabel("Company name");

l2=new JLabel("E-mail");

l3=new JLabel("Contact");

l4=new JLabel("Admin Name");

l5=new JLabel("Your id");

l6=new JLabel("user name");

l7=new JLabel("password");

t1=new TextField();

t2=new TextField();

t3=new TextField();

t4=new TextField();

t5=new TextField();


t6=new TextField();

t7=new TextField();

b1=new JButton("Register");

b2=new JButton("cancel");

b3=new JButton("Home page");

b4=new JButton("Reset");

f.setVisible(true);

f.setSize(400,400);

f.setLayout(null);

l1.setBounds(30,75,100,20);

t1.setBounds(150,75,185,20);

 


 

l2.setBounds(30,105,100,20);

t2.setBounds(150,105,185,20);

 

l3.setBounds(30,135,100,20);

t3.setBounds(150,135,185,20);

 

l4.setBounds(30,165,100,20);

t4.setBounds(150,165,185,20);

 

l5.setBounds(30,195,100,20);

t5.setBounds(150,195,185,20);


 

l6.setBounds(30,225,100,20);

t6.setBounds(150,225,185,20);

 

l7.setBounds(30,255,100,20);

t7.setBounds(150,255,185,20);

 

b1.setBounds(50,400,100,40);

b2.setBounds(190,400,100,40);

b3.setBounds(90,530,150,30);

b4.setBounds(90,495,150,30);

 


l8.setFont(new Font("Arial",Font.BOLD,(30)));

l9.setBounds(200,65,1300,600);

l8.setBounds(430,10,900,80);

 

f.add(l1);

f.add(t1);

f.add(l2);

f.add(t2);

f.add(l3);

f.add(t3);

f.add(l4);

f.add(t4);


f.add(l5);

f.add(t5);

f.add(l6);

f.add(t6);

f.add(l7);

f.add(t7);

f.add(b1);

f.add(b2);

f.add(b3);

f.add(b4);

f.add(l8);

f.add(l9);


b1.addActionListener(this);

b2.addActionListener(this);

b3.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)

{

if(ae.getSource().equals(b1))

{

 if(t1.getText().isEmpty()||(t2.getText().isEmpty())||(t3.getText().isEmpty())||(t4.getText().isEmpty())||(t5.getText().isEmpty())||(t6.getText().isEmpty())||(t7.getText().isEmpty()))

         {

               JOptionPane.showMessageDialog(null,"Data missing");

         }

 

else

{

try

{ 

String Company_name=(String)t1.getText();

String Email=(String)t2.getText();

String Contact=(String)t3.getText();

String Admin_name=(String)t4.getText();

String Your_id=(String)t5.getText();

String user_name=(String)t6.getText();

String password=(String)t7.getText();

//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

//Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Prasanna@086");
PreparedStatement ps=c.prepareStatement("insert into Adminregister values(?,?,?,?,?,?,?)");

ps.setString(1,Company_name);

ps.setString(2,Email);

ps.setString(3,Contact);

ps.setString(4,Admin_name);


ps.setString(5,Your_id);

ps.setString(6,user_name);

ps.setString(7,password);

int rs=ps.executeUpdate();

if(rs==1)

{

JOptionPane.showMessageDialog(null,"Registered successfully done");

}

ps.close();

c.close();

f.setVisible(false);

new Login();

 

}

catch(Exception e){}

}

}

else if(ae.getSource().equals(b4))

{

t1.setText("");

t2.setText("");

t3.setText("");

t4.setText("");

t5.setText("");

t6.setText("");

t7.setText("");

}

else if(ae.getSource().equals(b1))

{

JOptionPane.showMessageDialog(null,"successfully Register");

}

if(ae.getSource().equals(b3))

{

f.setVisible(false);

new Homepage();


}

else

{

f.setVisible(false);

}

}

public static void main(String...aaa)

{

new Adminregister();

}

}

