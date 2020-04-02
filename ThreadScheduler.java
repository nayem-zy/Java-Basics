
/*---------- 
	2 TYPES OF THREAD SCHEDULING :
				
		1) PREEMPTIVE SCHEDULING :
			- THE HIGHEST PRIORITY TASK EXECUTES UNTIL 
				a) IT ENTERS THE WAITING STATE OR 
				b) IT ENTERS THE DEAD STATE OR 
				c) A HIGHER PRIORITY TASK COMES INTO EXISTENCE
				
		2) TIME SCLICING :
			- A TASK EXECUTES FOR A PREDEFINED SLICE OF TIME AND THEN RE-ENTERS THE POOL OF READY TASKS 
			- THE SCHEDULER THEN DETERMINES WHICH TASK SHOULD EXECUTE NEXT, BASED ON PRIORITY AND OTHER FACTORS
----------*/


/*---------- 
	THREAD PRIORITY :
		- THREAD SCHEDULER ASSIGNS PROCESSOR TO A THREAD BASED ON PRIORITY OF THREAD 
		- PRIORITY CAN EITHER BE GIVEN BY JVM WHILE CREATING THE THREAD OR IT CAN BE GIVEN BY PROGRAMMER EXPLICITLY
		- ACCEPTED VALUE OF PRIORITY FOR A THREAD IS IN RANGE OF 1 TO 10 

----------*/

/*---------- 
	3 STATIC VARIABLES DEFINED IN 'Thread' CLASS FOR PRIORITY :
		1) public static int MIN_PRIORITY : MINIMUM PRIORITY THAT A THREAD CAN HAVE 				:(VALUE FOR THIS IS 1)
		2) public static int NORM_PRIORITY: DEFAULT PRIORITY OF A THREAD IF NOT DEFINED EXPLICITLY  :(VALUE FOR THIS IS 5)
		3) public static int MAX_PRIORITY : MAXIMUM PRIORITY OF A THREAD CAN HAVE 					:(VALUE FOR THIS IS 10)
----------*/

/*---------- 
	2 METHODS TO ACCESS DEFINED IN 'Thread' CLASS :
		1) public final int getPriority()					: java.lang.Thread.getPriority() METHOD RETURNS PRIORITY OF GIVEN THREAD
		2) public final void setPriority(int newPriority)	: java.lang.Thread.setPriority() METHOD CHANGES THE PRIORITY OF THREAD TO THE VALUE NEWPRIORITY 
			** (THIS METHOD THROWS ILLEGALARGUMENTEXCEPTION IF VALUE OF PARAMETER NEWPRIORITY GOES BEYOND MINIMUM(1) AND MAXIMUM(10) LIMIT)
----------*/




// Java program to demonstrate getPriority() and setPriority() 
import java.lang.*; 
  
class ThreadDemo extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run method"); 
    } 
  
    public static void main(String[]args) 
    { 
        ThreadDemo t1 = new ThreadDemo(); 
        ThreadDemo t2 = new ThreadDemo(); 
        ThreadDemo t3 = new ThreadDemo(); 
  
        System.out.println("t1 thread priority : " + 
                              t1.getPriority()); // Default 5 
        System.out.println("t2 thread priority : " + 
                              t2.getPriority()); // Default 5 
        System.out.println("t3 thread priority : " + 
                              t3.getPriority()); // Default 5 
  
        t1.setPriority(2); 
        t2.setPriority(5); 
        t3.setPriority(8); 
  
        // t3.setPriority(21); will throw IllegalArgumentException 
        System.out.println("t1 thread priority : " + 
                              t1.getPriority());  //2 
        System.out.println("t2 thread priority : " + 
                              t2.getPriority()); //5 
        System.out.println("t3 thread priority : " + 
                              t3.getPriority());//8 
  
        // Main thread 
        System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
  
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
    } 
}

/*
OUTPUT :
t1 thread priority : 5
t2 thread priority : 5
t3 thread priority : 5
t1 thread priority : 2
t2 thread priority : 5
t3 thread priority : 8
mainMain thread priority : 5
Main thread priority : 10
*/