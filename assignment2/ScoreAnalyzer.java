// ********************************************************************************************
// * Assignment Name: Analyzing Class Performance Using Methods, Arrays, and ArrayLists       *                                                      *
// * Description: This class defines a class that manages and analyzes test scores.           *
// *              It supports adding scores, calculating the average, finding min/max,        *
// *              and displaying a histogram-style score distribution.                        *
// * Course: COP3252 – Java Programming                                                       *
// * Filename: ScoreAnalyzer.java                                                             *
// * Date: May 24, 2025                                                                       *
// * Author: Alejandro Caro                                                                   *
// * References: Java course lectures (Canvas), Java API documentation                        *
// ********************************************************************************************

import java.util.ArrayList;
public class ScoreAnalyzer {
    // Declare an array of type Double
    private ArrayList<Double> testScores;

    // *********************************************************************
    // * Function Name: ScoreAnalyzer                                      *
    // * Description: Constructor. Initializes the ArrayList.              *
    // * Parameter Description: None                                       *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    public ScoreAnalyzer() {
        testScores = new ArrayList<>();
    }

    // *********************************************************************
    // * Function Name: addScore                                           *
    // * Description: Adds a score to the testScores list.                 *
    // * Parameter Description: double score - the score to add            *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    public void addScore(double score) {
        testScores.add(score);
    }

    // *********************************************************************
    // * Function Name: calculateAverage                                   *
    // * Description: Returns the average of all test scores.              *
    // * Parameter Description: None                                       *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    public double calculateAverage() {
        if (testScores.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double score : testScores) {
            sum += score;
        }
        return sum / testScores.size();
    }

    // **********************************************************************
    // * Function Name: getMinimumScore                                     *
    // * Description: Returns the lowest score in testScores.               *
    // * Parameter Description: None                                        *
    // * Date: May 24, 2025                                                 *
    // * Author: Alejandro Caro                                             *
    // * References: Java course lectures - Canvas, Java API documentation  *
    // **********************************************************************
    public double getMinimumScore() {
        if (testScores.isEmpty()) return 0.0;
        double min = testScores.get(0);
            for (double score : testScores) {
                if (score < min) {
                    min = score;
                }
            }
        return min;
    }

    // *****************************************************************************
    // * Function Name: getMaximumScore                                            *
    // * Description: Returns the highest score in testScores.                     *
    // * Parameter Description: None                                               *
    // * Date: May 24, 2025                                                        *
    // * Author: Alejandro Caro                                                    *
    // * References: Java course lectures - Canvas, Java API documentation         *
    // *****************************************************************************
    public double getMaximumScore() {
        if (testScores.isEmpty()) return 0.0;
        double max = testScores.get(0);
        for (double score : testScores) {
            if (score > max) max = score;
        }
        return max;
    }

    // *********************************************************************
    // * Function Name: printScoreDistribution                             *
    // * Description: Prints a histogram-style score distribution.         *
    // * Parameter Description: None                                       *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    public void printScoreDistribution() {
        int[] counter = new int[5];                         //  Initialize array to count number of scores in each range
        for (double score : testScores) {
            if (score >= 90) counter[0]++;
            else if (score >= 80) counter[1]++;
            else if (score >= 70) counter[2]++;
            else if (score >= 60) counter[3]++;
            else counter[4]++;
        }
        //print out the statement
        System.out.println("\nScore Distribution:");

        System.out.print("90–100: ");
        printAsterisks(counter[0]);

        System.out.print("80–89 : ");
        printAsterisks(counter[1]);

        System.out.print("70–79 : ");
        printAsterisks(counter[2]);

        System.out.print("60–69 : ");
        printAsterisks(counter[3]);

        System.out.print("Below 60: ");
        printAsterisks(counter[4]);
    }

    // *********************************************************************
    // * Function Name: printAsterisks                                     *
    // * Description: Prints a number of asterisks equal to count.         *
    // * Parameter Description: int count - number of stars to print       *
    // * Date: May 24, 2025                                                *
    // * Author: Alejandro Caro                                            *
    // * References: Java course lectures - Canvas, Java API documentation *
    // *********************************************************************
    private void printAsterisks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
