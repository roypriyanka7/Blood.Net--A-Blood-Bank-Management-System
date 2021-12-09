/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Priyanka
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        Connection con= null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_net?zeroDateTimeBehavior=convertToNull", "root", "");
        System.out.println("Database Connected.");
    }
    catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed.");
            System.out.println("Database.ConnectDB():" + e);
        }
    return con;
    }
    
}
