//package version1;
//
// abstract class Employee {
//    // Private fields for encapsulation
//    private String empName;
//    private int empID;
//
//    // Constructor
//    public Employee(String empName, int empID) {
//        this.empName = empName;
//        this.empID = empID;
//    }
//    
//    public Employee(int empID) {
//        this.empID = empID;
//    }
//    
//    public Employee() {
//    }
//
//    // Getter for employee name
//    public String getEmpName() {
//        return empName;
//    }
//
//    // Setter for employee name
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    // Getter for employee ID
//    public int getEmpID() {
//        return empID;
//    }
//
//    // Setter for employee ID
//    public void setEmpID(int empID) {
//        this.empID = empID;
//    }
//
//    // Abstract method for computing salary
//    public abstract double computeSalary();
//
//    // Abstract method for displaying employee details
//    public abstract void displayEmployee();
//
//    // Abstract method for converting employee details to string
//    public abstract String toString();
//}