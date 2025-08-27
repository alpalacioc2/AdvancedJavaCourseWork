// * *********************************************************************************
// * Class Name: HourlyEmployee                                                      *
// * Description: A subclass of Employee that uses hours worked and                  *
// *              hourly rate to for pay. Overrides calculatePay().                  *
// * Date: 2025-06-09                                                                *
// * Author: Alejandro Caro                                                          *
// * References: Java How to Program 11th Ed., Chapter 9, Sections 9.2, 9.4.1, 9.4.3 *
// * *********************************************************************************
public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    // * ***********************************************************************
    // * Function Name: HourlyEmployee (constructor)                           *
    // * Description: Constructs an HourlyEmployee with hours and hourly rate. *
    // * Parameter Description:name,employeeId,hoursWorked,hourlyRate          *
    // * Date: 2025-06-09                                                      *
    // * Author: Alejandro Caro                                                *
    // * References: Java How to Program 11th Ed., Chapter 9, Slide 9.4.3      *
    // * ***********************************************************************
    public HourlyEmployee(String name, int employeeId, double hoursWorked, double hourlyRate) {
        super(name, employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override

//* *****************************************************************
//* Function Name: calculatePay
//* Description: Calculates total compensation for the employee type.
//* Parameter Description: None
//* Date: 2025-06-09
//* Author: Alejandro Caro
//* References: Java How to Program 11th Ed., Chapter 9, Slide 9.4.1
//* *****************************************************************
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
