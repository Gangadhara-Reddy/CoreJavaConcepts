
public class BreakandContinue {
	
	public void go() {
		System.out.println("First");
		//break;// if we uncomment it shows error as "break" can't be used outside of a loop or switch
		// and Break- is wrong b should be small else it treats as a variable
		
		//continue; //if we uncomment it shows error as "continue" can't be used outside of a loop
	}
	
	public static void main(String[] args) {
		/*BreakandContinue b = new BreakandContinue();
		b.go();*/
		
		for(int i=0;i<10;i++) { //it shows dead code warning msg if we have only break inside loop
			
			//break;
			//if(i>=0)
				//continue;//continues to the next cycle(increament the value of i and focus goes to i++
			//continue is generally used to skip the iterations for specific code
			//if u want to print 0 to 4 and 8 to 10 and fdont priont 5,6,7,,u can do this only with contuinue
			
			if(i>=5 && i<=7)
				continue;
			
			
			//if(i==5)//if i comment u get error at printing i line as unreachable code
				//break;//it breaks the for loop and exit from the for loop
			// break has to be with in if or else or some condition only
			System.out.println(i);
		}
		
	}

}
