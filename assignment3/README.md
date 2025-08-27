– Alejandro Palacio Caro  
– Assignment #3: Modeling Real-World Roles Using Classes and Inheritance
This project simulates a basic employee management system using object-oriented programming principles like inheritance and polymorphism.  
It starts with a general `Employee` class and builds on it with two specialized roles: `Manager` (who earns a bonus) and `HourlyEmployee` (who is paid by the hour).  
The `EmployeeApp` class ties it all together by creating a small list of employees and printing each one’s information along with their calculated pay.  
This shows how polymorphism works when you store different types of employees in the same list and call shared methods.


### To compile and run this project on macOS Terminal or Linux:

1. Navigate to the directory where the source files are located.

2. Compile all the Java files in terminal :
   using bash:
   javac Employee.java Manager.java HourlyEmployee.java EmployeeApp.java
3. to run this in linprog you need to manage the correct version of Java by using the command
    javac --release (your java version#) Employee.java Manager.java HourlyEmployee.java EmployeeApp.java
    
3. It can also be compiled using IntelliJ running compile tool under EmployeeApp class Main
