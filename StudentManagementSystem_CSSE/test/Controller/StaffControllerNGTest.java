/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.StaffController.conn;
import DBConnection.DBConnect;
import Model.FacultyModel;
import Model.StaffModel;
import java.sql.ResultSet;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Rishni
 */
public class StaffControllerNGTest {
    
    public static final String FNAME="Malee";
    public static final String LNAME="Dissanayake";
    public static final int FACULTY=9;
    public static final String POSITION="Lecturer";
    public static final String NIC="582354129v";
    
    
    StaffController staffcontroller;
    StaffModel staffmodel;
    
    public StaffControllerNGTest() {
        conn=DBConnect.connect();
        staffcontroller=new StaffController();
        staffmodel=new StaffModel(FNAME,LNAME,FACULTY,POSITION,NIC);
        System.out.println("a");
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
     */
    @Test
    public void testAddStaff() throws Exception {
//        System.out.println("AddStaff");
//        StaffModel staff = null;
//        int expResult = 0;
//        int result = StaffController.AddStaff(staff);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
          System.out.println("b");
          Assert.assertTrue(staffcontroller.AddStaff(staffmodel));
         System.out.println("c");
    }

//    /**
//     * Test of loadStafftable method, of class StaffController.
//     */
//    @Test
//    public void testLoadStafftable() throws Exception {
////        System.out.println("loadStafftable");
////        ResultSet expResult = null;
////        ResultSet result = StaffController.loadStafftable();
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findFacultyID method, of class StaffController.
//     */
//    @Test
//    public void testFindFacultyID() throws Exception {
////        System.out.println("findFacultyID");
////        String facultytxt = "";
////        int expResult = 0;
////        int result = StaffController.findFacultyID(facultytxt);
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
