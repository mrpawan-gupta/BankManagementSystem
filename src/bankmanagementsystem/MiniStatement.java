/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

/**
 *
 * @author notyourpawan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{
 
    JButton b1, b2;
    JLabel mini;
    MiniStatement(String pin){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        mini = new JLabel();
        add(mini);
        
        JLabel BankName = new JLabel("Bank Of India");
        BankName.setBounds(150, 20, 100, 20);
        add(BankName);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel bLabel = new JLabel();
        bLabel.setBounds(20,400,300,20);
        add(bLabel);
        try{
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.stmt.executeQuery("select * from login where pinNo = '"+pin+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardNo").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        	 
        try {
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.stmt.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while(rs.next()){
                mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            bLabel.setText("Your current account Balance is Rs " + balance);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        mini.setBounds(20,140,400,200);
        setSize(400,600);
        setLocation(20,20);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new MiniStatement("");
    }
    
}