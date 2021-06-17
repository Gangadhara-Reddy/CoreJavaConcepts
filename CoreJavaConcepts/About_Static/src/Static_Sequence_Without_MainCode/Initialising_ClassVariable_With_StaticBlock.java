package Static_Sequence_Without_MainCode;

public class Initialising_ClassVariable_With_StaticBlock {
	static int i;
	static {
		i=10;
	}
	public static void printingI() {
		int j;
		i=12;
		System.out.println(i);
	}
	public static void main(String[] args) {
		printingI();
		//System.out.println(j);

	}

}
