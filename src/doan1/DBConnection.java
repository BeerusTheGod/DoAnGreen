/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class DBConnection {
    String connectUrl = "jdbc:mysql://localhost:3306/Theater?" + "user=root&password=ducanh113&serverTimeZone=UTC";
    Connection conn = null;
    
    
    public void connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Load driver success");
            
            conn = DriverManager.getConnection(connectUrl);
            System.out.println("Get connection success");
        }catch(Exception ex) {
            System.out.println("Load driver failed: " + ex.getMessage());
        }
    }
    
        
        
}
