
public class Prime_Number {

	public static void main(String[] args) {
		int n = 17;
		boolean flag =true;
		for(int i =2 ;i<n-1;i++) {
			int r = n%i;
			if(r==0) {
				flag = false;
				break;
			}
		}
		if(flag = true) {
			System.out.println(n + " is a prime number");
		}

	}

}
