
public class null_and_nullpointexception_loopholes {

	public static void main(String[] args) {
		//1st loophole---null is a reserved literal 
		//2nd---we can use null for any object type
		String s = null;
		Object o = null;
		Customer c = null; //we cna use for class/interface/eneum for any object types
		//In java, every array is an object type.
		//so for array type reference variable also,happily we can use null
		//int[] x = new int[3];
		int[] y = null;
		
		char r = 'a';
		char a = null; //u get error
		

	}

}
