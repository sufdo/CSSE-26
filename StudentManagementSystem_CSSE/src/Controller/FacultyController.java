/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Constants.MessageConsts;
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
        

    public static boolean AddFaculty(FacultyModel faculty) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String q="INSERT INTO Faculty(FacultyName,FacultyDean) VALUES ('"+faculty.getFacultyName()+"','"+faculty.getFacultyDean()+"')";

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
//        return executeUpdate;
      
    }
    public static ResultSet loadFacultytable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT * FROM Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    public static boolean UpdateFaculty(FacultyModel faculty,String id) throws SQLException
    {
        try 
        {
            conn=DBConnect.connect();
            int x=JOptionPane.showConfirmDialog(null, MessageConsts.updateQuestion);

            if(x==0)
            {
                String query="UPDATE Faculty SET FacultyName='"+faculty.getFacultyName()+"', FacultyDean='"+faculty.getFacultyDean()+"' WHERE FacultyID='"+id+"' ";
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
    
    
    public static boolean DeleteFaculty(String faculty) throws SQLException
    {
        int x=JOptionPane.showConfirmDialog(null, MessageConsts.deleteQuestion);

            try
            {
                if(x==0)
                {
                    conn=DBConnect.connect();
                    String query="DELETE FROM Faculty WHERE FacultyID='"+faculty+"' ";
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
