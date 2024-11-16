package version3;

public class CommissionEmployee extends Employee{
    private double totalSales;
    
    public CommissionEmployee() {
    }
    
    public CommissionEmployee(Name empName, int empID) {
        super(empName,empID);
    }
    public CommissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        super(empName,birthDate,startDate,empID);
    }
    public CommissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID, double totalSales) {
        this(empName,birthDate,startDate,empID);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public double computeSalary(){
        float rate;
        if (this.totalSales < 10000){
            rate = 0.05f;
        } else if (this.totalSales < 100000){
            rate = 0.1f;
        } else if (this.totalSales < 1000000){
            rate = 0.2f;
        } else{
            rate = 0.3f;
        }
        return this.totalSales * rate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComissionEmployee{");
        sb.append("totalSales=").append(totalSales);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("  Salary:  %f\n",computeSalary());
    }
}
