public class TestPolymorphism{
	
	/*---------- 
				POLYMORPHISM : ONE METHOD IN MANY FORM (2 TYPES)
					1) COMPILE TIME POLYMORPHISM / STATIC BINDING / EARLY BINDING : METHOD OVERLOADING
					2) RUN TIME POLYMORPHISM / DYNAMIC BINDING / LATE BINDING : METHOD OVERRIDING
	----------*/
	
	
	/*---------- 
				OVERLOADING : (3 TYPES)
					1) METHOD OVERLOADING :
							- CLASS CONTAINS MORE THAN ONE METHOD WITH SAME NAME BUT DIFFERENT NUMBER OF PARAMETERS, OR
							- CLASS CONTAINS MORE THAN ONE METHOD WITH SAME NAME AND SAME NUMBER OF PARAMETERS WITH DIFFERENT DATA TYPES  
						
					2) CONSTRUCTOR OVERLOADING
							- CLASS CONTAINS MORE THAN ONE CONSTRUCTOR WITH DIFFERENT NUMBER OF PARAMETERS, OR
							- CLASS CONTAINS MORE THAN ONE METHOD WITH SAME NUMBER OF PARAMETERS WITH DIFFERENT DATA TYPES
						
					3) OPERATOR OVERLOADING
							- JAVA DON'T SUPPORT OPERATOR OVERLOADING EXCEPT '+'
	----------*/
	
	class OverloadedMethod {
		
		int m1(int a){
			return a;
		}
		int m1(int a, int b){  // OVERLOADED METHOD
			return a+b;
		}
		int m2(int a){
			return a*2;
		}
		char m2(char a){ 	   // OVERLOADED METHOD
			return a;
		}
	}
	
	
	/*---------- 
				METHOD OVERRIDING :
					- FOR METHOD OVERRIDING, TWO CLASSES ARE NEEDED WITH INHERITANCE RELATIONSHIP
					- METHOD SIGNATURE (NAME + PARAMETER LIST) OF INHERITED METHOD REMAIN SAME IN CHILD CLASS  
					- METHOD IMPLEMENTATION (BODY) OF INHERITED METHOD IS DIFFERENT IN CHILD CLASS 
	----------*/
	
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					1) METHOD SIGNATURE MUST BE SAME
					2) FOR PRIVATE LEVEL, RETUEN TYPE MUST BE SAME
	----------*/
	
	class Parent {
		int m1(int a){
			return a;
		}
	}
	class Child extends Parent {
		int m1(int a){
			return a*2;
		}
	}
	
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					3) FOR CLASS LEVEL, CO-VARIENT RETUEN TYPE (SUBCLASS) IS ACCEPTABLE
	----------*/
	
	class Animal {
		Animal a1(){
			return new Dog();
		}
		void a2(){
			System.out.println("In Animal class method a2");
		}
	}
	class Dog extends Animal {
		Dog a1(){
			return new Dog();
		}
		void d2(){
			System.out.println("In Dog class method d2");
		}
	}
	
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					4) IF A METHOD DECLEARED AS FINAL, THAN IT CANNOT BE OVERRIDE

				NB:
					- FINAL CLASSES CANNOT BE INHERITED (EXTENDED)
					- FINAL METHODS CANNOT BE OVERRIDEN
					- FINAL VARIABLES CANNOT CHANGE VALUE
					- FINAL CLASS METHODS ARE ALSO FINAL BY DEFAULT
					- FINAL CLASS VARIABLES ARE NOT FINAL BY DEFAULT
	----------*/
	
	
	
	
	class Parent1 {
		void m1(){
			System.out.println("Parent1 method m1");
		}
	}
	class Child1 extends Parent1 {
		void m1(){
			System.out.println("Child1 method m1");
		}
		void m2(){
			System.out.println("Child1 method m2");
		}
	}
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					5) STATIC METHODS CANNOT BE OVERRIDE, THEY BONDED WITH CLASS 
	----------*/
	
	
	/*
	METHOD HIDING CONCEPT : 
	ERROR : modifier 'static' is only allowed in constant variable declarations
	
	class Parent2 {
		static void m1(){
			System.out.println("Parent2 method m1");
		}
	}
	class Child2 extends Parent2 {
		static void m1(){
			System.out.println("Child2 method m1");
		}
		static void m2(){
			System.out.println("Child2 method m2");
		}
	}
	*/
	
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					6) PRIVATE METHODS CANNOT BE OVERLOADED, COZ PRIVATE METHODS CANNOT BE INHERITED
	----------*/
	
	/*---------- 
				08 RULES FOR METHOD OVERRIDING : 
					7) ACCESS MODIFIERS : (4 TYPES)
						PUBLIC 		--> ACCIABLE BY ANY PACKAGE
						PROTECTED 	--> ACCIABLE WITHIN THE PACKAGE. OUTSIDE THE PACKAGE, ONLY CHILD CAN ACCESS
						PRIVATE		--> ACCIABLE WITHIN THE CLASS ONLY
						DEFAULT		--> ACCIABLE WITHIN THE PACKAGE ONLY
	----------*/
	
	public static void main(String[] args){
		
		TestPolymorphism t = new TestPolymorphism();
		/*-----METHOD OVERLOADING-----*/
		TestPolymorphism.OverloadedMethod ol = t.new OverloadedMethod();
		System.out.println(ol.m1(5));
		System.out.println(ol.m1(5,7)); // CALLING m1 DIFFERENTLY
		System.out.println(ol.m2(9));
		System.out.println(ol.m2('A')); // CALLING m2 DIFFERENTLY
		
		/*-----METHOD OVERRIDING (RULE : 1&2)-----*/
		TestPolymorphism.Parent p = t.new Parent();
		TestPolymorphism.Child c = t.new Child();
		System.out.println(p.m1(5)); // OUTPUT : 5
		System.out.println(c.m1(5)); // OUTPUT : 10
		
		/*-----METHOD OVERRIDING (RULE : 3)-----*/
		TestPolymorphism.Animal at = t.new Animal();
		TestPolymorphism.Dog dt = t.new Dog();
		at.a2();
		dt.d2();
		
		/*-----METHOD OVERRIDING (RULE : 5)-----*/
		TestPolymorphism.Parent1 p1 = t.new Child1(); // PARENT1 TYPE HOLDS CHILD1 TYPE OBJECT
		//TestPolymorphism.Child1 c1 = t.new Parent1();  CHILD1 TYPE CANNOT HOLD PARENT1 TYPE OBJECT
		p1.m1();    // OUTPUT : Child1 method m1
		//p1.m2();	ERROR
		// TO CALL m2
		Child1 c1 = (Child1)p1;
		c1.m2();    // OUTPUT : Child1 method m2
		
		//TestPolymorphism.Parent2 p2 = t.new Child2();
		
		
		
	}
}