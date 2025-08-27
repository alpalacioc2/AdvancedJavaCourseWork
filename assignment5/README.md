- Name: Alejandro Palacio Caro

- Assignment Title: Assignment #5 – JavaFX GUI Application

- Description:  
  This JavaFX application provides a simple graphical user interface that allows the user to:
    - Enter their name into a `TextField`
    - Choose a favorite color from a `ComboBox`
    - Click a `Submit` button to display a personalized greeting in a `Label`

  The GUI is built programmatically using:
    - `VBox` and `HBox` layout containers for clean UI organization
    - A `Button` styled with inline CSS (purple background)
    - Property binding to disable the `Submit` button until both fields are filled

  The logic is written entirely in Java (no FXML), and the main class `UserInfoApp.java` handles:
    - UI creation
    - Event handling using anonymous inner classes
    - Input validation and dynamic feedback to the user

- How to Compile and Run (macOS/Linux/Windows):

    1. Ensure JavaFX SDK and Maven are installed on your system.

    2. Navigate to the directory containing `pom.xml`.

    3. Run the program using Maven:
       ```
       mvn clean javafx:run
       ```

    4. Alternatively, open the project in IntelliJ IDEA and run `UserInfoApp.java` directly.

- Files Included:
    - `UserInfoApp.java`
    - `README.md`
