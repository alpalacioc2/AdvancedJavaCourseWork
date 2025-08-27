// ****************************************************************************************************************
// File Name    : Main.java
// Author       : Alejandro Palacio Caro
// Date Written : July 13, 2025
// Course       : COP3252 -Java Programming
// Description  : this code will demonstrate things about  lambda expressions, Streams API by filtering, mapping,
//                sorting, and reducing a list of names.
// ****************************************************************************************************************

//  imports
import java.util.*;
import java.util.stream.Collectors;


// *********************************************************************
// * Class Name       : LambdaStreamProcessor                          *
// * Description      : This class demonstrates the use of lambda      *
// *                    expressions and the Streams API in Java 8+ to  *
// *                    process a list of names. It performs filtering,*
// *                    mapping, sorting, and reduction operations     *
// *                    while displaying the results in a structured   *
// *                    and functional programming style.              *
// * Date             : July 13, 2025                                  *
// * Author           : Alejandro Caro                                 *
// * References       : Chapter 17 Lambdas and Streams (Deitel PPT),   *
// *                    Java API documentation, course lectures        *
// *********************************************************************
public class LambdaStreamProcessor {

    // *********************************************************************
    // * Function Name: main                                               *
    // * Description: Demonstrates lambda expressions and Streams API to   *
    // *              filter, transform, sort, and analyze a list of names.*
    // * Parameter Description: String[] args - command line arguments     *
    // * Date: July 13, 2025                                               *
    // * Author: Alejandro Caro                                            *
    // * References: Java lectures - Canvas and Java API documentation     *
    // *********************************************************************
    public static void main(String[] args) {

        // this list creates all the name samples
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // prints the list
        System.out.println("Original Names: " + names);

        // filter names starting with A
        List<String> filteredList = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered (start with A): " + filteredList);

        // Will transform to uppercase characters and order them in alphabetical order
        List<String> upperSortedList = filteredList.stream()
                .map(name -> name.toUpperCase())
                .sorted((a, b) -> a.compareTo(b))
                .collect(Collectors.toList());
        System.out.println("Uppercase and Sorted: " + upperSortedList);

        // calculation for the total number of characters in the list names.
        int totalChars = names.stream()
                .mapToInt(name -> name.length())
                .sum();
        System.out.println("Total Characters: " + totalChars);
    }
}

