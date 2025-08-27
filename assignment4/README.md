- Name: Alejandro Palacio Caro

- Assignment Title: Assignment #4 – OOP Polymorphism and Interfaces

- Description:
  This Java program demonstrates object-oriented programming concepts including interfaces, polymorphism,
  and dynamic method dispatch. It defines a `Shape` interface and three implementing classes:
    - Circle
    - Rectangle
    - Triangle

  Each class implements the required methods:
    - `getArea()` to calculate and return the area of the shape
    - `draw()` to display a message identifying the shape

  The main class `ShapeApp` creates multiple shape objects, stores them in a `List<Shape>`, and
  uses polymorphic method calls to display and analyze each shape.

- How to Compile and Run (macOS/Linux/Windows):

    1. Navigate to the directory where the source files are located.

    2. Compile the program using the following command:
       javac ShapeApp.java Circle.java Rectangle.java Triangle.java Shape.java

       This will generate the following `.class` files:
        - ShapeApp.class
        - Circle.class
        - Rectangle.class
        - Triangle.class
        - Shape.class

    3. Run the program using:
       java ShapeApp

- This program can also be run using IntelliJ IDEA or another Java IDE by opening the project
  and running `ShapeApp.java` using the built-in Run tool or terminal.
