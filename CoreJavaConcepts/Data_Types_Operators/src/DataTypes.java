
public class DataTypes {

	public static void main(String[] args) {
		//below are primitive data types..defined by program langage
		int i= 1234567890;//declaration and initialization
		float f=1.234343434343434343434343434f;
		long l=12345678901234l;  //long integer
		double d= 1.23434343434343434343;  //long float and no need d or f
		boolean b=false;
		char c='a';
		String s="This is a java tutorial";  //string is also called class in java
		
		DataTypes dt;
		//here Datatypes(class name) is the data type of dt variable(refrence variable)
		
		String xyz = "asdfefdff";
		int batmanBegins;
		int theDarkKnight;
		int theDarkKnightRises;
		
		String abc = new String();
		abc = "Hello";
		
		String abc1 = "Hello";
		
		String s1 = "Way  ";
		String s2 = "2";
		String s3 = "Automation";
		
		String s4 = s1  +s2+  "hihello"  +s3;
		System.out.println(s4);
		
		//String +string --?concaternated string
		System.out.println(s1+s2+s3);
		System.out.println("Way"+"2"+"Automation");
		int num1 = 10;
		int num2 = 5;
		System.out.println(num1+num2+"After");
		System.out.println("Before"+num1+num2+"After");
		System.out.println("Before"+(num1+num2)+"After");//badmash rule
		
		
		/*
		 * 12+15 //operands and + is operator
		 * unary operator //it accepts single operand
		 * binary operator--?it acdpets 2 operands
		 * ternary operator-->3 operands
		 */
		
	System.out.println(!true);  //it prints false-logical operator
	System.out.println(34==78); //returns boolean
	System.out.println(78==78);
	System.out.println(34<=78);
	// System.out.println(34 && 78); it throws error
	System.out.println(true && false);
	System.out.println(true && true);
	System.out.println((123<=124) && (10==10));
	System.out.println((123<=124) || (10==10));
	
	
	
	
		
	}

}
