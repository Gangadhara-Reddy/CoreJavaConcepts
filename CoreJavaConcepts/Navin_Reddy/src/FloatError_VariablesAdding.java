
public class FloatError_VariablesAdding {

	public static void main(String[] args) {
		//float num1 = 3.3; //can't convert from double to float error--because bydefault java treats as double
		//float num2 = 6.3; //can't convert from double to float error--because bydefault java treats as double
		
		double num3 = 3.3;
		double num4 = 6.3;
		
		//but double takes 8 bytes memory by keeping 0's(zeros) at the end
		//so lets take as float--to make float we need to give as f at end so that we cna save memory.
		float num5 = 3.3f;
		float num6 = 6.3f;
		System.out.println(num5+num6);
		////////////practicing ASCII values and type casting
		char c1 = 'A';
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println((char)65);
		System.out.println((char)265);
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		/*
		 * int-4 bytes||float-4 bytes||double -8 bytes||char-2 bytes||
		 * int::---short int-2 byes||long int-8 bytes||byte-1 byte
		 */
	}

}
