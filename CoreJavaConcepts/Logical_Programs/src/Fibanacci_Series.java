
public class Fibanacci_Series {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int k;
		System.out.print(a+ " "+b+ " ");
		do{
			k = a +b;
			System.out.print(k+" ");
			a=b;
			b=k;
			
		}while(k<=50);
		

	}

}
