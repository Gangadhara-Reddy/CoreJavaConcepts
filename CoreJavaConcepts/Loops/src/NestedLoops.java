
public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * while - 3 times
		 * for-4 times
		 * do while- 5 times
		 * Total how many times loop will gonna run?-3*4*5=60 times
		 * 60 times is the right answer
		 */
		
		int i=0;
		int counter = 0;
		//int k=0; 
		while(i<3) {//to run 3 times
			for(int j=0;j<4;j++) {//replace j++ with i++,it will run infinite loop
				int k=0;//if we remove int k=0 above and place it here.why because
				//INNER LOOP SHOULD ALWAYS BE INDEPENDENT OF OUTER LOOP HERE K IS INDEPENDENT
				//AS WE REMOVED FROM LINE 15 INSTEAD OF DECLARING BEFORE WHILE
				//SCOPE OF K IS ONLY IN THE BELOW LOOP
				do {
					System.out.println("i--->"+i+"j---->"+j+"k--->"+k);
					k++;
					counter++;
					
					
				}while(k<5);
			}
		i++;
		}
		//System.out.println(k); //if we uncomment ,it throws error becz scope is not here
		System.out.println("Total count is :"+counter);
	}

}
