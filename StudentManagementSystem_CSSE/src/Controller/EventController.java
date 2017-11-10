/*
 * This class add ,update, delete events
 * and also load event table, search events
 * and find faculty id.
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
import Model.EventModel;

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
            //inserting event details to event table
            String query="INSERT INTO Event(Name,OrganizedBy,Category,Venue,Date,Time) VALUES ('"+event.getName()+"','"+event.getOrganizedBy()+"','"+event.getCategory()+"','"+event.getVenue()+"','"+event.getDate()+"','"+event.getTime()+"')";

            Statement statement = conn.createStatement();

            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_SUCCESS);
            conn.close();
            return true;
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.INSERT_FAIL);
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
            int option=JOptionPane.showConfirmDialog(null, MessageConsts.UPDATE_QUESTION);

            if(option==0)
            {
                String query="UPDATE Event SET Name='"+event.getName()+"', OrganizedBy='"+event.getOrganizedBy()+"', Category='"+event.getCategory()+"', Venue='"+event.getVenue()+"', Date='"+event.getDate()+"', Time='"+event.getTime()+"' WHERE EventID='"+id+"' ";
                Statement statement = conn.createStatement();
                statement.executeUpdate(query); 
                JOptionPane.showMessageDialog(null, MessageConsts.UPDATE_SUCCESS);
                conn.close();
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, MessageConsts.NOT_UPDATED);
                return true;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NOT_UPDATED);
            return false;
        }        
      
    }
    
    //method to delete event
    public static boolean DeleteEvent(String id) throws SQLException
    {
        int option=JOptionPane.showConfirmDialog(null, MessageConsts.DELETE_QUESTION);

        try
        {
            if(option==0)
            {
                conn=DBConnect.connect();
                String query="DELETE FROM Event WHERE EventID='"+id+"' ";
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
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.NOT_DELETED);
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
