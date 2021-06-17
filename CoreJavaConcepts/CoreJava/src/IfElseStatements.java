
public class IfElseStatements {

	public static void main(String[] args) {
		//if(true)
		//if(9>7)
		int num = (int)(Math.random()*20);
		System.out.println(num);
		/*if(num>10) {
			System.out.println("Number is greater than 10");
				
		}*/
		
		if(num>10) {
			System.out.println(num+"Number is greater than 10");
		}
		else if(num<10 && num>5) {
			System.out.println(num+" between 10 and 5");
		}
		else {
			System.out.println(num+" is less than 10");
		}
	}

}
