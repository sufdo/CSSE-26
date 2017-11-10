/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.StaffController.conn;
import DBConnection.DBConnect;
import Model.FacultyModel;
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
public class FacultyControllerNGTest {
    public static final String FACULTYID="39";
    public static final String FACULTYNAME="Tourism";
    public static final String FACULTYDEAN="Lasantha Vithanage";
    
    FacultyController facultycontroller;
    FacultyModel facultymodel;
    //FacultyModel facultymodel1;
    //FacultyModel facultymodel2;
    
    public FacultyControllerNGTest() {
        conn=DBConnect.connect();
        facultycontroller=new FacultyController();
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
     */
    @Test
    public void testAddFaculty() throws Exception {
  
          Assert.assertTrue(facultycontroller.AddFaculty(facultymodel));
    }

    /**
     * Test of loadFacultytable method, of class FacultyController.
     */
//    @Test
//    public void testLoadFacultytable() throws Exception {
////        System.out.println("loadFacultytable");
////        ResultSet expResult = null;
////        ResultSet result = FacultyController.loadFacultytable();
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of UpdateFaculty method, of class FacultyController.
     */
    @Test(dependsOnMethods = {"testAddFaculty"})
    public void testUpdateFaculty() throws Exception {
        Assert.assertTrue(facultycontroller.UpdateFaculty(facultymodel,FACULTYID));
    }

    /**
     * Test of DeleteFaculty method, of class FacultyController.
     */
    @Test(dependsOnMethods = {"testAddFaculty","testUpdateFaculty"})
    public void testDeleteFaculty() throws Exception {
        Assert.assertTrue(facultycontroller.DeleteFaculty(FACULTYID));
    }

    /**
     * Test of SearchFaculty method, of class FacultyController.
     */
//    @Test
//    public void testSearchFaculty_String() throws Exception {
////        System.out.println("SearchFaculty");
////        String search = "";
////        ResultSet expResult = null;
////        ResultSet result = FacultyController.SearchFaculty(search);
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of SearchFaculty method, of class FacultyController.
//     */
//    @Test
//    public void testSearchFaculty_char() throws Exception {
////        System.out.println("SearchFaculty");
////        char search = ' ';
////        ResultSet expResult = null;
////        ResultSet result = FacultyController.SearchFaculty(search);
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fillOrganizedBy method, of class FacultyController.
//     */
//    @Test
//    public void testFillOrganizedBy() throws Exception {
////        System.out.println("fillOrganizedBy");
////        ResultSet expResult = null;
////        ResultSet result = FacultyController.fillOrganizedBy();
////        assertEquals(result, expResult);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
