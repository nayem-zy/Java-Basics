public class CreateObj implements Cloneable, Serializable {
	
	
	// 5 CORE WAYS TO CREATE OBJECTS :
	
		// 1. USING new KEYWORD 								--> CONSTRUCTOR CALL INVOLVED
		// 2. USING Class class's newInstance() METHOD 			--> CONSTRUCTOR CALL INVOLVED
		// 3. USING Constructor class's newInstance() METHOD 	--> CONSTRUCTOR CALL INVOLVED		
		// 4. USING clone() METHOD 								--> CONSTRUCTOR CALL NOT INVOLVED
		// 5. USING DESERIALIZATION 							--> CONSTRUCTOR CALL NOT INVOLVED
		
		
	
	
	public static void main (String[] args) throws Exception{
		
		
		
		// 1. USING new KEYWORD :
		CreateObj obj1 = new CreateObj();
		
		
		
		// 2. USING Class class's newInstance() METHOD 
		CreateObj obj2 = CreateObj.class.newInstance(); // warning: [deprecation] newInstance() in Class has been deprecated
		CreateObj obj3 = (CreateObj)Class.forName("abc.CreateObj").newInstance();
		
		
		
		// 3. USING Constructor class's newInstance() METHOD :
		Constructor<CreateObj> cons = CreateObj.class.getConstructor();
		CreateObj obj4 = cons.newInstance();
		
		
		
		// 4. USING clone() METHOD :
		CreateObj obj5 = (CreateObj) obj1.clone();
		
		
		
		// 5. USING DESERIALIZATION :
		ObjectInputSteram in = new ObjectInputStream (new FileInputStream("data.obj"));
		CreateObj obj6 = (CreateObj) in.readObject();
		
		ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("data.obj"));
		out.writeObject(obj1);
		
		
	
	}
}