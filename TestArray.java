public class TestArray{
	public static void main(String[] args){
		
		/*----------
		3 STEPS : 
				1) ARRAY DECLEARATION
				2) ARRAY CONSTRUCTION
				3) ARRAY INITIALIZATION
		----------*/
		
		
		
		/*---------- 1) ARRAY DECLEARATION ----------*/
		
		
		// 1D ARRAY DECLEARATION (3 TYPE):
		int[] a1; // RECOMANDED : SPECIFICATION OF DIMENTION AFTER DATA TYPE
		int []a2; // SPECIFICATION OF DIMENTION BEFORE VARIABLE NAME
		int a3[]; // SPECIFICATION OF DIMENTION AFTER VARIABLE NAME
		//int[6] a;  INVALID COZ SIZE CANNOT BE SPECIFIED DURING DECLEARATION 
		
		// 2D ARRAY DECLEARATION (6 TYPE):
		int[][] a4;
		int[] []a5;
		int[] a6[];
		int [][]a7;
		int []a8[];
		int a9[][];
		
		// DIMENTION IDENTIFICATION :
		int[] x1, y1; // x1 = 1D, y1 = 1D
		int[] x2[], y2; // x2 = 2D, y2 = 1D
		int[] x3[], y3[]; // x3 = 2D, y3 = 2D
		int[] []x4, y4; // x4 = 2D, y4 = 2D
		int[] []x5, y5[]; // x5 = 2D, y5 = 3D	
		//int[] []x6, []y6;	SPECIFICATION OF DIMENTION BEFORE VARIABLE IS VALID ONLY BEFORE 1ST VARIABLE
		//int[] x7, []y7; SPECIFICATION OF DIMENTION BEFORE VARIABLE IS VALID ONLY BEFORE 1ST VARIABLE
	
	
		


	
		/*---------- 2) ARRAY CONSTRUCTION ----------*/
		
		
		//int a10 = new int []; NOT VALID
		int[] a11 = new int [5]; //SIZE MUST BE SPECIFIED DURING CREATION
		int[] a12 = new int [0]; //ZIOR SIZE ARRAY CREATION IS VALID
		//int[] a13 = new int [-5]; RUN TIME ERROR: NEGATIVE ARRAY SIZE EXCEPTION 
		int[] a14 = new int ['A']; // SIZE IS ASCII VALUE OF A 
		//int[] a15 = new int [5l]; SIZE CAN BE BYTE, SHORT, INT AND CHAR
		//int[] a16 = new int [21_47_48_36_47]; // MAX SIZE OF ARRAY = MAZ SIZE OF INTEGER
		//int[] a17 = new int [21_47_48_36_48]; INVALID COZ MAX SIZE EXCEEDS
		//byte[] a18 = new byte [21_47_48_36_47]; //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit at TestArray.main(TestArray.java:35)
		
		
		// MULTIDIMENTIONAL ARRAY IMPLEMENTATION : (TREE STRUCTURE, NOT MATRIX STRUCTURE)
		
		//2D
		int[][] a19 = new int[2][];  //		o  o   	(LEVEL : 1)
			a19[0] = new int[2]; //			|  |
			a19[1] = new int[3]; //		   oo  ooo 	(LEVEL : 2) 
		
		//3D
		int[][][] a20 = new int[2][][]; //				o    o		(LEVEL : 1)
			a20[0] = new int[3][]; //					|    |
			a20[0][0] = new int[1]; //			  o  o  o    o o	(LEVEL : 2)
			a20[0][1] = new int[2]; //			  |  |  |    | | 
			a20[0][2] = new int[3]; //   		  o oo ooo  oo oo 	(LEVEL : 3)
			a20[1] = new int[2][2]; //
	
		
		// VALID/INVALID CREATION OF ARRAY :
		//int[] a21 = new int[]; 	 		INVALID COZ SIZE DIDN'T SPECIFIED
		int[] a22 = new int[3]; //	 		VALID
		//int[][] a23 = new int[][]; 		INVALID COZ SIZE DIDN'T SPECIFIED
		int[][] a24 = new int[3][]; // 		VALID
		//int[][] a25 = new int[][3]; 		INVALID COZ SIZE OF PARENT DIDN'T SPECIFIED
		int[][] a26 = new int[3][4]; //		VALID
		int[][][] a27 = new int[2][3][4]; //VALID
		int[][][] a28 = new int[2][3][]; //	VALID
		//int[][][] a29 = new int[2][][4];	INVALID COZ SIZE OF PARENT DIDN'T SPECIFIED
		//int[][][] a30 = new int[][3][4];	INVALID COZ SIZE OF PARENT DIDN'T SPECIFIED
		
		
		
		
		/*---------- 3) ARRAY INITIALIZATION ----------*/
		
		
		
		// ARRAY ELEMENTS ARE INITIALIZES TO 0 WHENEVER IT CREATS 
		
		//DEFAULT VALUE : 
		int[] a31 = new int[2];
		System.out.println(a31); //		OUTPUT : [I@24d46ca6	(CLASS NAME @ HASH CODE) 
		System.out.println(a31[0]); //	OUTPUT : 0				(DEFAULT VALUE OF INTEGER)
		System.out.println(a31[1]); // 	OUTPUT : 0				(DEFAULT VALUE OF INTEGER)
		
		int[][] a32 = new int[2][3];
		System.out.println(a32); //		OUTPUT : [[I@4517d9a3
		System.out.println(a32[0]); //	OUTPUT : [I@372f7a8d
		System.out.println(a32[0][0]);//OUTPUT : 0

		int[][] a33 = new int[2][];	
		System.out.println(a33); //		OUTPUT : [[I@2f92e0f4
		System.out.println(a33[0]); // 	OUTPUT : null			(DEFAULT VALUE OF CLASS)
		//System.out.println(a33[0][0]);//OUTPUT : Exception in thread "main" java.lang.NullPointerException at TestArray.main(TestArray.java:86)
	
		
		// VALUE ASSERTION :
		
		int[] a34;				// DECLEARATION				
			a34 = new int[3];	// CREATION WITH INITIALIZATION TO 0
			a34[0] = 5;			// VALUE ASSERTION
			a34[1] = 6;			// VALUE ASSERTION
			a34[2] = 7;			// VALUE ASSERTION
			
			
		// DECLEARATION, CREATION AND INITIALIZATION IN A SINGLE LINE :
		
		int[] a35 = {5,10,15,20};
		char[] c = {'a', '5', 'd', '3'};
		String[] s = {"a", "asdf", "jakal", "dflo"};
		int[][][] a36 = {{{10},{20,30}},{{40},{50,60},{70,80,90}}}; // 3D
		
		
		
		// length VS length() :
		// length --> FINAL VARIABLE, REPRESENTS THE SIZE OF THE ARRAY
		// length() --> FINAL METHOD, REPRESENTS THE NO OF CHAR'S IN A STRING 
		
		System.out.println(a36.length); // 2
		System.out.println(a36[0].length); // 2
		System.out.println(a36[1].length); // 3
		System.out.println(s.length); // 4
		System.out.println(s[0].length()); // 1
		System.out.println(s[1].length()); // 4
		
		
		// CLASS IDENTIFICATION :
		boolean[] m1 = {true, false};
		System.out.println(m1.getClass().getName()); // OUTPUT : [Z
		boolean[][] m2 = {{true, false, true},{true}};
		System.out.println(m2.getClass().getName()); // OUTPUT : [[Z
		
		char[] m3 = {'a', 's'};
		System.out.println(m3.getClass().getName()); // OUTPUT : [C
		char[][] m4 = {{'d', 'c', 'f'},{'a'}};
		System.out.println(m4.getClass().getName()); // OUTPUT : [[C
		
		byte[] m5 = {10, 20};
		System.out.println(m5.getClass().getName()); // OUTPUT : [B
		byte[][] m6 = {{10, 20, 30},{40}};
		System.out.println(m6.getClass().getName()); // OUTPUT : [[B
		
		short[] m7 = {10, 20};
		System.out.println(m7.getClass().getName()); // OUTPUT : [S
		short[][] m8 = {{10, 20, 30},{40}};
		System.out.println(m8.getClass().getName()); // OUTPUT : [[S
		
		int[] m9 = {10, 20};
		System.out.println(m9.getClass().getName()); // OUTPUT : [I
		int[][] m10 = {{10, 20, 30},{40}};
		System.out.println(m10.getClass().getName()); // OUTPUT : [[I
		
		long[] m11 = {10l, 20l};
		System.out.println(m11.getClass().getName()); // OUTPUT : [J
		long[][] m12 = {{10l, 20l, 30l},{40l}};
		System.out.println(m12.getClass().getName()); // OUTPUT : [[J
		
		float[] m13 = {10f, 20f};
		System.out.println(m13.getClass().getName()); // OUTPUT : [F
		float[][] m14 = {{10f, 20f, 30f},{40f}};
		System.out.println(m14.getClass().getName()); // OUTPUT : [[F
		
		double[] m15 = {10, 20};
		System.out.println(m15.getClass().getName()); // OUTPUT : [D
		double[][] m16 = {{10, 20, 30},{40}};
		System.out.println(m16.getClass().getName()); // OUTPUT : [[D
		
		
		// ANONYMOUS ARRAY : AN ARRAY WITHOUT A NAME
		
		//new int[] {10, 20, 30, 40, 50}; 		ERROR : NOT A STATEMENT
		
		
		
		
		/*---------- ARRAY TYPE  ----------*/
		
		// 4 TYPES :
		// 1 : PRIMITIVE TYPE ARRAY --> CAN BE IMPLICITLY PROMOTED TO DECLEARED TYPE
		// 2 : OBJECT TYPE ARRAY --> EITHER DECLEARED TYPE RO IT'S CHILD CLASS OBJECTS ARE ALLOWED
		// 3 : ABSTRUCT TYPE ARRAY --> IT'S CHILD CLASS OBJECTS ARE ALLOWED
		// 4 : INTERFACE TYPE ARRAY --> IT'S IMPLEMENTATION CLASS OBJECTS ARE ALLOWED 
		
		// CASE_1 : PRIMITIVE TYPE ARRAY
		int[] a37 = new int[10];
			a37[0] = 10;
			a37[1] = 'a';
			
			byte p = 20;
			a37[2] = p;
			
			short q = 30;
			a37[3] = q;
			
			long r = 40;
			//a37[4] = r;   NOT VALID
			//a37[5] = 40L; NOT VALID 
		
		
		// CASE_2 : OBJECT TYPE ARRAY
		Object[] a38 = new Object[10];
			a38[0] = new Object();
			//a38[1] = new Integer(10);		warning: [deprecation] Integer(int) in Integer has been deprecated a38[1] = new Integer(10);
			a38[2] = new String("asdf");
			
		Number[] a39 = new Number[10];
			//a39[0] = new Integer(10);		warning: [deprecation] Integer(int) in Integer has been deprecated a39[0] = new Integer(10);
			//a39[1] = new Double(10.5);	warning: [deprecation] Double(double) in Double has been deprecated a39[1] = new Double(10.5);
			//a39[2] = new String("dfgfdg");NOT VALID 

		
		// CASE_4 : INTERFACE TYPE ARRAY
		Runnable[] a40 = new Runnable[10];
			a40[0] = new Thread();
			//a40[1] new String();	NOT VALID
			
			
		
		/*---------- ARRAY VARIABLE ASSIGNMENT  ----------*/
		
		
		//CASE_1 : ELEMENT LEVEL PROMOTIONS ARE NTO APPLICABLE FOR ARRAY LEVEL
		//CASE_2 : WHILE ASSINING ONE ARRAY TO ANOTHER, THE ELEMENTS WON'T COPPIED, JUST REFERENCE VARIABLE REASSIGNED
		//CASE_3 : WHILE ASSINING ONE ARRAY TO ANOTHER, THE DIMENTION AND TYPE MUST BE MATCHED, SIZE MATCHING IS NOT REQUIRED
		
		
		// CASE_1 : AUTOMATICALLY PERFORMED PROMOTIONS 
		// char --> int				VALID
		// char[] --> int[]			NOT VALID
		// int --> double			VALID
		// int[] --> double[]		NOT VALID
		// float --> int			NOT VALID
		// float[] --> int[] 		NOT VALID
		// String --> Object		VALID
		// String[] --> Object[]	VALID
		
	}
}