public class TestIS_A_HAS_A{
	
	
	/*---------- 
				IS-A TEST :
							1) USED TO TEST INHERITANCE , TRUE AT ANYWHERE IN INHERITANCE TREE (anyChildClass IS-A anyParentClass)
							
							2) IF SubClass extends SuperClass , THEN SubClass IS-A SuperClass
							   eg:	IF 'A extends B' , THEN 'A IS-A B'
							
							3) IF ConcreteClass implements AbstructClass , THEN ConcreteClass IS-A AbstructClass 
							   eg:  IF 'A implements B' , THEN 'A IS-A B'
							
							4) IF 'A IS-A B' , THEN 'B IS-A A' IS FALSE 
							   eg:  Beer IS-A Drink , BUT not all Drinks are Beer
							
							5) IF 'A IS-A B' , THEN A HAVE ALL METHODS OF B AND CAN HAVE MORE
	----------*/
	
	/*---------- 
				HAS-A TEST :
							1) USED TO TEST AGGREGATION OR COMPOSITION
							
							2) IF 'A HAS-A B' , THEN A HAS AN INSTANCE VARIABLE WHICH IS A REFERENCE OF OBJECT OF B
							
							3) AGGRIGATION IS ONE OBJECT CONTAINS SOME OTHER OBJECTS
							
							4) IF THE CONTAINED OBJECT CANNOT EXISTS WITHOUT THE CONTAINER OBJECT, THEN THIS AGGRIGATION IS A COMPOSITION 
	----------*/
	
	class Parent{
		
		void m1(){
			System.out.println("Parent Method m1");
		}
		
		void m2(){
			System.out.println("Parent Method m2");
		}
	}


	class Child extends Parent{ // CHILD IS-A PARENT
		
		void m3(){
			System.out.println("Child Method m3");
		}
		
		void m4(){
			System.out.println("Child Method m4");
		}
	}
	
	class Engine{
		void en(){
			System.out.println("Engine Metnod en");
		}
	}
	
	class Car{ // CAR HAS-A ENGINE
		Engine e = new Engine();
		
	}
	
	public static void main(String[] args){
	
		TestIS_A_HAS_A t = new TestIS_A_HAS_A();
		TestIS_A_HAS_A.Parent p = t.new Parent();
		TestIS_A_HAS_A.Child c  = t.new Child();
		p.m1();
		p.m2();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		// PARENT TYPE CAN BE USED TO HOLD CHILD CLASS PBJECT
		// BUT ONLY PARENT CLASS METHODS WILL BE ACCESSIABLE
		TestIS_A_HAS_A.Parent p1 = t.new Child();
		p1.m1();
		p1.m2();
		//p1.m3(); Error
		//p1.m4(); Error
		
		// CHILD TYPE CANNOT BE USED TO HOLD PARENT CLASS OBJECT 
		//TestIS_A_HAS_A.Child c1  = t.new Parent(); ERROR
		
		TestIS_A_HAS_A.Car ca = t.new Car();
		ca.e.en();  // CALLING COMPOSITED OBJECT (ca HAS-A e)
	}
}