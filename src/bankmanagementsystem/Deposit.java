/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*; //for import Image
import java.awt.event.*;


/**
 *
 * @author notyourpawan
 */
public class Deposit extends JFrame implements ActionListener{

   JTextField amount;
   JButton deposit, back;
   String pinnumber;

    public Deposit(String pinnumber){
      this.pinnumber = pinnumber;

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        //Scale the image
      Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        //Convert it into image icon
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 0, 900, 900);
      add(image);

      JLabel text = new JLabel("Enter the amount you want to deposit");
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System", Font.BOLD, 16));
      text.setBounds(170,300,400,200);

      amount = new JTextField();
      amount.setFont(new Font("System", Font.BOLD, 20));
      amount.setBounds(170, 350,320,25);
      image.add(amount);

      deposit = new JButton("Deposit");
      deposit.setBounds(355,485,150,30);
      deposit.addActionListener(this);
      image.add(deposit);

      back = new JButton("Back");
      back.setBounds(355,520,150,30);
      back.addActionListener(this);
      image.add(back);

      setSize(900,900);
      setLocation(300,0);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
      // TODO Auto-generated method stub
      if(ae.getSource() == deposit){

      }else if(ae.getSource() == back){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
      }
      
    }
    public static void main(String[] args) {
      new Deposit("");
    }
}
