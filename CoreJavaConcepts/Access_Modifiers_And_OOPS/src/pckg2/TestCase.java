package pckg2;

import pckg1.ClassA;

public class TestCase {

	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		obj1.add();
		
		//ClassB obj2 = new ClassB();
		//obj2.show();  //can't access hsow mehotd of ClassB as ClassB is a default Class in different package

	}

}
