package wrapperClasses;

import java.util.Collections;

public class wrapping {

	public static void main(String[] args) {
		int i =5;
		Integer iObj = new Integer(i);///wrapping--converting int value to object--or storing int value in object.
		Integer m=i;//AutoBoxing --from java1.5--we can do in this way as well direclty
		
		int j = iObj.intValue();//unwrapping---taking value from object--or-- converting object into int primitive back
		int n = j;//AutoUnboxing --from java1.5--we can do in this way as well direclty
		
		double k=5.5;
		Double d = new Double(k);
		double primitivedouble = d.doubleValue();
		System.out.println("primitive double k :"+k);
		System.out.println("Double object double d :"+d);
		System.out.println("primitive double from object primitivedouble :"+primitivedouble);
		
		//Collections.sort(list, c);
		int p=10;
		double q = (double)p;
		
		
	}

}
