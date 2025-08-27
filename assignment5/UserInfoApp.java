package com.example.userinformationapp;
// imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// * ***********************************************************************************************
// * Class Name    : UserInfoApp.java                                                                 *
// * Description   : A simple JavaFX app where users enter their name and choose                   *
// *                 a favorite color. After clicking the Submit button, a friendly                *
// *                 greeting appears. The layout uses VBox and HBox, and the                      *
// *                 Submit button stays disabled until both inputs are filled out.                *
// * Author        : Alejandro Palacio Caro                                                        *
// * Date Written  : June 25, 2025                                                                 *
// * References    : JavaFX API, Canvas - Instructor Lecture javaFX1 and javaFX2                   *
// * ***********************************************************************************************
public class UserInfoApp extends Application {

    private TextField nameField;
    private ComboBox<String> colorBox;
    private Label resultLabel;
    private Button submitButton;

    // * ********************************************************************************
    // * Function Name : main                                                           *
    // * Purpose       : Entry point to launch the JavaFX application                   *
    // * Parameters    : String[] args - command-line arguments                         *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : June 25, 2025                                                  *
    // * ********************************************************************************
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    // * ********************************************************************************
    // * Function Name : start                                                          *
    // * Purpose       : Initializes the JavaFX stage, scene, layout, and event logic   *
    // * Parameters    : Stage primaryStage - the main application window               *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : June 25, 2025                                                  *
    // * ********************************************************************************
    public void start(Stage primaryStage) {
        primaryStage.setTitle("User Information");//window  message per assignment requirements

        VBox mainLayout = new VBox(15);
        mainLayout.setPadding(new Insets(20));

        Label titleLabel = new Label("Enter your name and select a color.");

        initControls(); // method to initialize Controls

        HBox inputLayouts = new HBox(15);
        inputLayouts.getChildren().addAll(
                new Label("Name:"), nameField,
                new Label("Color:"), colorBox
        );

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            // **********************************************************************************
            // * Function Name : handle                                                         *
            // * Purpose       : Handles submit button click; displays message or error         *
            // * Parameters    : ActionEvent actionEvent - the click event                      *
            // * Return        : void                                                           *
            // * Author        : Alejandro Palacio Caro                                         *
            // * Date Written  : June 25,2025                                                   *
            // * ********************************************************************************
            public void handle(ActionEvent actionEvent) {
                String name = nameField.getText().trim();
                String color = colorBox.getValue();

                if (name.isEmpty() || color == null) {
                    resultLabel.setText("Please enter your name and select a color.");
                } else {
                    resultLabel.setText("Hello " + name + ", your favorite color is " + color + "!");
                }
            }
        });

        mainLayout.getChildren().addAll(titleLabel, inputLayouts, submitButton, resultLabel);
        Scene scene = new Scene(mainLayout, 450, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // * ********************************************************************************
    // * Function Name : initControls                                                   *
    // * Purpose       : Initializes all form controls and sets up property binding     *
    // * Parameters    : none                                                           *
    // * Return        : void                                                           *
    // * Author        : Alejandro Palacio Caro                                         *
    // * Date Written  : June 25,2025                                                   *
    // * ********************************************************************************
    private void initControls() {
        nameField = new TextField();
        nameField.setPromptText("Enter name");

        colorBox = new ComboBox<>();
        colorBox.getItems().addAll("Red", "Green", "Blue", "Yellow","Orange","Purple","Grey","White");
        colorBox.setPromptText("Select color"); //

        resultLabel = new Label();

        submitButton = new Button("Submit"); //
        submitButton.setStyle("-fx-background-color: #800080; -fx-text-fill: white");

        // with this implementation Submit button is disabled until both name and color are entered
        submitButton.disableProperty().bind(
                nameField.textProperty().isEmpty()
                        .or(colorBox.valueProperty().isNull())
        );
    }
}
