//@author sewmi
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller_StudentViews {
    static Connection dbConn=null;
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;
    
//Student - View Profile
    public static ResultSet ViewProfile(String nic) throws SQLException{
        dbConn=DBConnect.connect();
        String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName," +
                "c.CourseName from Students as s inner join course as c on s.course = c.CourseID" +
                "inner join Faculty as f  on s.department = f.FacultyID where s.nic like '"+ nic +"'%;";
        //String query="SELECT * FROM Students where nic like '"+ nic +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
//Student - View Course
    public static ResultSet ViewCourse() throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT CourseName FROM Course;"; //need to write query
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
//Student - View Department
    public static ResultSet ViewDepartment() throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT FacultyName FROM Faculty;"; //need to write query
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();
        return resSet;
    }
}
