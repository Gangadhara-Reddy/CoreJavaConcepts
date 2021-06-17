package various_cases_this_super_5;

public class Difference_this_super extends Diff_Parent{
	
	String s = "Child Class instance variable";
	public static void main(String[] args) {
		Difference_this_super child = new Difference_this_super();
		child.m1();

	}
	
	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}

}
