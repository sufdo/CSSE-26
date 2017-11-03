/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public EventModel()
    {
        
    }
    
    public EventModel(String eventid,String name,int organizedby,String category,String venue,String date,String time)
    {
        EventID=eventid;
        Name=name;
        OrganizedBy=organizedby;
        Category=category;
        Venue=venue;
        Date=date;
        Time=time;
    }
    
    public EventModel(String name,int organizedby,String category,String venue,String date,String time)
    {
        Name=name;
        OrganizedBy=organizedby;
        Category=category;
        Venue=venue;
        Date=date;
        Time=time;
    }
    
    public EventModel(String eventid)
    {
        EventID=eventid;
    }
    
  //getter  
    public String getEventID()
    {
        return EventID;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public int getOrganizedBy()
    {
        return OrganizedBy;
    }
    
    public String getCategory()
    {
        return Category;
    }
    
    public String getVenue()
    {
        return Venue;
    }
    
    public String getDate()
    {
        return Date;
    }
    
    public String getTime()
    {
        return Time;
    }
    
    
    //setters
    public void setEventID(String eventid)
    {
        EventID=eventid;
    }
    
    public void setName(String name)
    {
        Name=name;
    }
    
    public void setOrganizedBy(int organizedby)
    {
        OrganizedBy=organizedby;
    }
    
    public void setCategory(String category)
    {
        Category=category;
    }
    
    public void setVenue(String venue)
    {
        Venue=venue;
    }
    
    public void setDate(String date)
    {
        Date=date;
    }
    
    public void setTime(String time)
    {
        Time=time;
    }
    
}
