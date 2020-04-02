public class TestInheritance {
	
	/*---------- 
				INHERITANCE : (CHILD CLASS extends PARENT CLASS)
					1) THE MOST COMMON METHODS WHICH ARE APPLICABLE TO ANY CHILD CLASS, HAVE TO BE DEFINED IN PARENT CLASS
					2) THE SPECIFIC METHODS WHICH ARE APPLICABLE TO A PARTICULAR CHILD, HAVE TO BE DEFINED IN CHILD CLASS
					3) ALL NON_PRIVATE METHODS OF PARENT CLASS ARE AVAILABLE TO CHILD CLASS 
					
					** EVERY CLASS OF JAVA IS A CHILD OF OBJECT CLASS (ROOT CLASS) DIRECTLY OR INDIRECTLY
						HENCE, ALL OBJECT CLASS METHODS ARE AVAILABLE TO ANY CLASS OF JAVA
						
						OBJECT CLASS METHODS:
							toString()			hashCode()			equals()		
							getClass()			finalize()			clone()
							wait()				notify()			notifyAll()
	----------*/
	
	
	/*---------- 
				5 TYPES OF INHERITANCE :
					1) SINGLE LEVEL INHERITANCE 	: class B extends A{}
					2) MULTILEVEL INHERITANCE 		: class B extends A{}  class C extends B{} 
					3) HIRARCHI (TREE) INHERITANCE 	: class B extends A{}  class C extends A{} 
					4) MULTIPLE INHERITANCE 		: class C extends A,B{} 	---> NOT SUPPORTED BY JAVA
					5) HYBRID INHERITANCE 			: MULTIPLE + HIRARCHI 		---> NOT SUPPORTED BY JAVA
	----------*/
	
	
	/*---------- 
				MULTIPLE INHERITANCE :
					- JAVA DON'T SUPPORT MULTIPLE INHERITANCE OF CLASS (AMBIGUITY OCCURS IF INHERITED METHOD EXISTS IN BOTH PARENT CLASSES)
					- JAVA SUPPORTS MULTIPLE INHERITANCE OF INTERFACE  (ONLY METHOD NAME IS INHERITED)
	----------*/
	
	
	/*---------- 
				CYCLIC INHERITANCE :
					- JAVA DON'T SUPPORT CYCLIC INHERITANCE
				
					eg: class A extends A {} or
						class A extends B {}  class B extends A {} or
						class A extends B {}  class B extends C {}  class C extends A {}  .... (etc)
	----------*/
	
	
	/*---------- 
				PREVENTING INHERITANCE :
					- FINAL CLASSES CANNOT BE INHERITED
					
					eg : final class A ()
						 class B extends A {} ---> ILLIGAL STATEMENT
	----------*/
	
	
	
	
	
	class A {
		void m1(){
			System.out.println("Class A Method m1");
		}
		void m2(){
			System.out.println("Class A Method m2");
		}
	}
	
	class B extends A {
		void m3(){
			System.out.println("Class B Method m3");
		}
		void m4(){
			System.out.println("Class B Method m4");
		}
	}
	
	class C extends B {
		void m5(){
			System.out.println("Class C Method m5");
		}
		void m6(){
			System.out.println("Class C Method m6");
		}
	}
	
	
	/*---------- 
				RULES FOR INHERITANCE :
					1) PARENT TYPE REFERENCE CAN HOLD CHILD TYPE OBJECT (PARENT p = new CHILD();)
						
						~ FOR OVERRIDING METHODS:
							- DURING COMPILATION, PARENT CLASS METHODS ARE CHECKED
							- DURING RUNTIME, CHILD CLASS METHODS ARE RUN
						
						~ FOR CHILD CLASS SPECIFIC METHODS:
							- FIRST, PARENT TYPE REFERENCE HAVE TO BE CUSTED AS A CHILD TYPE REFERENCE
							- THEN, CHILD CLASS SPECIFIC METHODS CAN CALL ON NEW REFERENCE
							
					2) CHILD TYPE REFERENCE CANNOT HOLD PARENT TYPE OBJECT (CHILD C = new PARENT();)
	----------*/
	
	
	class Parent {
		void m1(){
			System.out.println("Class Parent Method m1");
		}
		void m2(){
			System.out.println("Class Parent Method m2");
		}
	}
	
	class Child extends Parent {
		void m2(){
			System.out.println("Class Child Method m2"); // OVERRIDING METHOD
		}
		void m3(){
			System.out.println("Class Child Method m3");
		}
	}
	
	
	
	/*---------- 
				CALLING PARENT CLASS ELEMENT :
					- this.element ---> TO ACCESS OWN CLASS ELEMENT
					- super.element ---> TO ACCESS PARENT CLASS ELEMENT
	----------*/
	
	
	class Parent1 {
		int a = 10;
		int b = 20;
	}
	class Child1 extends Parent1 {
		int a = 100;
		int b = 200;
		void add(int a, int b){
			System.out.println(a+b);
		}
	}
	
	public static void main(String[] args){
		TestInheritance t = new TestInheritance();
		
		TestInheritance.A a = t.new A();
		TestInheritance.B b = t.new B();
		TestInheritance.C c = t.new C();
		
		a.m1(); // m1 & m2 are own class methods
		a.m2();
		
		b.m1(); // m3 & m4 are own class methods and m1 & m2 are Inherited methods
		b.m2();
		b.m3();
		b.m4();
		
		c.m1(); // m5 & m6 are own class methods and m1 to m4 are Inherited methods
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();
		
		TestInheritance.Parent p1 = t.new Parent();
		TestInheritance.Child c1 = t.new Child();
		p1.m1();
		p1.m2();
		c1.m2();
		c1.m3();
		
		TestInheritance.Parent p2 = t.new Child();
		p2.m2();
		//p2.m3(); ERROR
		TestInheritance.Child c2 = (Child)p2; // CUSTING p2 AS Child
		c2.m3();
		
		//TestInheritance.Child c3 = t.new Parent(); ERROR
		
		/*
		CALLING PARENT CLASS ELEMENT ; 
		int a = 1000;
		int b = 2000;
		TestInheritance.Child1 c4 = t.new Child1();
		c4.add(a , b);
		c4.add(this.a , this.b);
		c4.add(super.a , super.b);*/
	}
}