//@author sewmi
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller_View_DPC {
    static Connection dbConn=null;
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;
    
//Student - View Profile
    public static ResultSet ViewProfile(String nic) throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT * FROM Students where nic like '"+ nic +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
//Student - View Course
    public static ResultSet ViewCourse() throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT * FROM Students where nic like;"; //need to write query
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
//Student - View Department
    public static ResultSet ViewDepartment() throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT * FROM Students where nic like;"; //need to write query
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
}
