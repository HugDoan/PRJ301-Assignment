/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Shifts {
    private String ShiftID;
    private String ShiftName;
    private Date StartTime;
    private Date EndTime;

    public Shifts(String ShiftID, String ShiftName, Date StartTime, Date EndTime) {
        this.ShiftID = ShiftID;
        this.ShiftName = ShiftName;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }

    public String getShiftID() {
        return ShiftID;
    }

    public void setShiftID(String ShiftID) {
        this.ShiftID = ShiftID;
    }

    public String getShiftName() {
        return ShiftName;
    }

    public void setShiftName(String ShiftName) {
        this.ShiftName = ShiftName;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date StartTime) {
        this.StartTime = StartTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date EndTime) {
        this.EndTime = EndTime;
    }
    
    
}
