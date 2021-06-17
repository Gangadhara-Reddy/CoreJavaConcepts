
public class LearningArrays {

	public static void main(String[] args) {
		int emp1=5000;
		int emp2=10000;
		
		
		int emp10=2000;
		/*
		 * Lets sat,i have 100 employees and i want to store salaries of them. I will end up writing code
		 * which is time consuming and not a effeicient way. To overcome with this we have arrays in java 
		 */
		
		
		int[] salary; //salary is a variable and int is a data type...hence salary is an array of integer data type
		salary = new int[10];
		String month[]= {"Jan","Feb","Mar"}; //string array"
		System.out.println(month[0]);  //starts with 0
		System.out.println(month.length);
		
		//to print all elements of array
		for(int i=0;i<month.length;i++) {
			System.out.println(month[i]);
		}
		

	}

}
