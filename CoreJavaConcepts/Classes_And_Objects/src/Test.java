
public class Test
{ //start of the class body

	//instance- copy/clone 
	public static void main(String[] args) {
		/*//Test t = new Test();//creating object of this class
		
		//JDK-->Java compilor + JRE(JVM +Lib Files)
		//once u download JDK,it comes with JDK and JRE
		for(int i=0;;i++)
		{
			new Test(); // this is also an object of this class
			System.out.println(i);
		}*/
		Test t = new Test();
		//t is reference variable
		System.out.println(t);
		//t=null; // now the memory allocate dot this object is nullified so this
		//is also eligible for garbage colleciton
		
		Test t1 = t;// u can write like thois..u can not write like Test t1=12345;
		//Home h = new Test();
		//u can not write like this for now.refernce variable should be refer to the object of that class
		//only..inheroitance and plymorphism we will see how we cna refer
		
	}
	
}//end of the class body
