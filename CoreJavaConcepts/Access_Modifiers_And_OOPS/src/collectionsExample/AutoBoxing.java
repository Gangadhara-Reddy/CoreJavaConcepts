package collectionsExample;

public class AutoBoxing {

	public static void main(String[] args) {
		int var = 10;
		Integer obj = new Integer(var); //this is called as "wrapping"---->AutoBoxing
		System.out.println(obj);
		
		//Integer i = obj;
		int i = obj; //This is called as "Unwrapping"---------->AutoUnboxing/Unboxing
		System.out.println(i);
	}

}
