/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Constants.MessageConsts;
import static Controller.EventController.conn;
import DBConnection.DBConnect;
import Model.StaffModel;
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
public class StaffController {
    static Connection conn=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;

    
    
    
    Validation v=new Validation();
    
    public StaffController() {
        
        
        //connect to DB
        conn=DBConnect.connect();
        
    
    }
        

    public static boolean AddStaff(StaffModel staff) throws SQLException
    {
        conn=DBConnect.connect();
        
        try 
        {
            String q="INSERT INTO Staff(FirstName,LastName,Faculty,Position,NIC) VALUES ('"+staff.getFirstName()+"','"+staff.getLastName()+"','"+staff.getFaculty()+"','"+staff.getPosition()+"','"+staff.getNIC()+"')";

            System.out.println("d");
            Statement stm = conn.createStatement(); 
            int executeUpdate = stm.executeUpdate(q);
            System.out.println("e");
            JOptionPane.showMessageDialog(null, MessageConsts.InsertSuccess);
            return true;
        } 
        catch (Exception e)
        {
            System.out.println("f");
            JOptionPane.showMessageDialog(null, MessageConsts.InsertFail);
            return false;
        }
        
//        int executeUpdate = stm.executeUpdate(q);
//
////        return executeUpdate;
//        if (executeUpdate>0)
//        {
//            JOptionPane.showMessageDialog(null, MessageConsts.InsertSuccess);
//            return true;
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, MessageConsts.InsertFail);
//            return false;
//        }
      
    }
    public static ResultSet loadStafftable() throws SQLException{
        conn=DBConnect.connect();
        
        String query="SELECT s.StaffID,s.FirstName,s.LastName,f.FacultyName,s.Position FROM Staff s,Faculty f WHERE f.FacultyID=s.Faculty";
        
        pst=conn.prepareStatement(query);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    public static int findFacultyID(String facultytxt) throws SQLException
    {
        String sql="SELECT FacultyID FROM Faculty WHERE FacultyName='"+facultytxt+"'";
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
