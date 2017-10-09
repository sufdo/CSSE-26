/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author codeParane
 */
public class Model_Student {
    public String FName, LName , Nic, Course, Department;
    public int Phone;
    
    public Model_Student(String fName,String lName ,String nic,String course,String department, int phone)
    {
        FName = fName;
        LName = lName;
        Nic = nic;
        Course = course;
        Department = department;
    };
    
}
