// * *******************************************************************************
// * Class Name    : Triangle.java                                                   *
// * Description   : This class represents a Triangle shape. Implements the Shape    *
// *                 interface as required by the assignment. Includes base and      *
// *                 height fields and methods to calculate area and draw shape.     *
// * Author        : Alejandro Palacio Caro                                          *
// * Date Written  : June 2025                                                       *
// * References    : Java How to Program 11th Ed., Chapter 8 & 9 - canvas            *
// * *******************************************************************************

// Implements the Shape interface with the required fields and methods:
// base, height, getArea(), draw()

public class Triangle implements Shape {
    private double base;    // Base of the triangle
    private double height;  // Height of the triangle

    // * ----------------------------------------------------------------------------- *
    // * Function Name : Triangle                                                      *
    // * Purpose       : Constructor to initialize a Triangle with base and height     *
    // * Parameters    : double base - base of the triangle                            *
    // *                 double height - height of the triangle                        *
    // * Return        : Constructor - no return value                                 *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : getArea                                                       *
    // * Purpose       : Calculates and returns the area of the triangle               *
    // * Parameters    : None                                                          *
    // * Return        : double - area of the triangle                                 *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : draw                                                          *
    // * Purpose       : Displays message indicating shape is a Triangle               *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
