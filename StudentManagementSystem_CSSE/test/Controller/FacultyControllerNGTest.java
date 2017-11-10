/*
 *This is the test case class to test
 *AddFaculty method, UpdateFaculty method and DeleteFaculty method in FacultyController class
 *which insert,update and delete a faculty.
 */
package Controller;

import DBConnection.DBConnect;
import Model.FacultyModel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import static Controller.StaffController.conn;

/**
 *
 * @author Rishni
 */
public class FacultyControllerNGTest {
    //values assigned to constants to be added to faculty table
    public static final String FACULTYID="39";
    public static final String FACULTYNAME="Tourism";
    public static final String FACULTYDEAN="Lasantha Vithanage";
    
    FacultyController facultycontroller;
    FacultyModel facultymodel;
    //FacultyModel facultymodel1;
    //FacultyModel facultymodel2;
    
    public FacultyControllerNGTest() {
        //connecting to the database
        conn=DBConnect.connect();
        //creating a new object from FacultyController
        facultycontroller=new FacultyController();
        //creating a new object from FacultyModel
        facultymodel=new FacultyModel(FACULTYNAME,FACULTYDEAN);
        //facultymodel1=new FacultyModel(FACULTYID,FACULTYNAME,FACULTYDEAN);
        //facultymodel2=new FacultyModel(FACULTYID);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of AddFaculty method, of class FacultyController.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddFaculty() throws Exception {
  
          Assert.assertTrue(facultycontroller.AddFaculty(facultymodel));
    }

    /**
     * Test of UpdateFaculty method, of class FacultyController
     * after the faculty is added.
     * @throws java.lang.Exception
     */
    @Test(dependsOnMethods = {"testAddFaculty"})
    public void testUpdateFaculty() throws Exception {
        Assert.assertTrue(facultycontroller.UpdateFaculty(facultymodel,FACULTYID));
    }

    /**
     * Test of DeleteFaculty method, of class FacultyController
     * after the faculty is added and updated.
     * @throws java.lang.Exception
     */
    @Test(dependsOnMethods = {"testAddFaculty","testUpdateFaculty"})
    public void testDeleteFaculty() throws Exception {
        Assert.assertTrue(facultycontroller.DeleteFaculty(FACULTYID));
    }
}
