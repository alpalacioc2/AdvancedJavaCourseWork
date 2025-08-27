package org.alejo.assignment;
// * *******************************************************************************
// * Class Name    : MessageThread.java                                             *
// * Description   : Implements the Runnable interface. This thread prints a        *
// *                 message ("Working...") every 2 seconds for a fixed duration.   *
// * Author        : Alejandro Palacio Caro                                         *
// * Date Written  : July 2025                                                      *
// * References    : Java How to Program 11th Ed., Chapter 23 - canvas              *
// * *******************************************************************************
public class MessageThread implements Runnable {
    private final int duration;
    // * ----------------------------------------------------------------------------- *
    // * Function Name : MessageThread                                                 *
    // * Purpose       : Constructor to initialize the total run duration              *
    // * Parameters    : int duration - total time in seconds to display message       *
    // * Return        : Constructor - no return value                                 *
    // * Author        : Alejandro Palacio Caro                                        *
    // * Date Written  : July 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    MessageThread(int duration) {
        this.duration = duration;
    }

    @Override
    // * ----------------------------------------------------------------------------- *
    // * Function Name : run                                                           *
    // * Purpose       : Prints ">>> Working..." every 2 seconds for duration seconds  *
    // * Parameters    : None                                                          *
    // * Return        : void                                                          *
    // * Author        : Alejandro Palacio Caro                                        *
    // * Date Written  : July 2025                                                     *
    // * ----------------------------------------------------------------------------- *
    public void run() {
       int times = duration / 2 ;
        for (int i = 0; i < times; i++){
            System.out.println(">>> Working...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
