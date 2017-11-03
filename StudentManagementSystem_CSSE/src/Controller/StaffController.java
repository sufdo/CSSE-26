/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Constants.MessageConsts;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.StaffModel;
import java.awt.HeadlessException;

/**
 *
 * @author Rishni
 */
public class StaffController {
    static Connection conn=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;

    Validation v=new Validation();
    
    public StaffController() {
       //connect to DB
        conn=DBConnect.connect();
    }
        
    //method to add staff members
    public static boolean AddStaff(StaffModel staff) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String query="INSERT INTO Staff(FirstName,LastName,Faculty,Position,NIC) VALUES ('"+staff.getFirstName()+"','"+staff.getLastName()+"','"+staff.getFaculty()+"','"+staff.getPosition()+"','"+staff.getNIC()+"')";

            Statement statement = conn.createStatement(); 
            int executeUpdate = statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, MessageConsts.InsertSuccess);
            return true;
        } 
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.InsertFail);
            return false;
        }

    }
    
    //method to load/display staff table
    public static ResultSet loadStafftable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT s.StaffID,s.FirstName,s.LastName,f.FacultyName,s.Position FROM Staff s,Faculty f WHERE f.FacultyID=s.Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    //method to find faculty id for a given faculty
    public static int findFacultyID(String facultytxt) throws SQLException
    {
        String query="SELECT FacultyID FROM Faculty WHERE FacultyName='"+facultytxt+"'";
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        int facultyID=0;
        while(rs.next())
        {
            facultyID=rs.getInt("FacultyID");
            return facultyID;
        }
        return facultyID;
    }
    
}
