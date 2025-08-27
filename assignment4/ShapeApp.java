// * ********************************************************************************
// * Homework     : Programming Assignment #4 – OOP Polymorphism and Interfaces     *
// * Course       : COP3252 Java Programming                                        *
// * Semester     : Summer 2025                                                     *
// * Author       : Alejandro  Caro                                                 *
// * Date Written : June 2025                                                       *
// * ********************************************************************************

// imports
import java.util.ArrayList;
import java.util.List;

// * ********************************************************************************
// * Class Name    : ShapeApp.java                                                  *
// * Description   : This is the main application that demonstrates polymorphism    *
// *                 and interfaces in Java. It creates a list of shapes,           *
// *                 displays them using draw(), and calculates their areas.        *
// * Author        : Alejandro Caro                                                 *
// * Date Written  : June 2025                                                      *
// * References    : Java How to Program 11th Ed., Chapter 8 & 9  -canvas           *
// * ********************************************************************************
public class ShapeApp {

    // * ----------------------------------------------------------------------------- *
    // * Function Name : main                                                          *
    // * Purpose       : Entry point for the Shape application. Creates shapes,        *
    // *                 displays them, and prints their area.                         *
    // * Parameters    : String[] args - command line arguments                        *
    // * Return        : void                                                          *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public static void main(String[] args) {
        // Create a list to hold shape objects
        List<Shape> shapeList = new ArrayList<>();

       // individual shape objects using constructors: hardcoded values
        Circle circle = new Circle(5.0);                            // Area = π × 5² = 78.54
        Rectangle rectangle = new Rectangle(4.0, 5.0);       // Area = width × height = 20.00
        Triangle triangle = new Triangle(6.0, 5.0);          // Area = 0.5 × base × height = 15.00

        shapeList.add(circle);
        shapeList.add(rectangle);
        shapeList.add(triangle);

        for (int i = 0; i < shapeList.size(); i++) {
            Shape shape = shapeList.get(i);                               // Get the Shape object at i index

            shape.draw();                                                 // requirement:polymorphic method call
            System.out.printf("Area: %.2f \n\n", shape.getArea());        // prints using getArea with polymorphic.
        }

    }
}
