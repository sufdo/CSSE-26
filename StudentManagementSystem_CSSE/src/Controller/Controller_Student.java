/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.FacultyModel;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author codeParane
 */
public class Controller_Student {
     static Connection conn=null;
     
     public Controller_Student() {
        conn=DBConnect.connect();   
    }
     
     
     
     
     
}
