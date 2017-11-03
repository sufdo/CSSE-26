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
import Model.FacultyModel;
import java.awt.HeadlessException;
/**
 *
 * @author Rishni
 */
public class FacultyController {
    static Connection conn=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;

    Validation v=new Validation();
    
    public FacultyController() {
         //connect to DB
        conn=DBConnect.connect();

    }
        
    //method to add faculty
    public static boolean AddFaculty(FacultyModel faculty) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String query="INSERT INTO Faculty(FacultyName,FacultyDean) VALUES ('"+faculty.getFacultyName()+"','"+faculty.getFacultyDean()+"')";

            Statement statement = conn.createStatement();

            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_SUCCESS);
            return true;
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_FAIL);
            return false;
        }

    }
    
    //method to load the faculty table 
    public static ResultSet loadFacultytable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT * FROM Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    //method to update faculty
    public static boolean UpdateFaculty(FacultyModel faculty,String id) throws SQLException
    {
        try 
        {
            conn=DBConnect.connect();
            int option=JOptionPane.showConfirmDialog(null, MessageConsts.UPDATE_QUESTION);

            if(option==0)
            {
                String query="UPDATE Faculty SET FacultyName='"+faculty.getFacultyName()+"', FacultyDean='"+faculty.getFacultyDean()+"' WHERE FacultyID='"+id+"' ";
                Statement statement = conn.createStatement();
                statement.executeUpdate(query);   
                conn.close();
                JOptionPane.showMessageDialog(null, MessageConsts.UPDATE_SUCCESS);
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, MessageConsts.NOT_UPDATED);
                return true;
            }
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NOT_UPDATED);
            return false;
        }

      
    }
    
    //method to delete faculty
    public static boolean DeleteFaculty(String faculty) throws SQLException
    {
        int option=JOptionPane.showConfirmDialog(null, MessageConsts.DELETE_QUESTION);

            try
            {
                if(option==0)
                {
                    conn=DBConnect.connect();
                    String query="DELETE FROM Faculty WHERE FacultyID='"+faculty+"' ";
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(query); 

                    JOptionPane.showMessageDialog(null, MessageConsts.DELETION_SUCCESS);
                    conn.close();
                    return true;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, MessageConsts.NOT_DELETED);
                    return true;
                }

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, MessageConsts.NOT_DELETED);
                return false;
            }

    }
    
    //method to search faculty details when search button is pressed
    public static ResultSet SearchFaculty(String search) throws SQLException {
        
        String sql="SELECT DISTINCT * FROM Faculty WHERE (FacultyID LIKE '%"+search+"%') OR (FacultyName LIKE '%"+search+"%') OR (FacultyDean LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
    }
    
    //method to search faculty details when key typed
    public static ResultSet SearchFaculty(char search) throws SQLException {
        
        String sql="SELECT DISTINCT * FROM Faculty WHERE (FacultyID LIKE '%"+search+"%') OR (FacultyName LIKE '%"+search+"%') OR (FacultyDean LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
    }
    
    //method to fill the combo box values with faculty names
    public static ResultSet fillOrganizedBy() throws SQLException
    {
        conn=DBConnect.connect();
        
        String sql="SELECT FacultyName FROM Faculty";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();

        return rs;
 
    }
   
}
