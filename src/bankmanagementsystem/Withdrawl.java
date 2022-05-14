/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*; //for import Image
import java.awt.event.*;
import java.util.*;


/**
 *
 * @author notyourpawan
 */
public class Withdrawl extends JFrame implements ActionListener{

   private JTextField amount;
   private JButton withdraw, back;
   private String pinnumber;

    public Withdrawl(String pinnumber){
      this.pinnumber = pinnumber;
      setLayout(null);
        //Add Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
      // TODO Auto-generated method stub
      if(ae.getSource() == withdraw){
        String amountToWithdraw = amount.getText();
        Date date = new Date();
        if(amountToWithdraw.equals("")){
          JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
        }else{
          try {
            DatabaseConnection conn = new DatabaseConnection();
            String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'withdrawl', '"+amountToWithdraw+"')";
            conn.stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Rs "+amountToWithdraw+" withdraw Successfully"); 
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
          } catch (Exception e) {
            System.out.println(e);
          }
          
        }
      }else if(ae.getSource() == back){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
      }
      
    }
    public static void main(String[] args) {
      new Withdrawl("");
    }
}
