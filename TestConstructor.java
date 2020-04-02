public class TestConstructor {
	
	int eid;
	String name;
	float salary;
	
	
	/*---------- 
				RULES TO CREATE CONSTURCTOR :
					
					1. CONSTURCTOR NAME AND CLASS NAME MUST BE SAME
					2. CONSTURCTORS ARE NOT ALLOWED TO HAVE ANY RETURN TYPE
					3. CONSTURCTORS CAN HAVE PARAMETERS
					4. DEFAULT CONSTURCTOR HAS EMPTY IMPLEMENTATIN WITH EMPTY PARAMATER LIST
					5. DEFAULT CONSTURCTOR CREATED BY COMPILER ONLY IF USER DEFINED CONSTURCTOR IS ABSENT
	----------*/
	
	
	/*---------- 
				ADVANTAGES OF CONSTURCTORS :
					
					1. CONSTURCTORS ARE USED TO INITIALIZE INSTANCE VARIABLES DURING OBJECT CREATION
					2. CONSTURCTORS ARE USED TO PERFORN LOGICAL OPERATIONS THOSE ARE EXECUTED DURING OBJECT CREATION
	----------*/
	
	
	/*---------- 
				CALLING OF CONSTURCTORS :
					
					1. CONSTURCTOR OF A CLASS IS CALLED DURING OBJECT CREATION WITH new KEYWORD
					2. ONE CONSTURCTOR OF A CLASS CAN CALL ANOTHER CONSTURCTOR OF THE SAME CLASS USING this() KEYWORD
					3. CONSTRUCTOR CALLING INSIDE A CONSTRUCTOR USING this() KEYWORD MUST BE 1ST STATEMENT
					4. ONE CONSTRUCTOR CAN BE ABLE TO CALL ONLY ONE CONSTRUCTOR AT A TIME
	----------*/
	
	TestConstructor ( int eid, String name, float salary){	// USER DEFINED CONSTURCTOR
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;	
	}
	
	void display (){	// INSTANCE METHOD
		
		System.out.println("Employee ID = " + eid);
		System.out.println("Employee Name = " + name);
		System.out.println("Employee Salary = " + salary);
	}
	
	
	
	// TO CALL A CONSTURCTOR FROM ANOTHER CONSTURCTOR OF THE SAME CLASS : 
	
	TestConstructor (int a){
		
		this(10, 20); 	// TWO ARGUMENT CONSTURCTOR INVOCATION
		System.out.println("One Argument Constructor");
	}
	
	TestConstructor (int a, int b){
		
		this(10, 20, 30); 	// THREE ARGUMENT CONSTURCTOR INVOCATION
		System.out.println("Two Argument Constructor");
	}
	
	TestConstructor (int a, int b, int c){
		
		//this(10); 	ERROR: RECURSIVE CONSTRUCTOR INVOCATION
		System.out.println("Three Argument Constructor");
	}
	
	public static void main (String[] args){
	
		//TestConstructor emp1 = new TestConstructor();		error: constructor TestConstructor in class TestConstructor cannot be applied to given types
		TestConstructor emp2 = new TestConstructor(001, "Rashid", 4200f);
		TestConstructor emp3 = new TestConstructor(002, "Kamal", 5200f);
		emp2.display(); // OUTPUT : Employee ID = 1	Employee Name = Rashid	Employee Salary = 4200.0
		emp3.display();	// OUTPUT :	Employee ID = 2	Employee Name = Kamal	Employee Salary = 5200.0
		
		
		
		// TO CALL MORE THAN ONE CONSTURCTOR :

		TestConstructor t1 = new TestConstructor(10);
		/*
		OUTPUT :
		Three Argument Constructor
		Two Argument Constructor
		One Argument Constructor
		*/
	}
}