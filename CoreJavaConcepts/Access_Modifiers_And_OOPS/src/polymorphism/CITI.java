package polymorphism;

public class CITI extends RBI{
	public static void main(String[] args) {
		CITI obj = new CITI();
		System.out.println(obj.getHomeLoanROI());
		RBI obj2 = new CITI();
		//CITI obj2 = new RBI(); // u canot ahve reference to the parent's class object
	}
	
	public double getHomeLoanROI() {
		return 10.5;
	}
	
	public Integer show() {
		return 10;
	}
	
}
