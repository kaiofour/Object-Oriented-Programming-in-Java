
package version2;

/**
 *
 * @author Russel
 */
public class Main {
    public static void main(String[] args) {
    System.out.println("NON-DEFAULT CONSTRUCTORS USED: \n");

        
        Hourly hourlyEmp1 = new Hourly(20.5f, 30.0, "Sheldon Cooper", 10010101); // HOURLY EMPLOYEES
        hourlyEmp1.displayHourlyEmployees();

        Hourly hourlyEmp2 = new Hourly("Leonard Hofstadter", 20020202);
        hourlyEmp2.setHourlyRate(45.67);
        hourlyEmp2.setHoursWorked(120.25f);
        hourlyEmp2.displayHourlyEmployees();

        
        Employee empP = new Employee("Penny Hofstadter", 30030303); // PIECE EMPLOYEES
        Piece pieceEmp1 = new Piece(empP, 500, 12.5);
        pieceEmp1.displayPieceEmployees();

        Piece pieceEmp2 = new Piece("Raj Koothrappali", 40040404);
        pieceEmp2.setRatePerPiece(75.0);
        pieceEmp2.setTotalPiecesFinished(800);
        pieceEmp2.displayPieceEmployees();

        
        Commission commissionEmp1 = new Commission(60060060, "Howard Wolowitz", 50050505); // COMMISSION EMPLOYEES
        commissionEmp1.setTotalSales(30000);
        commissionEmp1.displayCommisionEmployees();

        Commission commissionEmp2 = new Commission("Bernadette Rostenkowski-Wolowitz", 70070707);
        commissionEmp2.setTotalSales(45000);
        commissionEmp2.displayCommisionEmployees();

       
        BasedPlus basedPlusEmp1 = new BasedPlus("Amy Farrah Fowler", 80080808, 20000, 5000.00); // BASED PLUS COMMISSION EMPLOYEES
        basedPlusEmp1.displayBasedCommisionEmployees();

        BasedPlus basedPlusEmp2 = new BasedPlus("Stuart Bloom", 90090909, 15000, 3000);
        basedPlusEmp2.setBaseSalary(4500.23);
        basedPlusEmp2.setTotalSales(18000);
        basedPlusEmp2.displayBasedCommisionEmployees();

        System.out.println("DEFAULT CONSTRUCTORS USED: \n\n");

        
        Hourly defHourlyEmp = new Hourly(); // HOURLY EMPLOYEES DEFAULT
        defHourlyEmp.setId(10010101);
        defHourlyEmp.setName("Sheldon Cooper");
        defHourlyEmp.setHourlyRate(30.25);
        defHourlyEmp.setHoursWorked(60.0f);
        defHourlyEmp.displayEmployee();
        defHourlyEmp.displayHourlyEmployees();

        
        BasedPlus defBasedPlus = new BasedPlus(); // BASED PLUS COMMISSION EMPLOYEES DEFAULT
        defBasedPlus.setBaseSalary(1500.23);
        defBasedPlus.setId(20020202);
        defBasedPlus.setName("Leonard Hofstadter");
        defBasedPlus.setTotalSales(25000);
        defBasedPlus.displayEmployee();
        defBasedPlus.displayBasedCommisionEmployees();

        
        Commission defCommissionEmp = new Commission(); // COMMISSION EMPLOYEES DEFAULT
        defCommissionEmp.setId(30030303);
        defCommissionEmp.setName("Penny Hofstadter");
        defCommissionEmp.setTotalSales(35000);
        defCommissionEmp.displayEmployee();
        defCommissionEmp.displayCommisionEmployees();

       
        Piece defPieceEmp = new Piece();  // PIECE EMPLOYEES DEFAULT
        defPieceEmp.setId(40040404);
        defPieceEmp.setName("Raj Koothrappali");
        defPieceEmp.setRatePerPiece(50.0);
        defPieceEmp.setTotalPiecesFinished(500);
        defPieceEmp.displayEmployee();
        defPieceEmp.displayPieceEmployees();
    }

}
