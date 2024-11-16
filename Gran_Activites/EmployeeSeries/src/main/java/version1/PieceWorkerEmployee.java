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
 * PieceWorkerEmployee
-totalPiecesFinished:int
-ratePerPiece:double
-empName:String
-empID:int
+computeSalary():double
 -> total pieces finished * rate per piece
 -> in every hundred pieces finished an additional bonus of 10*rate per piece
+displayHourlyEmployee():void
 -> Employee ID: xxx
    Employee Name: xxx
+toString():String
 -> similar with display
 * @author Russel
 */

// PieceWorkerEmployee.java
public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    // Constructor
    public PieceWorkerEmployee(String empName, int empID, int totalPiecesFinished, double ratePerPiece) {
        this.empName = empName;
        this.empID = empID;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public PieceWorkerEmployee() {
    }
    // Getter and Setter for totalPiecesFinished
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    // Getter and Setter for ratePerPiece
    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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

    // Method to compute salary with bonus for every 100 pieces
    public double computeSalary() {
        int bonus = totalPiecesFinished / 100;
        return totalPiecesFinished * ratePerPiece + (bonus * 10 * ratePerPiece);
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
