package com.gaurav.java.thread;
import java.util.concurrent.*; 
  
public class SimpleExecutor { 
  
    public static void main(String[] args) 
    { 
        CountDownLatch cd1 = new CountDownLatch(1); 
        CountDownLatch cd2 = new CountDownLatch(1); 
        CountDownLatch cd3 = new CountDownLatch(1); 
        CountDownLatch cd4 = new CountDownLatch(1); 
  
        ExecutorService es = Executors.newFixedThreadPool(2); 
  
        System.out.println("Starting"); 
  
        es.execute(new MyThreadd(cd1, "A")); 
        es.execute(new MyThreadd(cd2, "B")); 
        es.execute(new MyThreadd(cd3, "C")); 
        es.execute(new MyThreadd(cd4, "D")); 
  
        try { 
            cd1.await(); 
            cd2.await(); 
            cd3.await(); 
            cd4.await(); 
        } 
        catch (InterruptedException e) { 
            System.out.println(e); 
        } 
  
        es.shutdown(); 
        System.out.println("Done"); 
    } 
} 
  
class MyThreadd implements Runnable { 
    String name; 
    CountDownLatch latch; 
  
    MyThreadd(CountDownLatch latch, String name) 
    { 
        this.name = name; 
        this.latch = latch; 
  
        new Thread(this); 
    } 
  
    public void run() 
    { 
        for (int i = 0; i < 7; i++) { 
            System.out.println(name + ":  " + i); 
            latch.countDown(); 
        } 
    } 
} 