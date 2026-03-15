package week9Files;

public class ConcurrencyAndSynchronization {
    //Background info
    // Time slicing --> running each program a few 10s of milliseconds then switch to another
        // Multitasking O/S --> illusion of running multiple programs at a time

    // Moore's Law --> 18 months to 2 years, logic circuit shrinks to half of prev area
        // meant computers became twice as fast every 2 years
        // meant CPU ran faster
        // Issues with circuits overheating and power issues
    // solved using multiple cores
        // TODO how many cores at half speed equals the same computational capability as 1 core at full speed?
        // less energy and less heat!
        // most laptops and phones have 4 or more cores
            // --> four apps can run simultaneously, more would req time slicing




    // THREADS
        // multiple cores allow more than one part of a program running simultaneously
            // TODO what is this part of a program called?
            // relationship between cores and program speed is approx directly proportional
            // TODO draw the multithreaded process

        // TODO compare and contrast sequential and concurrent execution

        // TODO what are the two models of concurrency

        // Thread 3 step approach  1) create a class that implements Runnable interface
                                // 2) construct a new Thread object with your task object
                                // 3) start the thread
        // TODO import the thread class and class then create a thread with a parameter and a thread without one
            /* 1
            *  2
            *  3
            *  4
            *  5 */

        // TODO write the three important methods of Java thread classes
            /* 1
            *  2
            *  3 */
            // static methods include sleep() - pause thread (time delay) --> NEED INTERRUPTED EXCEPTION FOR THIS ONE
                                   // yield() - (let other Threads run)

            // NOTE: the code does not call run() directly, instead start() calls it as a part of the new thread sequence
               // code defines the run() method --> Thread calls the run() written

    // YOUR PROGRAM IS NO LONGER DETERMINISTIC



    // TASK AND DOMAIN DECOMPOSITION
        // **decompose** large problems into pieces
        // 1 Task decomposition
            // Split task into multiple subtasks --> each subtask has DIFFERENT CODE
            // Each subtask runs on its own core
            // TODO what is the primary benefit of task decomposition
            // TODO draw video game update as a task decomposition

    public class Game {
        public static void main(String[] args) {
// Thread data keeps track of where the characters are, what direction they
// are moving and at what speed
            Thread data = new Thread(/*new Model (...)*/);
// Thread gui updates the GUI showing each character
            Thread gui = new Thread(/*new View (...)*/);
// Start the data thread. It will receive information from the GUI about use
// of controls, mouse clicks, etc.
            data.start();
// Start the gui thread. It will receive information from Model class methods
// about where the characters are, what direction they are moving and at what
// speed
            gui.start();
/*...*/
        }
    }
    // 2 Domain decomposition
            // DOMAIN: the input examined by the problem
            // Split domain into pieces (subdomains)
            // Each subtask runs --> SAME CODE --> DIFFERENT INPUT
            // TODO what is the primary benefit of domain decomposition
            // TODO draw matrix multiplication as a domain decomposition
        //




    // SYNCHRONIZATION
        // "Time slicing"
        // Higher priority activities may interrupt thread e.g. I/O
        // Multiple threads do not always proceed at the same rate

        // INTERLEAVING
            // TODO type the example output from the slides

        // Synchronization methods
            // Join -- waiting for a thread to finish
                // t.join(); -- blocks "current thread" until Thread t completes (returns from run())
                    // may throw an InterruptedException so generally is in try-catch clause
                    // Slow --> TODO what Thread method can you use to speed up the join() sync method

            // TODO what is the keyword for synchronizing threads (correct case)
               // TODO write the correct syntax below --> write an example

            // Shared memory architecture
                // TODO what are the two paradigms of shared memory architecture and explain what they are





}