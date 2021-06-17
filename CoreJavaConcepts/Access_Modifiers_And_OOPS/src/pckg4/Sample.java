package pckg4;

import pckg3.Test;

public class Sample extends Test{

	public static void main(String[] args) {
	
		Sample obj = new Sample();
		System.out.println(obj.publicVariable);
		//System.out.println(obj.privateVariable);  //not accessable outside class and so obviously outside package also 
		System.out.println(obj.protectedVariable); //can't access outside package but able to access through inheritance
		//System.out.println(obj.defaultVariable); //can't access outside package

	}

}
