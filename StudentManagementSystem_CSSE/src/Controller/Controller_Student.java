/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import Model.Model_Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.ResultSet;

/*
 * @author sewmi
 */

public class Controller_Student {
    static Connection dbConn=null;

    public static void AddStudent(Model_Student Student) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="INSERT INTO Students(fName,lName, nic, phone,course, department) VALUES('"
                + Student.getFname() +"','"+ Student.getLname() +"','"+ Student.getNic() +"',"
                + Student.getPhone() +",'"+ Student.getCourse() +"','"+ Student.getDepartment() +"');" ;       
        Statement stmt = dbConn.createStatement();
        stmt.executeQuery(query);   
        dbConn.close();
    }
    public static void UpdateStudent(Model_Student Student) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="UPDATE Students SET fName = '',lName='', nic='', phone='',course='', department='';";
               // + Student.getFname() +"','"+ Student.getLname() + "','"+ Student.getNic() +"',"
               // + Student.getPhone() +",'"+ Student.getCourse() + "','"+ Student.getDepartment() +"');" ;       
        Statement stmt = dbConn.createStatement();
        stmt.executeQuery(query);   
        dbConn.close();
    }
    public static void DeleteStudent(String stuId) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="DELETE FROM Students WHERE id="+ stuId +";";
        Statement stmt = dbConn.createStatement();
        stmt.executeQuery(query);   
        dbConn.close();
    }
    
    static PreparedStatement pst=null;
    static ResultSet rs=null;
    public static ResultSet loadFacultytable() throws SQLException{
        dbConn=DBConnect.connect();
    
        String query="SELECT * FROM Faculty";
        pst=dbConn.prepareStatement(query);
        rs=pst.executeQuery();
      
        return rs;
    }
  
     
}
