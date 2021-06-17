
public class Test {

	public static void main(String[] args) {
		System.out.println("Before try catch block");
		
		try {
			System.out.println("Beginning");
			int divide = 10/0;
			System.out.println(divide);
			System.out.println("Ending");
			
		}catch(Exception e){   //we can also use super class Throwable t
			System.out.println("Error occured");
			System.out.println(e.getMessage());
			e.printStackTrace();  //to know at which line error occured and type of error occured and in which class it occured
			
		}
		System.out.println("After try catch block");
	}

}
