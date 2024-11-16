package version1;

// Main.java
import java.util.Scanner; //scanner

public class Main {    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scanf stuff for HourlyEmployee
        System.out.println("Enter Hourly Employee Name:");
        String hName = scanner.nextLine();
        System.out.println("Enter Hourly Employee ID:");
        int hID = scanner.nextInt();
        System.out.println("Enter Total Hours Worked:");
        float totalHours = scanner.nextFloat();
        System.out.println("Enter Rate per Hour:");
        double ratePerHour = scanner.nextDouble();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(hName, hID, totalHours, ratePerHour);
        System.out.println("Hourly Employee Salary: $" + hourlyEmployee.computeSalary());
        hourlyEmployee.displayEmployee();
        System.out.println(hourlyEmployee.toString());

        // Input for PieceWorkerEmployee
        System.out.println("\nEnter Piece Worker Employee Name:");
        scanner.nextLine(); // consume leftover newline
        String pName = scanner.nextLine();
        System.out.println("Enter Piece Worker Employee ID:");
        int pID = scanner.nextInt();
        System.out.println("Enter Total Pieces Finished:");
        int totalPieces = scanner.nextInt();
        System.out.println("Enter Rate per Piece:");
        double ratePerPiece = scanner.nextDouble();

        PieceWorkerEmployee pieceWorkerEmployee = new PieceWorkerEmployee(pName, pID, totalPieces, ratePerPiece);
        System.out.println("Piece Worker Employee Salary: $" + pieceWorkerEmployee.computeSalary());
        pieceWorkerEmployee.displayEmployee();
        System.out.println(pieceWorkerEmployee.toString());

        // Input for CommissionEmployee
        System.out.println("\nEnter Commission Employee Name:");
        scanner.nextLine(); // consume leftover newline
        String cName = scanner.nextLine();
        System.out.println("Enter Commission Employee ID:");
        int cID = scanner.nextInt();
        System.out.println("Enter Total Sales:");
        double totalSales = scanner.nextDouble();

        CommissionEmployee commissionEmployee = new CommissionEmployee(cName, cID, totalSales);
        System.out.println("Commission Employee Salary: $" + commissionEmployee.computeSalary());
        commissionEmployee.displayEmployee();
        System.out.println(commissionEmployee.toString());

        // Input for BasedPlusCommissionEmployee
        System.out.println("\nEnter Base Plus Commission Employee Name:");
        scanner.nextLine(); // consume leftover newline? not sure
        String bName = scanner.nextLine();
        System.out.println("Enter Base Plus Commission Employee ID:");
        int bID = scanner.nextInt();
        System.out.println("Enter Total Sales:");
        double bTotalSales = scanner.nextDouble();
        System.out.println("Enter Base Salary:");
        double baseSalary = scanner.nextDouble();

        BasedPlusCommissionEmployee basedPlusCommissionEmployee = new BasedPlusCommissionEmployee(bName, bID, bTotalSales, baseSalary);
        System.out.println("Base Plus Commission Employee Salary: $" + basedPlusCommissionEmployee.computeSalary());
        basedPlusCommissionEmployee.displayEmployee();
        System.out.println(basedPlusCommissionEmployee.toString());

        scanner.close();
    }
}


