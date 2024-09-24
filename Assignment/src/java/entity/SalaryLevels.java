/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class SalaryLevels {
    private String SalaryLevelID;
    private String LevelName;
    private int HourlyRate;

    public SalaryLevels(String SalaryLevelID, String LevelName, int HourlyRate) {
        this.SalaryLevelID = SalaryLevelID;
        this.LevelName = LevelName;
        this.HourlyRate = HourlyRate;
    }

    public String getSalaryLevelID() {
        return SalaryLevelID;
    }

    public void setSalaryLevelID(String SalaryLevelID) {
        this.SalaryLevelID = SalaryLevelID;
    }

    public String getLevelName() {
        return LevelName;
    }

    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    public int getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(int HourlyRate) {
        this.HourlyRate = HourlyRate;
    }
    
    
}
