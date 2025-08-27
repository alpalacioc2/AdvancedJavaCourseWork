package org.alejo.assignment;
// * *******************************************************************************
// * Class Name    : ThreadApp.java                                                 *
// * Description   : Main application class that creates and starts two threads:    *
// *                 CountdownThread and MessageThread. Waits for both threads      *
// *                 to complete using join(). Demonstrates concurrent behavior.    *
// * Author        : Alejandro Palacio Caro                                         *
// * Date Written  : July 2025                                                      *
// * References    : Java How to Program 11th Ed., Chapter 23 - canvas              *
// * *******************************************************************************
public class ThreadApp {
    // * ----------------------------------------------------------------------------- *
    // * Function Name : main                                                          *
    // * Purpose       : Entry point. Starts and joins both threads.                   *
    // * Parameters    : String[] args - command-line arguments (unused)               *
    // * Return        : void                                                          *
    // * Author        : Alejandro Palacio Caro                                        *
    // * Date Written  : July 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public static void main(String[] args) throws InterruptedException {
        CountdownThread ct = new CountdownThread(5);
        MessageThread mt = new MessageThread(7);
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(mt);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           System.err.print("main threat interrupted");
            throw new RuntimeException(e);
        }
        System.out.println(">>> All threads completed");

    }
}
