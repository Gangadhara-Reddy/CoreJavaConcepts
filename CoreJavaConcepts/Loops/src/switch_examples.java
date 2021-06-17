
public class switch_examples {

	public static void main(String[] args) {
		int month = 11;
		switch(month) {
		
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			//break;
		
		}
	}

}

//if i have break for all cases,output is Nov
//if i remove all breaks and run,output will be Nov Dec
//break means to break and come out of loop/switch
//if i have break in Nov also,it will give output as Nov only.
