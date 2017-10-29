package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * @author sewmi
 */
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
        if(Password.equals(passwo)){
            return true;
        }else{
            return false;
        }
    }
     //login function for Admin
    public static boolean loginAdmin(String userName,String Password) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT pass FROM Admin where uName like '"+ userName +"'";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        String passwo="";
        while(resSet.next()){
            passwo=resSet.getString(1);
        }
        if(Password.equals(passwo)){
            return true;
        }else{
            return false;
        }
    }
}
