// * *********************************************************************************
// * Class Name: Manager.java                                                        *
// * Description: this is the subclass of Employee that includes a field             *
// *              and overrides  function calculatePay to add bonus to base the pay. *
// * Date: 2025-06-09                                                                *
// * Author: Alejandro Caro                                                          *
// * References: Java How to Program 11th Ed., Chapter 9, Sections 9.2, 9.4.1, 9.4.3 *
// * *********************************************************************************
public class Manager extends Employee {
    private double bonus;

    // * **********************************************************************
    // * Function Name: Manager (constructor)                                 *
    // * Description: Constructs a Manager with the name, ID, base pay,bonus. *
    // * Parameter Description:name,employeeId,basePay,bonus                  *
    // * Date: 2025-06-09                                                     *
    // * Author: Alejandro Caro                                               *
    // * References: Java How to Program 11th Ed., Chapter 9, Slide 9.4.3     *
    // * **********************************************************************
    public Manager(String name, int employeeId, double basePay, double bonus) {
        super(name, employeeId, basePay);//will call the constructor from parent class and reuse logic . Seen it in chap 9 slides
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return basePay + bonus;
    }
}
