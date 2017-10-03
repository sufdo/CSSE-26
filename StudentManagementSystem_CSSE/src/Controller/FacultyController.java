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
   
}
