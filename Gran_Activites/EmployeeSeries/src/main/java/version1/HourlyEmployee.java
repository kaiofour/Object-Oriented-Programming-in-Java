/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;

/**
 *
 * @author Russel
 */

/**
 * Version 1
HourlyEmployee
-totalHoursWorked:float
-ratePerHour:double
-empName:String
-empID:int
+computeSalary():double
 -> total hours worked * rate per hour
 -> overtime will be paid 150%
 -> when it is over 40 hours
+displayHourlyEmployee():void
 -> Employee ID: xxx
    Employee Name: xxx
+toString():String
 -> similar with display

 * @author Russel
 */

// HourlyEmployee.java
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    // Constructor
    public HourlyEmployee(String empName, int empID, float totalHoursWorked, double ratePerHour) {
        this.empName = empName;
        this.empID = empID;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public void HourlyEmployee() {
    }
    

    // Getter and Setter for totalHoursWorked
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    // Getter and Setter for ratePerHour
    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    // Getter and Setter for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for empID
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    // Method to compute salary with overtime logic
    public double computeSalary() {
        if (totalHoursWorked > 40) {
            return (40 * ratePerHour) + ((totalHoursWorked - 40) * ratePerHour * 1.5);
        } else {
            return totalHoursWorked * ratePerHour;
        }
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
    }

    // Method to convert employee details to string
    @Override
    public String toString() {
        return "Employee ID: " + empID + ", Employee Name: " + empName;
    }
}
