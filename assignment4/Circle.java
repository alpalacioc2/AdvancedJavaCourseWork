// * *******************************************************************************
// * Class Name    : Circle.java                                                    *
// * Description   : This class represents a Circle shape. Implements the Shape     *
// *                 interface as required by the assignment. Includes a radius     *
// *                 field and methods to calculate area and draw the shape.        *
// * Author        : Alejandro Palacio Caro                                         *
// * Date Written  : June 2025                                                      *
// * References    : Java How to Program 11th Ed., Chapter 8 & 9  -canvas           *
// * *******************************************************************************

// Implements the Shape interface with the required fields and methods:
// radius, getArea(), draw()

public class Circle implements Shape {
    private double radius; // Radius of the circle

    // * ----------------------------------------------------------------------------- *
    // * Function Name : Circle                                                        *
    // * Purpose       : Constructor to initialize a Circle with radius                *
    // * Parameters    : double radius - the radius of the circle                      *
    // * Return        : Constructor - no return value                                 *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public Circle(double radius) {
        this.radius = radius;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : getArea                                                       *
    // * Purpose       : Calculates and returns the area of the circle                 *
    // * Parameters    : None                                                          *
    // * Return        : double - area of the circle                                   *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : draw                                                          *
    // * Purpose       : prints message saying shape is a Circle                       *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
