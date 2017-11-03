/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import static Controller.EventController.pst;
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
        

    public static int AddFaculty(FacultyModel faculty) throws SQLException
    {
        conn=DBConnect.connect();
        
        String q="INSERT INTO Faculty(FacultyName,FacultyDean) VALUES ('"+faculty.getFacultyName()+"','"+faculty.getFacultyDean()+"')";

        Statement stm = conn.createStatement();

        int executeUpdate = stm.executeUpdate(q);

        return executeUpdate;
      
    }
    public static ResultSet loadFacultytable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT * FROM Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    public static void UpdateFaculty(FacultyModel faculty) throws SQLException
    {
        conn=DBConnect.connect();
        
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        if(x==0)
        {
            String q="UPDATE Faculty SET FacultyName='"+faculty.getFacultyName()+"', FacultyDean='"+faculty.getFacultyDean()+"' WHERE FacultyID='"+faculty.getFacultyID()+"' ";
            pst=conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated successfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not updated");
        }

      
    }
    
    
    public static void DeleteFaculty(FacultyModel faculty) throws SQLException
    {
        conn=DBConnect.connect();
        
        int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
        if(x==0)
        {
        String q="DELETE FROM Faculty WHERE FacultyID='"+faculty.getFacultyID()+"' ";
        pst=conn.prepareStatement(q);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Deleted successfully");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not deleted");
        }
    }
    
    
    public static ResultSet SearchFaculty(String search) throws SQLException {
        
        String sql="SELECT * FROM Faculty WHERE (FacultyID LIKE '%"+search+"%') OR (FacultyName LIKE '%"+search+"%') OR (FacultyDean LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ResultSet SearchFaculty(char search) throws SQLException {
        
        String sql="SELECT * FROM Faculty WHERE (FacultyID LIKE '%"+search+"%') OR (FacultyName LIKE '%"+search+"%') OR (FacultyDean LIKE '%"+search+"%')";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        return rs;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ResultSet fillOrganizedBy() throws SQLException
    {
        conn=DBConnect.connect();
        
        String sql="SELECT FacultyName FROM Faculty";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();

        return rs;
            
        
    }
   
}
