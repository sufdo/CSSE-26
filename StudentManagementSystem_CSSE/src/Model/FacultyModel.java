/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rishni
 */
public class FacultyModel {
    public String FacultyID;
    public String FacultyName;
    public String FacultyDean;
    
    public FacultyModel()
    {
        
    }
    
    public FacultyModel(String facultyid,String facultyname,String facultydean)
    {
        FacultyID=facultyid;
        FacultyName=facultyname;
        FacultyDean=facultydean;
    }
    
    public FacultyModel(String facultyname,String facultydean)
    {
        FacultyName=facultyname;
        FacultyDean=facultydean;
    }
    
    public FacultyModel(String facultyid)
    {
        FacultyID=facultyid;
    }
    
    
    public String getFacultyID()
    {
        return FacultyID;
    }
    
    public String getFacultyName()
    {
        return FacultyName;
    }
    
    public String getFacultyDean()
    {
        return FacultyDean;
    }
    
    public void setFacultyID(String facultyid)
    {
        FacultyID=facultyid;
    }
    
    public void setFacultyName(String facultyname)
    {
        FacultyName=facultyname;
    }
    
    public void setFacultyDean(String facultydean)
    {
        FacultyDean=facultydean;
    }
    
    
    
    
    
    
    
   
    
}
