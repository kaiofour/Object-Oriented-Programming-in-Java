package com.mycompany.employeeseries;


import version3.*;
import version4.*;


public class EmployeeSeries {
    public static void main(String[] args) {
        
        EmployeeRoster employeeRoster = new EmployeeRoster();

        Employee employee1 = new Employee(new Name("Rus", "Ed", "A"), new MyDate(1990, 1, 1), new MyDate(2023, 1, 1), 1);
        Employee employee2 = new HourlyEmployee(new Name("Aj", "Yap", "B"), new MyDate(2000, 3, 10), new MyDate(2023, 3, 10), 2);
        Employee employee3 = new BasePlusCommissionEmployee(new Name("Trent", "Yap", "C"), new MyDate(2000, 3, 10), new MyDate(2023, 3, 10), 3);
        Employee employee4 = new CommissionEmployee(new Name("Walter", "Yap", "D"), new MyDate(2000, 3, 10), new MyDate(2023, 3, 10), 4);
        Employee employee5 = new PieceWorkerEmployee(new Name("Rus2", "Yap", "E"), new MyDate(2000, 3, 10), new MyDate(2023, 3, 10), 5);
        
        employeeRoster.addEmployee(employee1);
        employeeRoster.addEmployee(employee2);
        employeeRoster.addEmployee(employee3);
        employeeRoster.addEmployee(employee4);
        employeeRoster.addEmployee(employee5);

        employeeRoster.displayAll();
        
    }
}

