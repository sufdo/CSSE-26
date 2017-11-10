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
public class EventModel {

    public String EventID;
    public String Name;
    public int OrganizedBy;
    public String Category;
    public String Venue;
    public String Date;
    public String Time;

    //constructors
    public EventModel() {

    }

    public EventModel(String eventid, String name, int organizedby, String category, String venue, String date, String time) {
        EventID = eventid;
        Name = name;
        OrganizedBy = organizedby;
        Category = category;
        Venue = venue;
        Date = date;
        Time = time;
    }

    public EventModel(String name, int organizedby, String category, String venue, String date, String time) {
        Name = name;
        OrganizedBy = organizedby;
        Category = category;
        Venue = venue;
        Date = date;
        Time = time;
    }

    public EventModel(String eventid) {
        EventID = eventid;
    }

    //getters  
    //to get event id
    public String getEventID() {
        return EventID;
    }

    //to get name
    public String getName() {
        return Name;
    }

    //to get the faculty which organizes the event
    public int getOrganizedBy() {
        return OrganizedBy;
    }

    //to get the category
    public String getCategory() {
        return Category;
    }

    //to get the venue of event
    public String getVenue() {
        return Venue;
    }

    //to get the date of the event
    public String getDate() {
        return Date;
    }

    //to get the time
    public String getTime() {
        return Time;
    }

    //setters
    //to set the event id
    public void setEventID(String eventid) {
        EventID = eventid;
    }

    //to set the name
    public void setName(String name) {
        Name = name;
    }

    //to set the faculty which organizes the event
    public void setOrganizedBy(int organizedby) {
        OrganizedBy = organizedby;
    }

    //to set the category
    public void setCategory(String category) {
        Category = category;
    }

    //to set the venue
    public void setVenue(String venue) {
        Venue = venue;
    }

    //to set the date
    public void setDate(String date) {
        Date = date;
    }

    //to set the time
    public void setTime(String time) {
        Time = time;
    }

}
