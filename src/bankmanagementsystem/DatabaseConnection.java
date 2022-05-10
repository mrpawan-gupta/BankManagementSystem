 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

import java.sql.*;
/*
 *
 * @author notyourpawan
 */
public class DatabaseConnection {
    static final String DB_URL = "jdbc:mysql://localhost/bankmanagementsystem";
    static final String USER = "root";
    static final String PASS = "root";
    Connection connect;
    Statement stmt;
    public DatabaseConnection(){
        try{
            //Register Driver
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Create connection
            connect = DriverManager.getConnection(DB_URL, USER, PASS);
            //Create statement
            stmt = connect.createStatement();
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
    public static void main(String[] args){
        DatabaseConnection c = new DatabaseConnection();
    }
    
}
