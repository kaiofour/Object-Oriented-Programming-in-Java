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
 * BasedPlusCommissionEmployee
-totalSales:double
-baseSalary:double
-empName:String
-empID:int
+computeSalary():double
 -> less than  10,000 - 5% sales
 -> less than 100,000 but greater than or eal to 10k - 10 % sales
 -> less than 1M - 20% sales
 -> above and equal to 1 M - 30% sales
 ->commision + base salry
+displayHourlyEmployee():void
 -> Employee ID: xxx
    Employee Name: xxx
+toString():String
 -> similar with display
 * 
 * @author Russel
 */
// Class for BasedPlusCommissionEmployee, which extends CommissionEmployee
// BasedPlusCommissionEmployee.java
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    // Constructor
    public BasedPlusCommissionEmployee(String empName, int empID, double totalSales, double baseSalary) {
        this.empName = empName;
        this.empID = empID;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    
    public BasedPlusCommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    
    public BasedPlusCommissionEmployee() {
    }
    
    // Getter and Setter for totalSales
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Getter and Setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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

    // Method to compute salary (base salary + commission)
    public double computeSalary() {
        double commission;
        if (totalSales < 10000) {
            commission = totalSales * 0.05;
        } else if (totalSales < 100000) {
            commission = totalSales * 0.10;
        } else if (totalSales < 1000000) {
            commission = totalSales * 0.20;
        } else {
            commission = totalSales * 0.30;
        }
        return commission + baseSalary;
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
