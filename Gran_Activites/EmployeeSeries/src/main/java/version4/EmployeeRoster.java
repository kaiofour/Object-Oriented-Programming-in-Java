package version4;

import version3.*;

public class EmployeeRoster {

    private Employee[] empList;
    private int count;
    private int max = 5;

//    Constructors
    public EmployeeRoster() {
        this.empList = new Employee[max];
    }

    public EmployeeRoster(int count) {
        this.count = count;
        max = 5;
    }

    public EmployeeRoster(Employee[] empList, int count, int max) {
        this.empList = empList;
        this.count = count;
        this.max = max;
    }

//    Getters and Setters
    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }


 //  These methods count the number of employees of different types.
 // TOTAL HOURLY EMPLOYEE (HE)
    public int getTotalHourly() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                x++;
            }
        }

        return x;
    }

//  PIECE WORKER (PWE)
    public int getTotalPieceWorker() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                x++;
            }
        }

        return x;
    }

//  COMMISSION EMPLOYEE (CE)
    public int getTotalCommissionEmployee() {
        int x = 0;

        for (Employee employee : empList) {
            // Check if the employee is an instance of CommissionEmployee
            if (employee instanceof CommissionEmployee) {
                x++;
            }
        }

        return x;
    }


//  BASE PLUS COMMISSION EMPLOYEE (BPCE)
    public int getTotalBaseCommissionEmployee() {
        int x = 0;

        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                x++;
            }
        }

        return x;
    }


    // ADDING NEW EMPLOYEE
    public boolean addEmployee(Employee newEmp) {
        if (count < max) {
            empList[count] = newEmp;
            count++;

            return true;
        } else {
            System.out.printf("Employee roster is full.\n");

            return false;
        }
    }

    //  Removes employee based on ID
    public Employee removeEmployee(int id) {
        int x;
        Employee deletedEmp;

        for (x = 0; x < max; x++) {
            if (empList[x].getEmpID() == id) {
                deletedEmp = empList[x];
                empList[x] = null;
                count--;

                return deletedEmp;
            }
        }
        System.out.printf("An error has occured while removing employee.\n");

        return null;
    }


    //  displayAll() method iterates over the empList and displays the information of each employee
    public void displayAll() {
        for (Employee employee : empList) {
            if (employee == null) {
                System.out.printf("No employees listed.\n");
            } else {
                employee.display();
            }
        }
    }

    //  DISPLAY for each type of employee (4 types below)
    public void displayHourlyEmployees() {
        System.out.println("Hourly Employees:\n");
        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                ((HourlyEmployee) employee).display();
                System.out.println("\n");
            }
        }
    }

    public void displayPieceWorkerEmployees() {
        System.out.println("Piece Worker Employees:\n");
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                ((PieceWorkerEmployee) employee).display();
                System.out.println("\n");
            }
        }
    }

    public void displayCommissionEmployees() {
        System.out.println("Commission Employees:\n");
        for (Employee employee : empList) {
            if (employee instanceof CommissionEmployee) {
                ((CommissionEmployee) employee).display();
                System.out.println("\n");
            }
        }
    }

    public void displayBasePlusCommissionEmployees() {
        System.out.println("Base Plus Commission Employees:\n");
        for (Employee employee : empList) {
            if (employee instanceof BasePlusCommissionEmployee) {
                ((BasePlusCommissionEmployee) employee).display();
                System.out.println("\n");
            }
        }
    }

  
}