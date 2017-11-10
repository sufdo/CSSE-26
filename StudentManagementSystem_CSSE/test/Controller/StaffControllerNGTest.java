/*
 *This is the test case class to test
 *AddStaff method in StaffController class
 *which insert a staff member to staff table.
 */
package Controller;

import DBConnection.DBConnect;
import Model.StaffModel;
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
public class StaffControllerNGTest {
    //values assigned to constants to be added to staff table
    public static final String FNAME="Manel";
    public static final String LNAME="Fonseka";
    public static final int FACULTY=9;
    public static final String POSITION="Lecturer";
    public static final String NIC="645394128v";
    
    
    StaffController staffcontroller;
    StaffModel staffmodel;
    
    public StaffControllerNGTest() {
        //connecting to the database
        conn=DBConnect.connect();
        //creating a new object from StaffController
        staffcontroller=new StaffController();
        //creating a new object from StaffModel
        staffmodel=new StaffModel(FNAME,LNAME,FACULTY,POSITION,NIC);        
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
     * Test of AddStaff method, of class StaffController.
     * @throws java.lang.Exception
     */
    @Test
    public void testAddStaff() throws Exception {
          Assert.assertTrue(staffcontroller.AddStaff(staffmodel));
    }

}
