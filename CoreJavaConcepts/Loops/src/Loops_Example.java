
public class Loops_Example {

	public static void main(String[] args) {
		int i=1;
		/*do {
			System.out.println("Number is : "+i);
			i++; // increamental operator
		}while(i<=10);
		
		while(i<=10) {
			System.out.println("Number is : "+i);
			i++;
		}

		for(int x=1;x<=10;x++) {
			System.out.println("Value of x is "+x);
		}
		
		
		for(int x=10;x>=1;x--) {
			System.out.println("Value of x is "+x);
		}*/
		
		System.out.println("*********************even numbers******************");
		
		for(int x=2;x<20;x=x+2) {
			System.out.println("Even numbers are "+ x);
		}
		
		System.out.println("*******************print table of 2********");
		
		for(int x=1;x<=10;x++) {
			System.out.println("table of 2 is: 2*"+x+" = "+2*x);
		}
		
		System.out.println("********************************print tables of 1 to 10*******");
		for(int table=1;table<=10;table++) {
			System.out.println("table of ------"+table);
			for(int x=1;x<=10;x++) {
				System.out.println(table+"*"+x+" = "+ 2*x);
				
			}
			if(table==6) {
				break;
			}
		}
		
		//pre and post increamental operators:
		System.out.println("Pre and post increamental operators");
		int p=1;
		System.out.println(p++);//printed first and then increamented-->post increamented oeprator
		System.out.println(p);
		int q=5;
		System.out.println(++q);
		System.out.println(q);
	}

}
