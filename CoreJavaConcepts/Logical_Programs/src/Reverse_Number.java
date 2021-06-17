
public class Reverse_Number {

	public static void main(String[] args) {
		int n = 123;
		int s = 0;
		do {
			int r = n%10;
			s = s*10+r;
			n=n/10;
			
		}while(n>0);
		System.out.println(s);

	}

}
