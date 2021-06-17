
public class RandomNumbers {

	public static void main(String[] args) {
		
		//type cast-->
		
		double num = Math.random();
		int num1 = (int)Math.random()*100;
		int num2 = (int)(Math.random()*100);
		double num3 = (int)(Math.random()*100);
		System.out.println(num);
		System.out.println(num1); // less than 99.9
		//61.93381993419914
		System.out.println(num2); //69 as converted into int
		System.out.println(num3); //69.0 as still double(0 to 99)
	}

}
