/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.ConnectDB;

import System.MusicStudioSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author seanmacbook
 */
public class ConnectDB {
    static Connection conn;
    static String databasename;
    static String url = "jdbc:mysql://localhost:3306" + databasename;
    static String username = "root";
    static String password = "<zuiezhicheng>123";
    
    
    public ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Searching for connection class.......");
        }
        catch(ClassNotFoundException cnf){
            System.out.println("Class not found and unable to connect..." + cnf.getLocalizedMessage());
        }
        try{
            conn = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException e2){
            e2.printStackTrace();
        }
        
    }
    
    public Connection getConnection(){
        return conn;
    }
    

}
