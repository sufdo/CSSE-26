/*
 *This is the test case class to test
 *AddEvent method, UpdateEvent method and DeleteEvent method in EventController class
 *which insert,update and delete an event.
 */
package Controller;

import DBConnection.DBConnect;
import Model.EventModel;
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
public class EventControllerNGTest {
    //values assigned to constants to be added to event table
    public static final String EVENTID="35";
    public static final String NAME="Walk";
    public static final int ORGANIZEDBY=10;
    public static final String CATEGORY="charity";
    public static final String VENUE="townhall";
    public static final String DATE="14-03-2018";
    public static final String TIME="08.00am";
    
    public static final String NEWVENUE="Malabe";
    
    EventController eventcontroller;
    EventModel eventmodel;
    EventModel eventmodel1;
    //EventModel eventmodel2;
    public EventControllerNGTest() {
        //connecting to the database
        conn=DBConnect.connect();
        //creating a new object from EventController
        eventcontroller=new EventController();
        //creating a new object from EventModel
        eventmodel=new EventModel(NAME,ORGANIZEDBY,CATEGORY,VENUE,DATE,TIME);
        eventmodel1=new EventModel(NAME,ORGANIZEDBY,CATEGORY,NEWVENUE,DATE,TIME);
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
     * @throws java.lang.Exception
     */
    @Test
    public void testAddEvent() throws Exception {
          Assert.assertTrue(eventcontroller.AddEvent(eventmodel));
    }
   
    /**
     * Test of UpdateEvent method, of class EventController
     * after the event is added.
     * @throws java.lang.Exception
     */
    @Test(dependsOnMethods = {"testAddEvent"})
    public void testUpdateEvent() throws Exception {
        Assert.assertTrue(eventcontroller.UpdateEvent(eventmodel1,EVENTID));
    }

    /**
     * Test of DeleteEvent method, of class EventController
     * after the event is added and updated.
     * @throws java.lang.Exception
     */
    @Test(dependsOnMethods = {"testAddEvent","testUpdateEvent"})
    public void testDeleteEvent() throws Exception {
       Assert.assertTrue(eventcontroller.DeleteEvent(EVENTID));
    }
}
