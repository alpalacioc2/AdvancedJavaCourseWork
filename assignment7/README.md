- **Name**: Alejandro Palacio Caro

- **Assignment Title**: Lambda Expressions and Streams – Functional Processing of Name Lists

- **Description**:  
  This Java program demonstrates the use of **lambda expressions** and the **Streams API** introduced in Java 8 to process collections using a functional programming style.  

  The program defines a list of names and performs several stream operations to demonstrate filtering, transformation, sorting, and reduction:

  - **Original Names**: Displays the initial list of names.  
  - **Filter**: Extracts names that start with the letter `"A"`.  
  - **Map and Sort**: Converts the filtered names to uppercase and sorts them alphabetically using a lambda-based comparator.  
  - **Reduce**: Calculates the total number of characters across all original names using `mapToInt().sum()`.

  It will then print output  in the format specified.

- **How to Compile and Run (macOS/Linux/Windows)**:

1. Navigate to the directory where the source file is located.

2. Compile the program using the following command:
   ```bash
   javac LambdaStreamProcessor.java
   ```

   This will generate the following `.class` file:
   - LambdaStreamProcessor.class

3. Run the program using:
   ```bash
   java LambdaStreamProcessor
   ```

4. On linprog or other systems where version compatibility matters, use:
   ```bash
   javac --release 8 LambdaStreamProcessor.java
   ```

This program can also be run using IntelliJ IDEA or another Java IDE by opening the project and running `LambdaStreamProcessor` using the built-in Run tool or terminal.

