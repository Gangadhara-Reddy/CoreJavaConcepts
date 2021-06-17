package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		//getmethods instead of getdeclaredmehtods
		System.out.println(clazz.getMethods().length);
		//getting construcotr informaiton:
		Constructor[] cons = clazz.getDeclaredConstructors();
		for(Constructor con:cons)	{
			System.out.println(con.getName());
		}
		//getting mehjtod info		
		System.out.println(arrayOfMethods.length);
		
		for(Method s:arrayOfMethods) {
			System.out.println(s.getName()+"---- Return Type is - -"+s.getReturnType());
			Parameter[] params=s.getParameters();
			for(Parameter param:params) {
				System.out.println(param.getName());
			}
		}
	
	}

}
