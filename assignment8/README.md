# Assignment #8 – Java Concurrency

**Name:** Alejandro Palacio Caro

**Assignment Title:** Assignment #8 – Java Concurrency

## Description:
This Java program demonstrates the use of multithreading and concurrent execution using the `Runnable` interface and Java threads. It includes two custom thread classes:

- `CountdownThread`: Counts down from a specified number to 0 with a 1-second pause between each number.
- `MessageThread`: Prints a message (`>>> Working...`) every 2 seconds for a specified duration.

The `ThreadApp` class is the entry point. It creates and starts both threads and waits for them to finish using `join()`. The output shows interleaved behavior of concurrent threads.

## How to Compile and Run (macOS/Linux/Windows):

1. Navigate to the directory where the source files are located.

2. Compile the program using the following command:
   ```bash
   javac ThreadApp.java CountdownThread.java MessageThread.java
