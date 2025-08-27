import java.util.ArrayList;

// * *********************************************************************************
// * Class Name: EmployeeApp                                                         *
// * Description: Main application class to demonstrate object creation,             *
// *              polymorphism, and method overriding using Employee .               *
// * Date: 2025-06-09                                                                *
// * Author: Alejandro Caro                                                          *
// * References: Java How to Program 11th Ed., Chapter 7, Slide 7.1; Chapter 9       *
// * *********************************************************************************
public class EmployeeApp {

    // * ****************************************************************************
    // * Function Name: main                                                        *
    // * Description: Entry point for the program demonstrating polymorphism.       *
    // * Parameter Description: args: String[]                                      *
    // * Date: 2025-06-09                                                           *
    // * Author: Alejandro Caro                                                     *
    // * References: Java How to Program 11th Ed., Chapter 7, Slide 7.1; Chapter 9  *
    // * ****************************************************************************
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // instantiate of Employee,Manager,And HourlyEmployee per requirements .Hardcoding values
        employees.add(new Employee("John Smith", 101, 3000.0));
        employees.add(new Manager("Sarah Lee", 102, 3500.0, 1000.0));
        employees.add(new HourlyEmployee("Mike Johnson", 103, 40, 24.0));

        // print values using System.out.printf()
        System.out.println("Employee Report:");
        System.out.println("---------------------------");

        for (Employee teamMember : employees) {
            System.out.println(teamMember);
            System.out.printf("Pay: $%.2f\n\n", teamMember.calculatePay());
        }
    }
}
