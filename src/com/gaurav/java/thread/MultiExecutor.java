package com.gaurav.java.thread;
import java.util.List;

public class MultiExecutor {

    // Add any necessary member variables here

    /* 
     * @param tasks to executed concurrently
     */
    List<Thread> threads;
    public MultiExecutor(List<Runnable> tasks) {
        for(Runnable runnable : tasks)
        {
            
            this.threads.add(new Thread(runnable));
        }
        // Complete your code here
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for(Thread t : threads)
        {
            t.start();
        }
    }
}