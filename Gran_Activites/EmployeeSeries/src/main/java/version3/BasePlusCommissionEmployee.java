package version3;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
   
    
    public BasePlusCommissionEmployee() {}
    
    public BasePlusCommissionEmployee(Name empName, int empID) {
        super(empName,empID);
    }
    public BasePlusCommissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        super(empName,birthDate,startDate,empID);
    }
    public BasePlusCommissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID,  double baseSalary, double totalSales) {
        super(empName,birthDate,startDate,empID,totalSales);
        this.baseSalary = baseSalary;
    }
   
    public BasePlusCommissionEmployee(CommissionEmployee e, double baseSalary){
        this(e.getEmpName(),e.getBirthDate(),e.getStartDate(), e.getEmpID(), e.getTotalSales(),baseSalary);
    }
    
    public BasePlusCommissionEmployee(CommissionEmployee e){
        super(e.getEmpName(),e.getBirthDate(),e.getStartDate(), e.getEmpID(), e.getTotalSales());
    }   

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BasedPlusComissionEmployee{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("  Base Salary:  %f\n",this.baseSalary);
        System.out.printf("  Salary:  %f\n",computeSalary());
    }
    
}

