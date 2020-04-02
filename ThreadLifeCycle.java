
/*----------
				THREAD LIFE CYCLE   : 6 STATES OF THREAD
				
		1) NEW THREAD 				: WHEN A NEW THREAD IS CREATED BUT NOT STARTED TO RUN 
		2) RUNNABLE STATE 			: WHEN A THREAD IS READY TO RUN OR CURRENTLY RUNNING
		3) BLOCKED STATE 			: WHEN IT TRY TO ACCESS A PROTECTED SECTION OF CODE THAT IS LOCKED BY ANOTHER THREAD
		4) WAITING START 			: WHEN IT WAITS FOR ANOTHER THREAD ON A CONDITION
		5) TIMED WAITING STATE 		: WHEN IT CALLS A METHOD WITH A TIME OUT PARAMETER (eg. sleep())
		6) TERMINATED (DEAD) STATE 	: WHEN IT EXITS NORMALLY OR AN UNHANDELED EXCEPTION OCCUR
----------*/


// Java program to demonstrate thread states 
class NestedThread implements Runnable 
{ 
    public void run() 
    { 
        // moving thread2 to timed waiting state 
        try
        { 
            Thread.sleep(1500); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
          
        System.out.println("State of thread1 while it called join() method on thread2 -"+ Test.thread1.getState()); 
        try
        { 
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        }      
    } 
} 
  
class Test implements Runnable 
{ 
    public static Thread thread1; 
    public static Test obj; 
      
    public static void main(String[] args) 
    { 
        obj = new Test(); 
        thread1 = new Thread(obj); 
          
        // thread1 created and is currently in the NEW state. 
        System.out.println("State of thread1 after creating it - " + thread1.getState()); 
        
		// to move thread1 to Runnable state
		thread1.start(); 
        System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState()); 
    } 
      
    public void run() 
    { 
        NestedThread myThread = new NestedThread(); 
        Thread thread2 = new Thread(myThread); 
          
        // thread2 created and is currently in the NEW state. 
        System.out.println("State of thread2 after creating it - "+ thread2.getState()); 
        thread2.start(); 
          
        // thread2 moved to Runnable state 
        System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState()); 
          
        // moving thread1 to timed waiting state 
        try
        { 
            //moving thread1 to timed waiting state 
            Thread.sleep(200); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
        System.out.println("State of thread2 after calling .sleep() method on it - "+ thread2.getState() ); 
          
          
        try 
        { 
            // waiting for thread2 to die 
            thread2.join(); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
        System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState()); 
    } 
      
}

/*
OUTPUT :
State of thread1 after creating it - NEW
State of thread1 after calling .start() method on it - RUNNABLE
State of thread2 after creating it - NEW
State of thread2 after calling .start() method on it - RUNNABLE
State of thread2 after calling .sleep() method on it - TIMED_WAITING
State of thread1 while it called join() method on thread2 -WAITING
State of thread2 when it has finished it's execution - TERMINATED
*/