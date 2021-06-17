
public class TypeCasting_Primitives {

	public static void main(String[] args) {
		int i =5;
		double d = i;
		//int i2 = d;//Type mismatch: cannot convert from double to int
		int i2 = (int) d;

	}

}
