//@author sewmi
package Controller;
import DBConnection.DBConnect;
import java.sql.Connection;
import Model.Model_Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller_Student {
    static Connection dbConn=null;
//add function
    public static boolean AddStudent(Model_Student Student) throws SQLException{
        try{
            dbConn=DBConnect.connect();
            
        String query="INSERT INTO students(fName,lName, nic, phone,course, department) VALUES('"
                + Student.getFname() +"','"+ Student.getLname() +"','"+ Student.getNic() +"',"
                + Student.getPhone() +",'"+ Student.getCourse() +"','"+ Student.getDepartment() +"');" ;       
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query); 
        dbConn.close();
        return true;
        }catch(Exception ex){ return false;}
    }
//check the duplicate entry
    public static boolean hasDupEntry(String nic) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT * FROM students where nic like '"+ nic +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        String nicData="";
        while(resSet.next()){
            nicData=resSet.getString(1);
        }
        dbConn.close();
        if(nicData.equals("")){
            return false;
        }else{
            return true;
        }
    }
//update function
    public static boolean UpdateStudent(Model_Student Student, String sid) throws SQLException{
        try{
        dbConn=DBConnect.connect();     
        String query="UPDATE students SET fName = '" + Student.getFname() +"',lName='"+ Student.getLname() +  
                "', nic='"+ Student.getNic() +"', phone='" + Student.getPhone() + "',course='"+ Student.getCourse() +
                "', department='" + Student.getDepartment() + "' where sid=" + sid + ";";      
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query);   
        dbConn.close();
        return true;
        }catch(Exception ex){return false;}
    }
//delete function
    public static boolean DeleteStudent(String stuId) throws SQLException{
        try{
        dbConn=DBConnect.connect();     
        String query="DELETE FROM students WHERE sid="+ stuId +";";
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query); 
          dbConn.close();
          return true;
                  }catch(Exception ex){
                      return false;
                  }
    }
    
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;
//fill the Default data table 
    public static ResultSet FillStuDataTable() throws SQLException{
        dbConn=DBConnect.connect();
        String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName, "
                + "c.CourseName from students as s inner join course as c"
                + " on s.course = c.CourseID inner join faculty as f  on s.department = f.FacultyID ;";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        return resSet;
    }
//fill the data table
    public static ResultSet FillStuDt_Ser(String typ, String valu) throws SQLException{
        dbConn=DBConnect.connect(); 
        if(typ.equals("StudentID")){
            String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                    + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                    + " inner join faculty as f  on s.department = f.FacultyID where s.sid="+ valu +";";
            // String query="SELECT * FROM Students where sid="+ valu +";";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="FirstName"){
            String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where s.fName like '"+ valu +"%';";
            //String query="SELECT * FROM Students where fName like '"+ valu +"%';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="LastName"){
            String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where s.lName like '"+ valu +"%';";
            //String query="SELECT * FROM Students where lName like '"+ valu +"%';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Nic"){
            String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where s.nic like '"+ valu +"';";
            //String query="SELECT * FROM Students where nic like '"+ valu +"';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Phone"){
             String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where s.phone="+ valu +";";
            //String query="SELECT * FROM Students where phone = "+ valu +";";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Department"){
            String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where f.FacultyName like '"+ valu +"%';";
            //String query="SELECT * FROM Students where department like '"+ valu +"';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Course"){
             String query="select s.sid,s.fName, s.lName, s.nic,s.phone,f.FacultyName,"
                 + " c.CourseName from students as s inner join course as c on s.course = c.CourseID"
                 + " inner join faculty as f  on s.department = f.FacultyID where c.CourseName like '"+ valu +"%';";
            //String query="SELECT * FROM Students where course like '"+ valu +"';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }
        return resSet;
    }
//return the last student id
    public static int retLastID() throws SQLException{
        dbConn=DBConnect.connect();     
        String query="select sid from students order by sid desc limit 1;";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        int lastId=0;
        while(resSet.next()){
            lastId=Integer.parseInt(resSet.getString(1));
        }
        dbConn.close();
        return lastId;
    }
    //return the Course id
    public static int retCourseID(String Name) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="select CourseID from course where CourseName like '"+ Name +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        int lastId=0;
        while(resSet.next()){
            lastId=Integer.parseInt(resSet.getString(1));
        }
        dbConn.close();
        return lastId;
    }
     //return the Department id
    public static int retDepartmentID(String Name) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="select FacultyID from faculty where FacultyName like '"+ Name +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        int lastId=0;
        while(resSet.next()){
            lastId=Integer.parseInt(resSet.getString(1));
        }
        dbConn.close();
        return lastId;
    }
}
