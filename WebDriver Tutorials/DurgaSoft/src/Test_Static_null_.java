
public class Test_Static_null_ {
	static int i;
	static String s;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(s);
		String s1;
		System.out.println(s1); //u get compiler error as JVM will not provide default values
		//for local varibales
		
		
	}

}
