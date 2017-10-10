/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import Model.Model_Student;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author sewmi
 */
public class Controller_Student {
    static Connection conn=null;
     
//     public Controller_Student() {
//        conn=DBConnect.connect();   
//    }
    public static void AddStudent(Model_Student Student) throws SQLException{
        conn=DBConnect.connect();     
        String query="INSERT INTO Students(fName,lName, nic, phone,course, department) VALUES('"
                + Student.getFname() +"','"+ Student.getLname() +"','"+ Student.getNic() +"',"
                + Student.getPhone() +",'"+ Student.getCourse() +"','"+ Student.getDepartment() +"');" ;       
        Statement stmt = conn.createStatement();
        stmt.executeQuery(query);   
    }
    
    
    
    

     
     
     
     
}
