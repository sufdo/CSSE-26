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
public class FacultyModel {

    public String FacultyID;
    public String FacultyName;
    public String FacultyDean;

    //constructors
    public FacultyModel() {

    }

    public FacultyModel(String facultyid, String facultyname, String facultydean) {
        FacultyID = facultyid;
        FacultyName = facultyname;
        FacultyDean = facultydean;
    }

    public FacultyModel(String facultyname, String facultydean) {
        FacultyName = facultyname;
        FacultyDean = facultydean;
    }

    public FacultyModel(String facultyid) {
        FacultyID = facultyid;
    }

    //getters
    //to get faculty id
    public String getFacultyID() {
        return FacultyID;
    }
    //to get faculty name
    public String getFacultyName() {
        return FacultyName;
    }
    //to get faculty dean
    public String getFacultyDean() {
        return FacultyDean;
    }

    //setters
    //to set faculty id
    public void setFacultyID(String facultyid) {
        FacultyID = facultyid;
    }
    //to set faculty name
    public void setFacultyName(String facultyname) {
        FacultyName = facultyname;
    }
    //to set faculty dean
    public void setFacultyDean(String facultydean) {
        FacultyDean = facultydean;
    }

}
