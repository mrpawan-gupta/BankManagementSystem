/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

/**
 *
 * @author notyourpawan
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
  private JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
  private JCheckBox checkBox1,checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;
  private JButton submit, cancel;
  private String formNo;
  
  //Constructor
  SignupThree(String formNo){
      this.formNo = formNo;
      
      setLayout(null);
      JLabel l1 = new JLabel("Page 3: Account Details");
      l1.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      l1.setBounds(280, 30, 400, 40);
      add(l1);
      
      JLabel type = new JLabel("Account Type");
      type.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      type.setBounds(100, 100, 200, 30); //left, top, right, bottom
      add(type);
      
      radioButton1 = new JRadioButton("Saving Account");
      radioButton1.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      radioButton1.setBackground(Color.WHITE);
      radioButton1.setBounds(100, 150, 150, 20);
      add(radioButton1);
      
      radioButton2 = new JRadioButton("Fixed Deposit Account");
      radioButton2.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      radioButton2.setBackground(Color.WHITE);
      radioButton2.setBounds(350, 150, 250, 20);
      add(radioButton2);
      
      radioButton3 = new JRadioButton("Current Account");
      radioButton3.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      radioButton3.setBackground(Color.WHITE);
      radioButton3.setBounds(100, 190, 250, 20);
      add(radioButton3);
      
      radioButton4 = new JRadioButton("Recurring Deposit Account");
      radioButton4.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      radioButton4.setBackground(Color.WHITE);
      radioButton4.setBounds(350, 190, 250, 20);
      add(radioButton4);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(radioButton1);
      bg.add(radioButton2);
      bg.add(radioButton3);
      bg.add(radioButton4);
      
      JLabel card = new JLabel("Card Number: ");
      card.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      card.setBounds(100, 250, 200, 30);
      add(card);
      
      JLabel number = new JLabel("XXXX-XXXX-XXXX-4184"); //dummy card no
      number.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      number.setBounds(330, 250, 300, 30);
      add(number);
      
      JLabel cDetails = new JLabel("Your 16 Digits Card Number"); //dummy card no
      cDetails.setFont(new Font("Abyssinica SIL", Font.BOLD, 12));
      cDetails.setBounds(100, 280, 300, 20);
      add(cDetails);
      
      JLabel pin = new JLabel("PIN: ");
      pin.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      pin.setBounds(100, 320, 200, 30);
      add(pin);
      
      JLabel pnumber = new JLabel("XXXX"); //dummy card no
      pnumber.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      pnumber.setBounds(330, 320, 300, 30);
      add(pnumber);
      
      JLabel pDetails = new JLabel("Your 4 Digits Password"); //dummy card no
      pDetails.setFont(new Font("Abyssinica SIL", Font.BOLD, 12));
      pDetails.setBounds(100, 350, 300, 20);
      add(pDetails);
      
      JLabel serReq = new JLabel("Services Required: ");
      serReq.setFont(new Font("Abyssinica SIL", Font.BOLD, 22));
      serReq.setBounds(100, 400, 400, 30);
      add(serReq);
      
      checkBox1 = new JCheckBox("ATM Card");
      checkBox1.setBackground(Color.WHITE);
      checkBox1.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox1.setBounds(100, 450, 200, 30);
      checkBox1.setBounds(100, 440, 200, 30);
      add(checkBox1);
      
      checkBox2 = new JCheckBox("Internet Banking");
      checkBox2.setBackground(Color.WHITE);
      checkBox2.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox2.setBounds(350, 450, 200, 30);
      checkBox2.setBounds(350, 440, 200, 30);
      add(checkBox2);
      
      checkBox3 = new JCheckBox("Mobile Banking");
      checkBox3.setBackground(Color.WHITE);
      checkBox3.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox3.setBounds(100, 500, 200, 30);
      checkBox3.setBounds(100, 470, 200, 30);
      add(checkBox3);
      
      checkBox4 = new JCheckBox("Email & SMS Alerts");
      checkBox4.setBackground(Color.WHITE);
      checkBox4.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox4.setBounds(350, 500, 200, 30);
      checkBox4.setBounds(350, 470, 200, 30);
      add(checkBox4);
      
      checkBox5 = new JCheckBox("Cheque Book");
      checkBox5.setBackground(Color.WHITE);
      checkBox5.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox5.setBounds(100, 550, 200, 30);
      checkBox5.setBounds(100, 500, 200, 30);
      add(checkBox5);
      
      checkBox6 = new JCheckBox("E-Statement");
      checkBox6.setBackground(Color.WHITE);
      checkBox6.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
      //checkBox6.setBounds(350, 550, 200, 30);
      checkBox6.setBounds(350, 500, 200, 30);
      add(checkBox6);
      
      checkBox7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
      checkBox7.setBackground(Color.WHITE);
      checkBox7.setFont(new Font("Abyssinica SIL", Font.BOLD, 12));
      checkBox7.setBounds(100, 530, 600, 30);
      add(checkBox7);
      
      submit = new JButton("Submit");
      submit.setBounds(230, 580, 100, 30);
      submit.setBackground(Color.BLACK);
      submit.setForeground(Color.WHITE);
      submit.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
      submit.addActionListener(this);
      add(submit);
      
      cancel = new JButton("Cancel");
      cancel.setBackground(Color.BLACK);
      cancel.setForeground(Color.WHITE);
      cancel.setFont(new Font("Abyssinica SIL", Font.BOLD, 14));
      cancel.setBounds(420, 580, 100, 30);
      cancel.addActionListener(this);
      add(cancel);
      
      getContentPane().setBackground(Color.white);
      
      setSize(850, 820);
      setLocation(350, 0);
      setVisible(true);
  }
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == submit){
          String accountType = null;
          if(radioButton1.isSelected()){
              accountType = "Saving Account";
          }else if(radioButton2.isSelected()){
              accountType = "Fixed Deposit Account";
          }else if(radioButton3.isSelected()){
              accountType = "Current Account";
          }else if(radioButton4.isSelected()){
              accountType = "Reccuring Deposit Account";
          }
          Random random = new Random();
          //Generate card no.
          String cardNo = "" + Math.abs((random.nextLong() % 90000000L + 5040936000000000L)); //Starting digits will be 5040936000000000
          //Generate Pin No.
          String pinNo = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
          //Find the values of checkbox
          String facility = "";
          if(checkBox1.isSelected()){
              facility += " ATM Card";
          }else if(checkBox2.isSelected()){
              facility += " Internet Banking";
          }else if(checkBox3.isSelected()){
              facility += " Internet Banking";
          }else if(checkBox4.isSelected()){
              facility += " Mobile Banking";
          }else if(checkBox5.isSelected()){
              facility += " Email & SMS Alerts";
          }else if(checkBox6.isSelected()){
              facility += " Cheque Book";
          }
          //Give these values to database
          try{
              if(accountType.equals("")){
                  //Show Dialog 
                  JOptionPane.showMessageDialog(null, "Account Type is required");
              }else{
                  DatabaseConnection conn = new DatabaseConnection();
                  String query1 = "insert into signupThree values('"+formNo+"', '"+accountType+"', '"+cardNo+"', '"+pinNo+"', '"+facility+"')";
                  String query2 = "insert into login values('"+formNo+"', '"+cardNo+"', '"+pinNo+"')";
                  conn.stmt.executeUpdate(query1);
                  conn.stmt.executeUpdate(query2);
                  
                  //Give cardNo or pinNo to user
                  JOptionPane.showMessageDialog(null, "Card Number: " + cardNo + "\n Pin Number: " + pinNo);
                  setVisible(false);
                  new Deposit(pinNo).setVisible(true);
              }
          }catch(Exception exception){
              System.out.println(exception);
          }
      }else if(ae.getSource() == cancel){
          setVisible(false);
          new BankManagementSystem().setVisible(true);
      }
  }
  
  public static void main(String[] args){
      new SignupThree("");
  }    
}
