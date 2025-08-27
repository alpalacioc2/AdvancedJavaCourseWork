// * ******************************************************************************
// * Class Name: Employee.java                                                    *
// * Description: This class generates employee with name, ID and base salary     *
// * Date: 2025-06-09                                                             *
// * Author: Alejandro Caro                                                       *
// * References: Java How to Program 11th Ed., Chapter 8 & 9                      *
// * ******************************************************************************
public class Employee {
    private String name;
    private int employeeId;
    protected double basePay;

    // ***********************************************************************************
    // * Class Name: Employee(constructor)                                               *
    // * Description: Describe Initializes Employee using default values .               *
    // * Parameter Description: List each parameter, type, and use.                      *
    // * Date: (Date of function modification)                                           *
    // * Author: (Name of Function Author)                                               *
    // * References: Java How to Program 11th Ed., Chapter 8, Section 8.5 (Constructors) *
    // ***********************************************************************************
    public Employee() {
        this.name = "Unknown";
        this.employeeId = 0;
        this.basePay = 0.0;
    }

    // * ****************************************************************************
    // * Function Name: Employee (constructor)                                      *
    // * Description: Initializes an employee with specified name, ID, and base pay *
    // * Parameter Description:name,employeeId,basePay.                             *
    // * Date: 2025-06-09                                                           *
    // * Author: Alejandro Caro                                                     *
    // * References: Java How to Program 11th Ed., Chapter 8, Slide 8.5             *
    // * ****************************************************************************
    public Employee(String name, int employeeId, double basePay) {
        this.name = name;
        this.employeeId = employeeId;
        this.basePay = basePay;
    }

    // * ******************************************************************
    // * Function Name: calculatePay                                      *
    // * Description: Returns the employee's base pay.                    *
    // * Parameter Description: None                                      *
    // * Date: 2025-06-09                                                 *
    // * Author: Alejandro Caro                                           *
    // * References: Java How to Program 11th Ed., Chapter 9, Slide 9.4.1 *
    // * ******************************************************************
    public double calculatePay() {
        return basePay;
    }
    // note:This supports polymorphic string output based on the actual object type.
    @Override


    // * ********************************************************************
    // * Function Name: toString                                            *
    // * Description: Returns the formatted employee info.                  *
    // * Parameter Description: None                                        *
    // * Date: 2025-06-09                                                   *
    // * Author: Alejandro Caro                                             *
    // * References: Java How to Program 11th Ed., Chapter 8, Slide 8.7     *
    // * ********************************************************************
    public String toString() {
        return "Name: " + name + "\nID: " + employeeId + "\nRole: Employee";
    }
}


// Pseudo-code for summary based on homework requirements
// Defining class Employee.java
//  PRIVATE  name
//  PRIVATE  employeeId
//  PROTECTED  basePay
//
//  METHOD Employee()  // my default constructor
//      SETTING name to "Unknown"
//      SETTING employeeId to 0
//      SETTING basePay to 0.0
//
//  METHOD Employee(name, employeeId, basePay)  // overloaded constructor
//      SETTING this.name to name
//      SETTING this.employeeId to employeeId
//      SETTING this.basePay to basePay
//
//  METHOD calculatePay()
//      RETURNS basePay
//
//  METHOD toString()
//      RETURNS the string with:
//          name
//          employeeId
//          class name
