/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/*
 * @author sewmi
 */
public class Model_Student {
    public String FName, LName , Nic;
    public int Phone, Course, Department;
    
    public Model_Student(String fName,String lName ,String nic,int course,int department, int phone) {
        FName = fName;LName = lName;Nic = nic;Course = course;Department = department;Phone = phone;
    };
      
    public void StoreFname(String fName){
        FName=fName;  
    }
    public String getFname(){
        return FName;
    }
    public void StoreLname(String lName){
        LName=lName;  
    }
    public String getLname(){
        return LName;
    }
    public void StoreNic(String nic){
        Nic=nic;  
    }
    public String getNic(){
        return Nic;
    }
    public void StoreCourse(int course){
        Course=course;  
    }
    public int getCourse(){
        return Course;
    }
    public void StoreDepartment(int department){
        Department=department;  
    }
    public int getDepartment(){
        return Department;
    }
    public void StorePhone(int phone){
        Phone= phone;  
    }
    public int getPhone(){
        return Phone;
    }
    
}
