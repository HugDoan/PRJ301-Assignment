/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Employee {
    private String employeeID;
    private String employeeName;
    private String salaryLevelID;

    public Employee(String employeeID, String employeeName, String salaryLevelID) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salaryLevelID = salaryLevelID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalaryLevelID() {
        return salaryLevelID;
    }

    public void setSalaryLevelID(String salaryLevelID) {
        this.salaryLevelID = salaryLevelID;
    }
    
    
    
}
