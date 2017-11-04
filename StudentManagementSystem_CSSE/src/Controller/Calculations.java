/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DBConnection.DBConnect;
import Model.EventModel;
import Model.FacultyModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Calculations {
  
    static Connection conn=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;
    
 //   Validation v=new Validation();
    
    public static double gpa(Integer year,Integer sem, String sid) throws SQLException
    {
        //connect to the database
        conn=DBConnect.connect();
        //Declare the loacal variables
        String marks;
        Integer count;
        double grade=0.0;
        double totalgpa;
        
        //When a user enters year 1 semester 1
        if (year==1 && sem==1){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                   grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
       //When a user enters year 1 semester 2
        else if (year==1 && sem==2){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                   grade=grade + 2.0;
                }
                else
                {
                   grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
        //When a user enters year 2 semester 1
        else if (year==2 && sem==1){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }   
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        //When a user enters year 2 semester 2
        else if (year==2 && sem==2){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){ 
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }    
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }   
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
        //When a user enters year 3 semester 1
        else if (year==3 && sem==1){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
        //When a user enters year 3 semester 2
        else if (year==3 && sem==2){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {   
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
        //When a user enters year 4 semester 1
        else if (year==4 && sem==1){
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
        
        //When a user enters year 4 semester 2
        else{
        
            String query1="select m.mark from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query1);
            rs=pst.executeQuery();
            
        
            while(rs.next())
            {
                marks=rs.getString(1);
           
                double mark=Double.parseDouble(marks);
           
                if(mark>=75.0 && mark<=100.0){
                    grade=grade + 4.0;
                }
                else if(mark>=65.0){
                    grade=grade + 3.5;
                }
                else if(mark>=55.0){
                    grade=grade + 3.0;
                }
                else if(mark>=45.0){
                    grade=grade + 2.0;
                }
                else
                {
                    grade=grade + 1.0;
                }
           
            }
        
                 
            String moudles="";
         
         
            String query2="select count(m.cid) from marks m where sid='"+sid+"' and year="+year+" and semester="+sem+" group by sid='"+sid+"'";

            pst=conn.prepareStatement(query2);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                moudles=rs.getString(1);
            }
        
            count= Integer.parseInt(moudles);
            
            totalgpa=(grade/count);
            
            return totalgpa;
             
        }
    
    }
    
    public static void addgpa(double totalgpa,String sid,Integer year,Integer sem)throws SQLException
    {
    
        //connect to the database
        conn=DBConnect.connect();
        
        //Insert the gpa into the table
        String q="INSERT INTO calculate(sid,gpa,year,sem) VALUES ('"+sid+"',"+totalgpa+","+year+","+sem+")";

        Statement stm = conn.createStatement();

        stm.executeUpdate(q);
        
    
    };
    
    public static ResultSet searchgpa(String sid)throws SQLException
    {
        conn=DBConnect.connect();
        
        //retriving all the rows related to the given sid
        String sql1="select sid as SID,year as Year,sem as Semester,gpa as GPA from calculate where sid like'%"+sid+"%'";
        pst=conn.prepareStatement(sql1);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    
    public static void addmarks(String sid,String cid,Integer year,Integer sem,Double marks)throws SQLException
    {
        conn=DBConnect.connect();
    
         
                String q1="INSERT INTO marks(sid,cid,year,semester,mark) values('"+sid+"','"+cid+"',"+year+","+sem+","+marks+")";
                if((marks<100.0) && (marks>-1) ) 
                    {
                    
                     pst=conn.prepareStatement(q1);
                     pst.execute();
                                          
                    }
                else 
                {
                 
                    JOptionPane.showMessageDialog(null,"Invalid Input!!!","Error",JOptionPane.INFORMATION_MESSAGE);
                }
                     
    }
    
    public static void updateMarks(String sid,String cid,Integer year,Integer sem,Double marks)throws SQLException
    {
        conn=DBConnect.connect();
        
         String quary1="Update marks set cid='"+cid+"',year="+year+",semester="+sem+",mark="+marks+" where sid='"+sid+"' and cid='"+cid+"'";
                    
         if((sid.length()<=10) && (marks<100.0) && (marks>-1) )
         {
                pst=conn.prepareStatement(quary1);
                pst.execute();
         }
             
         else 
         {
              JOptionPane.showMessageDialog(null,"Invalid Input!!!","Error",JOptionPane.INFORMATION_MESSAGE);
                    
         }
    
    }
    
    public static void deletemarks(String sid,String cid)throws SQLException
    {
            conn=DBConnect.connect();
            
            String quary1="Delete from marks where sid='"+sid+"' and cid='"+cid+"'";
                      
             pst=conn.prepareStatement(quary1);
             pst.execute();
             
         
    }        
    
     public static ResultSet searchmarks(String sid)throws SQLException
    {
        conn=DBConnect.connect();
        
        //retriving all the rows related to the given sid
        String sql1="select sid as SID,cid as CourseID, year as Year,semester as Semester,mark as Marks from marks where sid like'%"+sid+"%'";
        pst=conn.prepareStatement(sql1);
        rs=pst.executeQuery();
        
        return rs;
    }
    
    
    
    
}
