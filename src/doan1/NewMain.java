/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan1;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        DBConnection connect = new DBConnection();
        
        PreparedStatement sts = null;
        ResultSet rs = null;
        new LogIn().setVisible(true);
        
        }
    }
