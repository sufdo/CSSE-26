/*
 * This class add and search staff.
 * 
 * @throws SQLException 
 *          -Integer value identifying the 
 *           error that caused SQLException
 *           instance to be thrown.
 */
package Controller;

import Constants.MessageConsts;
import DBConnection.DBConnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.StaffModel;


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
            String query="INSERT INTO staff(FirstName,LastName,Faculty,Position,NIC) VALUES ('"+staff.getFirstName()+"','"+staff.getLastName()+"','"+staff.getFaculty()+"','"+staff.getPosition()+"','"+staff.getNIC()+"')";

            Statement statement = conn.createStatement(); 
            int executeUpdate = statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_SUCCESS);
            return true;
        } 
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_FAIL);
            return false;
        }

    }
    
    //method to load/display staff table
    public static ResultSet loadStafftable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT s.StaffID,s.FirstName,s.LastName,f.FacultyName,s.Position FROM staff s,faculty f WHERE f.FacultyID=s.Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    //method to find faculty id for a given faculty
    public static int findFacultyID(String facultytxt) throws SQLException
    {
        String query="SELECT FacultyID FROM faculty WHERE FacultyName='"+facultytxt+"'";
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
