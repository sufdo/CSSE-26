/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.StaffController.conn;
import DBConnection.DBConnect;
import Model.EventModel;
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
public class EventControllerNGTest {
    public static final String EVENTID="22";
    public static final String NAME="Walk";
    public static final int ORGANIZEDBY=10;
    public static final String CATEGORY="charity";
    public static final String VENUE="townhall";
    public static final String DATE="14-03-2018";
    public static final String TIME="08.00am";
    
    EventController eventcontroller;
    EventModel eventmodel;
    //EventModel eventmodel1;
    //EventModel eventmodel2;
    public EventControllerNGTest() {
        conn=DBConnect.connect();
        eventcontroller=new EventController();
        eventmodel=new EventModel(NAME,ORGANIZEDBY,CATEGORY,VENUE,DATE,TIME);
        //eventmodel1=new EventModel(EVENTID,NAME,ORGANIZEDBY,CATEGORY,VENUE,DATE,TIME);
        //eventmodel2=new EventModel(EVENTID);
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
     * Test of AddEvent method, of class EventController.
     */
    @Test
    public void testAddEvent() throws Exception {
          Assert.assertTrue(eventcontroller.AddEvent(eventmodel));
    }

    

    /**
     * Test of UpdateEvent method, of class EventController.
     */
    @Test(dependsOnMethods = {"testAddEvent"})
    public void testUpdateEvent() throws Exception {
        Assert.assertTrue(eventcontroller.UpdateEvent(eventmodel,EVENTID));
    }

    /**
     * Test of DeleteEvent method, of class EventController.
     */
    @Test(dependsOnMethods = {"testAddEvent","testUpdateEvent"})
    public void testDeleteEvent() throws Exception {
       Assert.assertTrue(eventcontroller.DeleteEvent(EVENTID));
    }

    
}
