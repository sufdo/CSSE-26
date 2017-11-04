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
public class StaffModel {
    public String StaffID;
    public String FirstName;
    public String LastName;
    public int Faculty;
    public String Position;
    public String NIC;
  
    
    public StaffModel()
    {
        
    }
    
    public StaffModel(String staffid,String fname,String lname,int faculty,String position,String nic)
    {
        StaffID=staffid;
        FirstName=fname;
        LastName=lname;
        Faculty=faculty;
        Position=position;
        NIC=nic;
    }
    
    public StaffModel(String fname,String lname,int faculty,String position,String nic)
    {
        FirstName=fname;
        LastName=lname;
        Faculty=faculty;
        Position=position;
        NIC=nic;
    }
    
    public StaffModel(String staffid)
    {
        StaffID=staffid;
    }
    
  //getter  
    public String getStaffID()
    {
        return StaffID;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    
    public String getLastName()
    {
        return LastName;
    }
    
    public int getFaculty()
    {
        return Faculty;
    }
    
    public String getPosition()
    {
        return Position;
    }
    
    public String getNIC()
    {
        return NIC;
    }
   
    
    //setters
    public void setStaffID(String staffid)
    {
        StaffID=staffid;
    }
    
    public void setFirstName(String fname)
    {
        FirstName=fname;
    }
    
    public void setLastName(String lname)
    {
        LastName=lname;
    }
    
    public void setFaculty(int faculty)
    {
        Faculty=faculty;
    }
    
    public void setPosition(String position)
    {
        Position=position;
    }
    
    public void setNIC(String nic)
    {
        NIC=nic;
    }
    
    
   
}
