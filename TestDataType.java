public class TestDataType{//error: Class names, 'DataType', are only accepted if annotation processing is explicitly requested
public static void main (String[] args){

/*--------------BOOLEAN TYPE DATA:--------------*/

//CAN HAVE ONLY 2 VALUES, true OR false 
//size of BOOLEAN is VIRTUAL MACHINE dependent
//Any JAVA OBJECT is aligned to an 8 bytes GRANULARITY
//A Boolean OBJECT has 8 BYTE (for 32 BIT OS) OR 16 BYTE (for 64 BIT OS) of HEADER, plus 1 BYTE of PAYLOAD, for a total of 9 BYTE OR 17 BYTE of INFORMATION 

boolean b1=true;
boolean b2=false;
System.out.println(b1 + " " + b2);

//to execute CONDITIONAL CONTROL:
if(b1) System.out.println("This line will execute");
if(b2) System.out.println("This line will not execute");

//outcome of RELATIONAL OPERATOR is a BOOLEAN VALUE:
System.out.println("10 > 9 is " + (10>9)); //true
System.out.println("10 < 9 is " + (10<9)); //false
System.out.println("10 == 9 is " + (10==9)); //false
System.out.println("10 != 9 is " + (10!=9)); //true


/*--------------CHARACTER TYPE DATA:--------------*/

// SIZE : 2 BYTE (16 BIT)	(unsigned)	RANGE : 0 to 65,535
// ASCII characters range : 0 to 127


char ch1 = 'A';
char ch2 = 89; // CHARACTER UNICODE VALUE IN DECIMAL
char ch3 = 0141; // CHARACTER UNICODE VALUE IN OCTAL
char ch4 = 0xabcd; // CHARACTER UNICODE VALUE IN HEXADECIMAL
System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4); 



// CHARACTER variables behave like INTEGERs :
char ch5 = 0;
while(ch5<128){				// printing all ASCII characters
	System.out.print(ch5);
	if(ch5 % 10 == 0){		// printing as group of 10 characters  
		System.out.print("\n");
	}
	ch5++;
}
System.out.println('\n');


// MECHANISM FOR DIRECTLY ENTERING THE VALUE OF A CHARACTER IN OCTAL '\ddd'  [HERE (ddd) ARE OCTAL CHARACTERS]
// MECHANISM FOR DIRECTLY ENTERING THE VALUE OF A CHARACTER IN HEXADECIMAL '\\uxxxx'  [HERE (xxxx) ARE HEXADECIMAL CHARACTERS]

char ch6 = '\141';	// CHARACTER UNICODE VALUE IN OCTAL
char ch7 = '\uA432'; // CHARACTER UNICODE VALUE IN HEXADECIMAL
System.out.println(ch6 + " " + ch7);




/*--------------INTEGER TYPE DATA:--------------*/

// BYTE 	SIZE : 1 BYTE (8 BIT) 	RANGE : -128 TO +127
// FILE SUPPORTED FORM OR NETWORK SUPPORTED FORM IS BYTE

byte a1 = 10;
byte a2 = -100;
// byte a3 = 128;	Out of range
System.out.println(a1 + " " + a2);


// SHORT 	SIZE : 2 BYTE (16 BIT) 	 RANGE : -32,768 TO +32,767
// MOST RARELY USED DATATYPE IN JAVA

short s1 = 32000; 
short s2 = -32500;
//short s3 = 320768;	Out of range   
System.out.println(s1 + " " + s2);


// INTEGER 	 SIZE : 4 BYTE (32 BIT) 	RANGE : -2,147,483,648 TO +2,147,483,647 
// MOST COMMONLY USED DATATYPE IN JAVA

int i1 = 21_47_48_36_47;
int i2 = -21_47_48_36_48;
//int i3 = 21_47_48_36_49: 	Out of range
System.out.println(i1 + " " + i2);


// LONG 	SIZE : 8BYTE (64 BIT) 	RANGE : -9,223,372,036,854,775,808 TO +9,223,372,036,854,775,807
// USED TO STORE VERY LARGE NUMBER

long l1 = 92_23_37_20_36_85_47_75_807L;
long l2 = -92_23_37_20_36_85_47_75_808L;
//long l3 = 92_23_37_20_36_85_47_75_808L; 	Out of range
System.out.println(l1 + " " + l2);


/*============== INTEGRAL LITERALS ==============*/

// BY DEFAULT ALL INTEGRAL VALUES ARE DECIMAL
// FOR BINARY VALUE, PRIFIX BY 0B OR 0b
// FOR OCTAL VALUE, PRIFIX BY 0 (ZERO)
// FOR HEXADECIMAL VALUE, PRIFIX BY 0X OR 0x

int p1 = 10; 	//DECIMAL
int p2 = 0b10; 	//BINARY
int p3 = 010; 	//OCTAL
int p4 = 0x10; 	//HEXADECIMAL
System.out.println(p1 + " " + p2 + " " + p3 + " " + p4);

//int p5 = 0768; NOT VALID COZ SYMBOL 8 IS NOT ALLOWED IN OCTAL
int p6 = 0xFace; // VALID COZ HEXADECIMAL IS NOT CASE SENSITIVE 
int p7 = 0777; 	// OCTAL NUMBER 
long p8 = 10L;	//  LONG DECIMAL
//int p9 = 10L; NOT VALID COZ LONG CANNOT BE ASSIGNED IN INTEGER






/*--------------REAL TYPE DATA:--------------*/

// FLOAT 	SIZE : 4 BYTE (32 BIT) 		RANGE : 1.4e–045 to 3.4e+038
//TO SPECIFY A FLOAT LITERAL, MUST APPEND AN F OR f TO THE CONSTANT

float f1 = 3.4e+38f;
float f2 = -1.4e-45f;
//float f3 = 3.4e+39f; 		Out of range
System.out.println(f1 + " " + f2);


//DOUBLE 	SIZE : 8 BYTE (64 BIT) 		RANGE : -4.9e-324d to 1.7e+308
//FLOATING-POINT LITERALS IN JAVA DEFAULT TO DOUBLE PRECISION
//CAN ALSO EXPLICITLY SPECIFY A DOUBLE LITERAL BY APPENDING D OR d (DOING SO IS REDUNDANT)
//ALL TRANSCENDENTAL MATH FUNCTIONS, SUCHAS sin( ), cos( ), and sqrt( ), RETURN DOUBLE VALUES

double d1 = 1.7e+308;
double d2 = -4.9e-324d;
//double d3 = 1.8e+308d;		Out of range
System.out.println(d1 + " " + d2);


//INTEGRAL VALUES CAN DIRECTLY ASSIGNED TO FLOATING-POINT VARIABLE

double d4 = 10; // VALID COZ INTEGER DECIMAL
double d5 = 075; // VALID COZ INTEGER OCTAL
double d6 = 0xaCd; // VALID COZ INTEGER HEXADECIMAL
double d7 = 0785.0; // VALID COZ FLOATING-POINT DECIMAL
//double d8 = 0785; NOT VALID COZ INVALID OCTAL
//double d9 = 0xaCd.0; NOT VALID COZ FLOATING-POINT HEXADECIMAL 
 


}
}