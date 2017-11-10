/*
 * This class consists of
 * constructors, getters
 * and setters.
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

    //constructors
    public StaffModel() {

    }

    public StaffModel(String staffid, String fname, String lname, int faculty, String position, String nic) {
        StaffID = staffid;
        FirstName = fname;
        LastName = lname;
        Faculty = faculty;
        Position = position;
        NIC = nic;
    }

    public StaffModel(String fname, String lname, int faculty, String position, String nic) {
        FirstName = fname;
        LastName = lname;
        Faculty = faculty;
        Position = position;
        NIC = nic;
    }

    public StaffModel(String staffid) {
        StaffID = staffid;
    }

    //getters  
    //to get staff id
    public String getStaffID() {
        return StaffID;
    }

    //to get first name
    public String getFirstName() {
        return FirstName;
    }

    //to get last name
    public String getLastName() {
        return LastName;
    }

    //to get faculty
    public int getFaculty() {
        return Faculty;
    }

    //to get position
    public String getPosition() {
        return Position;
    }

    //to get nic
    public String getNIC() {
        return NIC;
    }

    //setters
    //to set staff id
    public void setStaffID(String staffid) {
        StaffID = staffid;
    }

    //to set first name
    public void setFirstName(String fname) {
        FirstName = fname;
    }

    //to set last name
    public void setLastName(String lname) {
        LastName = lname;
    }

    //to set faculty
    public void setFaculty(int faculty) {
        Faculty = faculty;
    }

    //to set position
    public void setPosition(String position) {
        Position = position;
    }

    //to set nic
    public void setNIC(String nic) {
        NIC = nic;
    }

}
