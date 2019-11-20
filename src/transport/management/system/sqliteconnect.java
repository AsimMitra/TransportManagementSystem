/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transport.management.system;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class sqliteconnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:F:\\asim mitra\\cse@cgec\\Transport Management System\\AsimMitra.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
