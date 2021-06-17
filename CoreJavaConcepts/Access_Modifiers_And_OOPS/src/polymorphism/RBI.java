package polymorphism;

public class RBI {
	
	public double getHomeLoanROI() {
		return 8.5;
	}
	//RBI obj2 = new CITI();
	public double gerCarLaonROI() {
		return 10.5;
	}
	
	public RBI getObject() {
		RBI obj = new RBI();
		return obj;
	}
	
	public Number show() {
		return 10;
	}

}
