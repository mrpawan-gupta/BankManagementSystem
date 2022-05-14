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

public class PinChange extends JFrame implements ActionListener{
    JPasswordField pin, repin;
    JButton change, back;
    String pinNo;
    
    public PinChange(String pinNo){
        this.pinNo = pinNo;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Abyssinica SIL", Font.BOLD, 16));
        pintext.setBounds(165, 320, 180, 25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Abyssinica SIL", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("S ystem", Font.BOLD, 16));
        repintext.setBounds(165, 360, 180, 25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Abyssinica SIL", Font.BOLD, 25));
        repin.setBounds(330, 360, 180, 25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
            try{
                String newPin = pin.getText();
                String reEnteredPin = repin.getText();
            
                if(!newPin.equals(reEnteredPin)){
                    JOptionPane.showMessageDialog(null, "Entered pin doesn't match");
                    return;
                }
                if(newPin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter new PIN");
                    return;
                }
                if(reEnteredPin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
                    return;
                }
                DatabaseConnection conn = new DatabaseConnection();
                //There are 3 tables where pin is present so we have to chnage pin in all 
                String query1 = "update bank set pin = '"+reEnteredPin+"' where pin = '"+pinNo+"'";
                String query2 = "update login set pinNo = '"+reEnteredPin+"' where pinNo = '"+pinNo+"'";
                String query3 = "update signupThree set pinNo = '"+reEnteredPin+"' where pinNo = '"+pinNo+"'";
                
                conn.stmt.executeUpdate(query1);
                conn.stmt.executeUpdate(query2);
                conn.stmt.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                
                setVisible(false);
                new Transactions(reEnteredPin).setVisible(true);
            }catch(Exception exception){
                System.out.println(exception);
            }
        }else{
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
    }
    public static void main(String[] args){
        new PinChange("").setVisible(true);
    }
}