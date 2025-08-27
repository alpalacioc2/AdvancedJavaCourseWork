// ********************************************************************************************
// * Assignment Name: Analyzing Class Performance Using Methods, Arrays, and ArrayLists       *
// * Description: This application serves as the user interface for collecting test scores,   *
// *              validating input, and displaying analysis results using the ScoreAnalyzer.  *
// * Course: COP3252 – Java Programming                                                       *
// * Filename: ScoreAnalyzerApp.java                                                          *
// * Date: May 24, 2025                                                                       *
// * Author: Alejandro Caro                                                                   *
// * References: Java course lectures (Canvas), Java API documentation                        *
// ********************************************************************************************
import java.util.Scanner;
public class ScoreAnalyzerApp {
    // *********************************************************************
    // * Function Name: main                                               *
    // * Description: Collects user input, validates it, sends scores      *
    // *              to ScoreAnalyzer, and prints analysis results.       *
    // * Parameter Description: String[] args - command line args          *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreAnalyzer analyzer = new ScoreAnalyzer();
        double input;
        while (true) {
            System.out.print("Enter student scores between (0–100), or -1 to finish: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter student score: ");
            }
            input = scanner.nextDouble();

            // if user inputs -1 break out of the while true and stop program
            if (input == -1) {
                break;
            }
            // checks to make sure input is between the range of 0 and under a hundred
            if (input >= 0 && input <= 100) {
                analyzer.addScore(input); // Add input to ScoreAnalyzer
            } else {
                System.out.println("Score must be between 0 and 100.");
            }
        }

        //prints results next to statement
        System.out.printf("\nAverage Score: %.2f\n", analyzer.calculateAverage());
        System.out.printf("Minimum Score: %.2f\n", analyzer.getMinimumScore());
        System.out.printf("Maximum Score: %.2f\n", analyzer.getMaximumScore());

        //prints the asterisks from the distribution printScoreDistribution
        analyzer.printScoreDistribution();
        //finalize scanner
        scanner.close();
    }
}

