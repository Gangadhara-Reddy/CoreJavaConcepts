
public class LearningMethods {
	public static int a=30;
	public static int b=20;
	
	
	public static void print() {
		System.out.println("Learning Funcitons/Methods");
	}
	
	public static void addNumbers() {
		int c=a+b;
		System.out.println("Addition of two numbers is:"+ c);
		
	}
	
	/*public static void addNumbers(int r,int s) {  //method overloading(same funciton with different arguments
		int add =r+s;
		System.out.println("Addition of two numbers is:"+ add);
		
	}*/
	
	//another of of returning
	
	public static int addNumbers(int r,int s) {  //method overloading(same funciton with different arguments
		int add =r+s;
		return add;
		
	}
	
	
	
	public static void main(String[] args) {
		print();
		addNumbers();
		//addNumebrs(30,40);
		int result = addNumbers(30,40);
		System.out.println(result);
		


	}

}
