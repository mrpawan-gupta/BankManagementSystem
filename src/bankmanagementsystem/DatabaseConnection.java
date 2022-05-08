 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmangementsystem;

import java.sql.*;
/**
 *
 * @author pawan
 */
public class DatabaseConnection {

    Connection conn;
    Statement statement;

    public DatabaseConnection(){
      try {
        conn = DriverManager.getConnection("jdbc:mysql:///DB_Bank","root","root");
        statement = conn.createStatement();
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e);
      }
    }
    public static void main(String[] args) {
      new DatabaseConnection();
    }
}
