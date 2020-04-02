public class TestEncapsulation{
	
	/*---------- 
				ENCAPSULATION = DATA HIDING + ABSTRUCTION
					- ENCAPSULATION IS THE PROCESS OF BINDING DATA AND IT'S CORRESPONDING METHODS INTO A SINGLE UNIT
					- EVERY CLASS IN JAVA IS AN ENCAPSULATION
	----------*/
	
	/*---------- 
				TIGHTLY ENCAPSULATED CLASS :
					- EVERY VARIABLE (INSTANCE AND STATIC) MUST BE DECLEARED AS PRIVATE
					- WHETHER THE CLASS CONTAINS 'GET' AND 'SET' METHODES OR NOT 
					- WHETHER THE 'GET' AND 'SET' METHODES ARE PUBLIC OR NOT
					** IF THE PARENT CLASS IS NOT TIGHTLY ENCAPSULATED, THEN NO CHILD CLASSES ARE TIGHTLY ENCAPSULATED 
	----------*/
	
	/*---------- 
				DATA HIDING:
					1) MAKE VARIABLES PRIVATE
					2) MAKE METHODES PUBLIC
					3) ACCESS TO VARIABLES THROUGH 'GET'(ACCESSOR) AND 'SET'(MUTATOR) METHODES
					4) CONFIRM VALIDATION INSIDE 'GET' AND 'SET' METHODE 
	----------*/
	
	class Account{
		
		private double balabce; // DATA MEMBER (INSTANCE VARIABLE)
		
		public void setBalance(double d){
			
			// VALIDATION CODE FOR 'double d' .....
			
			balabce = d; // IF VALIDATION IS TRUE
			
		}
		
		public double getBalance(){
			
			//VALIDATION CODE FOR ACCESSOR
			
			return balabce; // IF VALIDATION IS TRUE 
		}
	}
	
	
	public static void main(String[] args){
		
		TestEncapsulation t = new TestEncapsulation();  // CREATE OUTER CLASS OBJECT
		TestEncapsulation.Account a = t.new Account();	// CREATE INNER CLASS OBJECT
		a.setBalance(55.55);							// SET VALUE OF INSTANCE VARIABLE
		System.out.println(a.getBalance());				// GET VALUE OF INSTANCE VARIABLE
		
		
		
	}
} 