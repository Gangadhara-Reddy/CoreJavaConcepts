package interfaceexamples;

public class Child1 extends ParentClass1 implements parent1,Parent2 {

	/*@Override
	public void show() {
		System.out.println("child show();");
		
	}*/
	
	public static void main(String[] args) {
		Parent2 c = new Child1();
		c.show();
	}

}
