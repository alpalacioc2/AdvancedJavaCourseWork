// * *******************************************************************************
// * Class Name    : Rectangle.java                                                  *
// * Description   : This class represents a Rectangle shape. Implements the Shape   *
// *                 interface as required by the assignment. Includes width and     *
// *                 height fields and methods to calculate area and draw shape.     *
// * Author        : Alejandro Palacio Caro                                          *
// * Date Written  : June 2025                                                       *
// * References    : Java How to Program 11th Ed., Chapter 8 & 9  - canvas           *
// * *******************************************************************************

// Implements the Shape interface with the required fields and methods:
// width, height, getArea(), draw()

public class Rectangle implements Shape {
    private double width;   // Width of the rectangle
    private double height;  // Height of the rectangle

    // * ----------------------------------------------------------------------------- *
    // * Function Name : Rectangle                                                     *
    // * Purpose       : Constructor to initialize a Rectangle with width and height  *
    // * Parameters    : double width - width of the rectangle                         *
    // *                 double height - height of the rectangle                       *
    // * Return        : Constructor - no return value                                 *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : getArea                                                       *
    // * Purpose       : Calculates and returns the area of the rectangle              *
    // * Parameters    : None                                                          *
    // * Return        : double - area of the rectangle                                *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public double getArea() {
        return width * height;
    }

    // * ----------------------------------------------------------------------------- *
    // * Function Name : draw                                                          *
    // * Purpose       : Displays message indicating shape is a Rectangle              *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
