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
    public static void AddStudent(Model_Student Student) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="INSERT INTO Students(fName,lName, nic, phone,course, department) VALUES('"
                + Student.getFname() +"','"+ Student.getLname() +"','"+ Student.getNic() +"',"
                + Student.getPhone() +",'"+ Student.getCourse() +"','"+ Student.getDepartment() +"');" ;       
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query);   
    }
//check the duplicate entry
    public static boolean hasDupEntry(String nic) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="SELECT * FROM Students where nic like '"+ nic +"';";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        String nicData="";
        while(resSet.next()){
            nicData=resSet.getString(1);
        }
        if(nicData.equals("")){
            return false;
        }else{
            return true;
        }
    }
//update function
    public static void UpdateStudent(Model_Student Student, String sid) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="UPDATE Students SET fName = '" + Student.getFname() +"',lName='"+ Student.getLname() +  
                "', nic='"+ Student.getNic() +"', phone='" + Student.getPhone() + "',course='"+ Student.getCourse() +
                "', department='" + Student.getDepartment() + "' where sid=" + sid + ";";      
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query);   
        dbConn.close();
    }
//delete function
    public static void DeleteStudent(String stuId) throws SQLException{
        dbConn=DBConnect.connect();     
        String query="DELETE FROM Students WHERE sid="+ stuId +";";
        Statement stmt = dbConn.createStatement();
        stmt.executeUpdate(query); 
    }
    
    static PreparedStatement preSt=null;
    static ResultSet resSet=null;
//fill the Default data table 
    public static ResultSet FillStuDataTable() throws SQLException{
        dbConn=DBConnect.connect();
        String query="SELECT *  FROM Students";
        preSt=dbConn.prepareStatement(query);
        resSet=preSt.executeQuery();      
        return resSet;
    }
//fill the data table
    public static ResultSet FillStuDt_Ser(String typ, String valu) throws SQLException{
        dbConn=DBConnect.connect(); 
        if(typ.equals("StudentID")){
            String query="SELECT * FROM Students where sid="+ valu +";";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="FirstName"){
            String query="SELECT * FROM Students where fName like '"+ valu +"%';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="LastName"){
            String query="SELECT * FROM Students where lName like '"+ valu +"%';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Nic"){
            String query="SELECT * FROM Students where nic like '"+ valu +"';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Phone"){
            String query="SELECT * FROM Students where phone = "+ valu +";";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Department"){
            String query="SELECT * FROM Students where department like '"+ valu +"';";
            preSt=dbConn.prepareStatement(query);
            resSet=preSt.executeQuery();
        }else if(typ=="Course"){
            String query="SELECT * FROM Students where course like '"+ valu +"';";
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
        return lastId;
    }
}
