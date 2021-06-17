
public class ComparisionTest {

	public static void main(String[] args) {
		String nam1 = "Way2Automaiton";
		String nam2 = "Way2Automaiton";
		int x = 100;
		int y = 100;
		
		Singleton_Test s1 = Singleton_Test.getinstance();
		Singleton_Test s2 = Singleton_Test.getinstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		
		/*String name1 = new String("Raman");
		String name2 = new String("Raman");
		System.out.println(name1==name2);*/
		//System.out.println(name1.equals(name2));
		
		/*System.out.println(nam1==nam2);
		System.out.println(nam1.equals(nam2));
		
		System.out.println(x==y);*/
		
	}

}
