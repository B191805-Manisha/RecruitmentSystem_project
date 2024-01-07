
//import java.awt;
import java.awt.event.*;
import javax.swing.*;
public class ComboBoxExample implements ActionListener{
 JFrame f;
 
  JButton b1,b2,b3;
 ComboBoxExample()
 {
    f=new JFrame("login");

   
    b1=new JButton("Student register");
    b2=new JButton("Company register");
    b2=new JButton("admin register");

   // f.add(cb);
   f.setVisible(true);
    f.setLayout(null);
    f.setSize(200,100);
    
   // b8.setBounds(900,500,150,30);
   b1.setBounds(100,500,150,50);
   b2.setBounds(500,190,150,30);
   b3.setBounds(500,270,150,30);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   b1.addActionListener(this);
    b2.addActionListener(this);
 b3.addActionListener(this);
 }
   public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource().equals(b1))
    {
      f.setVisible(true);
      new Stdregister();
    }
    if(ae.getSource().equals(b2))
    {
      f.setVisible(false);
      new CompanyRegister();
    }
    if(ae.getSource().equals(b3))
    {
      f.setVisible(false);
      new Adminregister();
    }
   }
  public static void main(String args[])
  {
    new ComboBoxExample();
  }

}