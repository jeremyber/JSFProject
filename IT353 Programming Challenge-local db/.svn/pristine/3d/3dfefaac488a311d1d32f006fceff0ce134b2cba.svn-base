/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author it3530122
 */
@ManagedBean
@RequestScoped 
public class TimeslotBean 
{
    private int id;
    private String timeslot;
    private boolean available;
    private String takenBy;

    public int getId() {
        return id;
    }
    public String getTimeslot() {
        return timeslot;
    }
    public boolean getAvailable() {
        return available;
    }
    public String getAvailableString()
    {
        if(available)
            return "available";
        else
            return "unavailable"; 
    }
    public String getTakenBy() {
        return takenBy;
    }

    
    public void setId(int id) {
        this.id = id;
    }
    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
    }
}
