package version3;

public class Employee {
    private Name empName;
    private int empID;
    private MyDate birthDate;
    private MyDate startDate;

    public Employee() {
    }
    
    public Employee(Name empName, int empID) {
        this.empName = new Name(empName.getFname(), empName.getLname(), empName.getMI());
        this.empID = empID;
    }

    public Employee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        this(empName,empID);
        this.birthDate = new MyDate(birthDate.getYear(),birthDate.getMonth(),birthDate.getDay());
        this.startDate = new MyDate(startDate.getYear(),startDate.getMonth(),startDate.getDay());
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public void setStartDate(MyDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("empName: ").append(empName);
        sb.append("\nempID=").append(empID);
        sb.append("\nbirthDate=").append(birthDate);
        sb.append("\nstartDate=").append(startDate);
        
        return sb.toString();
    }
    
    
    public void display() {
        System.out.printf("Name: %s Start Date: %s Birth Date: %s ID: %d%n", empName, startDate, birthDate, empID);
    }
    
    
    
    
            
}
