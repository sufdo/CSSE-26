//@author sewmi
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller_Login {
    static Connection dbConn=null;
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;
//login function for student
    public static boolean loginStudent(String userName,String Password) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT nic FROM Students where fName like '"+ userName +"'";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        String passwo="";
        while(resSet.next()){
            passwo=resSet.getString(1);
        }
        dbConn.close();
        if(Password.equals(passwo)){
            return true;
        }else{
            return false;
        }
    }
//login function for Admin
    public static boolean loginAdmin(String userName,String Password) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT pass FROM admin where uName like '"+ userName +"'";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        String passwo="";
        while(resSet.next()){
            passwo=resSet.getString(1);
        }
        dbConn.close();
        if(Password.equals(passwo)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean loginDean(String userName,String Password) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT Position FROM Staff where FirstName = '"+ userName +"'";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery(); 
        String position=null;
        while(resSet.next())
        {
            position=resSet.getString("Position");
        }
        if(position.equals("Dean"))
        {
            String query2="SELECT NIC FROM Staff where FirstName = '"+ userName +"'";
            preSt=dbConn.prepareStatement(query2);
            resSet=preSt.executeQuery();
            
            String passwo="";
            while(resSet.next()){
                passwo=resSet.getString("NIC");
            }
            if(Password.equals(passwo)){
                return true;
            }else{
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }
    
    public static boolean loginLecturer(String userName,String Password) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT Position FROM Staff where FirstName like '"+ userName +"'";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery(); 
        String position=null;
        while(resSet.next())
        {
            position=resSet.getString("Position");
        }
        if(position.equals("Lecturer"))
        {
            String query3="SELECT NIC FROM Staff where FirstName like '"+ userName +"'";
            preSt=dbConn.prepareStatement(query3);
            resSet=preSt.executeQuery();
            
            String passwo="";
            while(resSet.next()){
                passwo=resSet.getString("NIC");
            }
            if(Password.equals(passwo)){
                return true;
            }else{
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }
}
