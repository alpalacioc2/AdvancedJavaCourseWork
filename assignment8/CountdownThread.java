package org.alejo.assignment;
// * *******************************************************************************
// * Class Name    : CountdownThread.java                                           *
// * Description   : Implements the Runnable interface. This thread counts down     *
// *                 from a starting number to 0 with 1-second intervals between    *
// *                 prints. Demonstrates basic concurrency behavior.               *
// * Author        : Alejandro Palacio Caro                                         *
// * Date Written  : July 2025                                                      *
// * References    : Java How to Program 11th Ed., Chapter 23 - canvas              *
// * *******************************************************************************
public class CountdownThread implements Runnable {

    private final int count;
    // * ----------------------------------------------------------------------------- *
    // * Function Name : CountdownThread                                               *
    // * Purpose       : Constructor to initialize countdown starting value            *
    // * Parameters    : int count - starting value for the countdown                  *
    // * Return        : Constructor - no return value                                 *
    // * Author        : Alejandro Palacio Caro                                        *
    // * Date Written  : July 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    CountdownThread(int count) {
        this.count = count;
    }
    // * ----------------------------------------------------------------------------- *
    // * Function Name : run                                                           *
    // * Purpose       : Executes the countdown with a 1-second pause between values   *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Palacio Caro                                        *
    // * Date Written  : July 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    @Override
    public void run() {
        for (int i = count; i >= 0; i--){
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
