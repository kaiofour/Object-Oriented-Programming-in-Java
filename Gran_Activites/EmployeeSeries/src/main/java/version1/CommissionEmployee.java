/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version1;


/**
 * CommissionEmployee
-totalSales:double
-empName:String
-empID:int
+computeSalary():double
 -> less than  10,000 - 5% sales
 -> less than 100,000 but greater than or eal to 10k - 10 % sales
 -> less than 1M - 20% sales
 -> above and equal to 1 M - 30% sales
+displayHourlyEmployee():void
 -> Employee ID: xxx
    Employee Name: xxx
+toString():String
 -> similar with display
 * @author Russel
 */

// CommissionEmployee.java
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    // Constructor
    public CommissionEmployee(String empName, int empID, double totalSales) {
        this.empName = empName;
        this.empID = empID;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public CommissionEmployee() {
    }
    
    // Getter and Setter for totalSales
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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

    // Method to compute salary based on sales ranges
    public double computeSalary() {
        if (totalSales < 10000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.10;
        } else if (totalSales < 1000000) {
            return totalSales * 0.20;
        } else {
            return totalSales * 0.30;
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
