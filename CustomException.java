
/*---------- 
			CUSTOM EXCEPTION : USER DEFINED EXCEPTION
	
	STEP-1. CREATE A CLASS THAT EXTENDS THE "Exception" CLASS
	STEP-2. CREATE A CONSTRUCTOR WITH STRING TYPE PARAMETER 
	STEP-3. CALL CONSTRUCTOR OF PARENT ( super(s) )
	STEP-4. IF A METHOD 'throws' CUSTOM_EXN AND IF EXCEPTION CONDITION IS TRUE, THEN 'throw' new CUSTOM_EXN
	STEP-5. USE 'try_catch' TO VALIDATE A METHOD THAT THROWS AN EXCEPTION
----------*/

class MyException extends Exception {
	public MyException(String s){
		super(s);
	}
}

class TestMyException {
	
	public void validateNonNegative(int num) throws MyException {
		if(num < 0){
			throw new MyException("Not Valid : Negative Number");
		}
		else{
			System.out.println("A Non Negative Number has accepted");
		}
	}
	
	public static void main(String[] args){
		
		TestMyException t = new TestMyException();
		
		try{
			t.validateNonNegative(-5);
		}
		catch(Exception m){
			System.out.println("Exception Occured : " + m);
		}
	}
}

/*
OUTPUT : Exception Occured : MyException: Not Valid : Negative Number
*/