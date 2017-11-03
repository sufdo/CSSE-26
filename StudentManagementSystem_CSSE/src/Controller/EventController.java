/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Constants.MessageConsts;
import DBConnection.DBConnect;
import Model.EventModel;
import Model.FacultyModel;
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

    
    
    
    Validation v=new Validation();
    
    public EventController() {
        
        
        //connect to DB
        conn=DBConnect.connect();
        
    
    }
        

    public static boolean AddEvent(EventModel event) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String q="INSERT INTO Event(Name,OrganizedBy,Category,Venue,Date,Time) VALUES ('"+event.getName()+"','"+event.getOrganizedBy()+"','"+event.getCategory()+"','"+event.getVenue()+"','"+event.getDate()+"','"+event.getTime()+"')";

            Statement stm = conn.createStatement();

            int executeUpdate = stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, MessageConsts.InsertSuccess);
            return true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.InsertFail);
            return false;
        }
            //return executeUpdate;
      
    }
    public static ResultSet loadEventtable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    public static boolean UpdateEvent(EventModel event,String id) throws SQLException
    {
        try 
        {
            conn=DBConnect.connect();
            int x=JOptionPane.showConfirmDialog(null, MessageConsts.updateQuestion);

            if(x==0)
            {
                String query="UPDATE Event SET Name='"+event.getName()+"', OrganizedBy='"+event.getOrganizedBy()+"', Category='"+event.getCategory()+"', Venue='"+event.getVenue()+"', Date='"+event.getDate()+"', Time='"+event.getTime()+"' WHERE EventID='"+id+"' ";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(query);   
                conn.close();
                JOptionPane.showMessageDialog(null, MessageConsts.updateSuccess);
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
    
    
    public static boolean DeleteEvent(String event) throws SQLException
    {
        int x=JOptionPane.showConfirmDialog(null, MessageConsts.deleteQuestion);

        try
        {
            if(x==0)
            {
                conn=DBConnect.connect();
                String query="DELETE FROM Event WHERE EventID='"+event+"' ";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(query); 

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
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, MessageConsts.notDeleted);
            return false;
        }


    }
    
    
    public static ResultSet SearchEvent(String search) throws SQLException {
        
        String sql="SELECT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy AND (e.EventID LIKE '%"+search+"%') OR (e.Name LIKE '%"+search+"%') OR (f.FacultyName LIKE '%"+search+"%') OR (e.Category LIKE '%"+search+"%') OR (e.Venue LIKE '%"+search+"%') OR (e.Date LIKE '%"+search+"%') OR (e.Time LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ResultSet SearchEvent(char search) throws SQLException {
        
        String sql="SELECT e.EventID,e.Name,f.FacultyName,e.Category,e.Venue,e.Date,e.Time FROM Event e,Faculty f WHERE f.FacultyID=e.OrganizedBy AND (e.EventID LIKE '%"+search+"%') OR (e.Name LIKE '%"+search+"%') OR (f.FacultyName LIKE '%"+search+"%') OR (e.Category LIKE '%"+search+"%') OR (e.Venue LIKE '%"+search+"%') OR (e.Date LIKE '%"+search+"%') OR (e.Time LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    public static ResultSet fillOrganizedBy() throws SQLException
//    {
//        
//            String sql="SELECT f.Name FROM Faculty f";
//            pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            
//            return rs;
//            
//        
//    }
    
    public static int findFacultyID(String organizedby) throws SQLException
    {
        String sql="SELECT FacultyID FROM Faculty WHERE FacultyName='"+organizedby+"'";
        pst=conn.prepareStatement(sql);
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
