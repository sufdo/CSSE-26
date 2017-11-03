/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Constants.MessageConsts;
import DBConnection.DBConnect;
import Model.EventModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rishni
 */
public class EventController {
    static Connection conn=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;

    
    Validation validation=new Validation();
    
    public EventController() {
        
        //connect to DB
        conn=DBConnect.connect();
        
    }
        
    //method to add event
    public static boolean AddEvent(EventModel event) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String query="INSERT INTO Event(Name,OrganizedBy,Category,Venue,Date,Time) VALUES ('"+event.getName()+"','"+event.getOrganizedBy()+"','"+event.getCategory()+"','"+event.getVenue()+"','"+event.getDate()+"','"+event.getTime()+"')";

            Statement statement = conn.createStatement();

            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, MessageConsts.InsertSuccess);
            conn.close();
            return true;
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.InsertFail);
            return false;
        }
            
    }
    
    //method to load event table
    public static ResultSet loadEventtable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        return rs;
    }
    
    //method to uodate event
    public static boolean UpdateEvent(EventModel event,String id) throws SQLException
    {
        try 
        {
            conn=DBConnect.connect();
            int option=JOptionPane.showConfirmDialog(null, MessageConsts.updateQuestion);

            if(option==0)
            {
                String query="UPDATE Event SET Name='"+event.getName()+"', OrganizedBy='"+event.getOrganizedBy()+"', Category='"+event.getCategory()+"', Venue='"+event.getVenue()+"', Date='"+event.getDate()+"', Time='"+event.getTime()+"' WHERE EventID='"+id+"' ";
                Statement statement = conn.createStatement();
                statement.executeUpdate(query); 
                JOptionPane.showMessageDialog(null, MessageConsts.updateSuccess);
                conn.close();
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, MessageConsts.notUpdated);
                return true;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.notUpdated);
            return false;
        }        
      
    }
    
    //method to delete event
    public static boolean DeleteEvent(String id) throws SQLException
    {
        int option=JOptionPane.showConfirmDialog(null, MessageConsts.deleteQuestion);

        try
        {
            if(option==0)
            {
                conn=DBConnect.connect();
                String query="DELETE FROM Event WHERE EventID='"+id+"' ";
                Statement statement = conn.createStatement();
                statement.executeUpdate(query); 

                JOptionPane.showMessageDialog(null, MessageConsts.deletionSuccess);
                conn.close();
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, MessageConsts.notDeleted);
                return true;
            }


        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.notDeleted);
            return false;
        }


    }
    
    //method to search event details when search button is pressed
    public static ResultSet SearchEvent(String search) throws SQLException {
        //conn=DBConnect.connect();
        String query="SELECT DISTINCT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy AND (e.EventID LIKE '%"+search+"%') OR (e.Name LIKE '%"+search+"%') OR (f.FacultyName LIKE '%"+search+"%') OR (e.Category LIKE '%"+search+"%') OR (e.Venue LIKE '%"+search+"%') OR (e.Date LIKE '%"+search+"%') OR (e.Time LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        return rs;
    }
    
    //method to search event details when key typed
    public static ResultSet SearchEvent(char search) throws SQLException {
        //conn=DBConnect.connect();
        String query="SELECT DISTINCT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy AND (e.EventID LIKE '%"+search+"%') OR (e.Name LIKE '%"+search+"%') OR (f.FacultyName LIKE '%"+search+"%') OR (e.Category LIKE '%"+search+"%') OR (e.Venue LIKE '%"+search+"%') OR (e.Date LIKE '%"+search+"%') OR (e.Time LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        return rs;
    }
    
    //method to find the facultyid for a given faculty name
    public static int findFacultyID(String organizedby) throws SQLException
    {
        String query="SELECT FacultyID FROM Faculty WHERE FacultyName='"+organizedby+"'";
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
