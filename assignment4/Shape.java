
// * ********************************************************************************
// * Interface Name : Shape.java                                                    *
// * Description    : This interface defines a contract for shape objects.          *
// *                  All shapes that implement this interface must define          *
// *                  the getArea() and draw() methods.                             *
// * Author         : Alejandro Palacio Caro                                        *
// * Date Written   : June 2025                                                     *
// * ********************************************************************************
//defining shape interface using 2 methods required for homework
public interface Shape {

    // * ----------------------------------------------------------------------------- *
    // * Function Name : getArea                                                       *
    // * Purpose       : Abstract method to calculate area of a shape                  *
    // * Parameters    : None                                                          *
    // * Return        : double - area of the shape                                    *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    double getArea();

    // * ----------------------------------------------------------------------------- *
    // * Function Name : draw                                                          *
    // * Purpose       : Abstract method to display shape type                         *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Caro                                                *
    // * Date Written  : June 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    void draw();
}
