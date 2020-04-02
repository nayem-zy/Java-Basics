/*----------
	MULTITHREADING :
		- A JAVA FEATURE THAT ALLOWS CONCURRENT EXECUTION OF TWO OR MORE PARTS OF A PROGRAM FOR MAXIMUM UTILIZATION OF CPU 
		- EACH PART OF SUCH PROGRAM IS CALLED A THREAD. SO, THREADS ARE LIGHT-WEIGHT PROCESSES WITHIN A PROCESS
----------*/

/*---------- 
	2 MECHANISMS FOR THREAD CREATION :
		1) EXTENDING THE 'Thread' CLASS				[NOT RECOMENDED]
		2) IMPLEMENTING THE 'Runnable' INTERFACE	[RECOMENDED]
----------*/



// THREAD CREATION EXTENDING THE 'Thread' CLASS : [NOT RECOMENDED]

class MyThread1 extends Thread { // 1) EXTEND THE THREAD CLASS 
	public void run(){ // 2) DEFINE THE JOB THE THREAD MUST DO
		System.out.println("In a new thread that extends a class");
	}
	public static void main(String[] args){
		Thread t1 = new MyThread1(); // 3) CREATE AN OBJECT OF CHILD CLASS 
		t1.start(); // 4) START THE THREAD 
	}
}


// THREAD CREATION IMPLEMENTING THE 'Runnable' INTERFACE : [RECOMENDED]

class MyThread2 implements Runnable { //1) IMPLEMENT THE RUNNABLE INTERFACE
	public void run(){ // 2) DEFINE THE JOB THE THREAD MUST DO
		System.out.println("In a new thread that implements an interface");
	}
	public static void main(String[] args){
		MyThread2 m2 = new MyThread2(); // 3) CREATE AN OBJECT OF CHILD CLASS 
		Thread t2 = new Thread(m2);	// 4) CREATE AN OBJECT OF THREAD CLASS AND PASS THE CHILD CLASS OBJECT TO IT
		t2.start(); // 5) START THE THREAD 
	}
}

class MyRunnable implements Runnable {
	public void run(){
		go();
	}
	public void go(){
		doMore();
	}
	public void doMore(){
		System.out.println("Top of the stack");
	}
	
	public static void main(String[] args){
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		myThread.start();
		System.out.println("Back in main");
	}
}



 
