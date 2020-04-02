public class TestBlock {
	
	
	/*---------- 
				2 TYPES OF BLOCKS :
					1) INSTANCE BLOCK
					2) STATIC BLOCK
	----------*/
	
	
	/*---------- 
				INSTANCE BLOCK :
					- EXECUTES DURING EACH OBJECT CREATION ONLY
					- CAN BE USED TO INITIALIZE OBJECTS (LIKE CONSTRUCTOR)
					- USED TO EXECUTE LOGICS THAT NEED TO IMPLEMENT DURING OBJECT CREATION
					- MULTIPLE INSTANCE BLOCKS CAN EXISTS IN A CLASS, WHICH EXECUTES SEQUENTIALLY 
					
					** DURING OBJECT CREATION, INSTAQNCE BLOCK WILL EXECUTE FIRST, THEN CONSTRUCTOR 
					** EXECUTION OF INSTANCE BLOCK DEPENDS ON OBJECT CREATION, NOT ON CONSTRUCTOR CALLING
	----------*/
	
	
	/*---------- 
				STATIC BLOCK :
					- EXECUTES DURING THE "DOT CLASS" FILE LOADING
					- EXECUTION IS NOT RELATED TO OBJECT CREATION
					- USED TO EXECUTE LOGICS THAT NEED TO IMPLEMENT DURING .class FILE LOADING
					
					** EXECUTION OF STATIC BLOCK DEPENDS ON CLASS FILE LOADING, NOT ON OBJECT CREATION
					** EXECUTES ENEN IF THERE IS NO main METHOD
	----------*/
	
	
	// INSTANCE BLOCK :
	{
		System.out.println("instance block");
	}
	
	// CONSTRUCTORS :
	TestBlock(){
		this(5); // CALLING 1-ARG CONSTRUCTOR
		System.out.println("0 arg constructor");
	}
	TestBlock(int a){
		this(5,6); // CALLING 2-ARG CONSTRUCTOR
		System.out.println("1 arg constructor");
	}
	TestBlock(int a, int b){
		System.out.println("2 arg constructor");
	}
	
	// STATIC BLOCK :
	static {
		System.out.println("The .class file has been loaded"); // EXECUTES EVEN IF THERE IS NOTHING IN THE main METHOD
	}
	
	public static void main(String[] args){
		
		
		TestBlock t1 = new TestBlock();
		/* OUTPUT :
		instance block
		2 arg constructor
		1 arg constructor
		0 arg constructor
		*/
		
		TestBlock t2 = new TestBlock(2);
		/* OUTPUT :
		instance block
		2 arg constructor
		1 arg constructor
		*/
		
		TestBlock t3 = new TestBlock(2,3);
		/* OUTPUT :
		instance block
		2 arg constructor
		*/
	}
}