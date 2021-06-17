
public class LearningMethods {
	int i ;//declare and intilaze
	int j;
	//display
	public void show()
	{
		int a;
		int b;
		String c;
		
	}
	//return type -->is the data type of the value returned by the mehtod
	public int display(int k,String a,char c,float f,boolean b) //declare a mehtod and define the mehtod
	{
		//String x = "Hello";
		//return x; //last statement of thre mehtod
		int j = 100;
		System.out.println("Inside display mehtod");
		return 10;
	}
	public static void main(String[] args) {
		/*LearningMethods l = new LearningMethods();
		//l.display(k, a, c, f, b)
		System.out.println("Hi How are you");
		*/
		/*LearningMethods learn = new LearningMethods();
		learn.show();
		
		LearningMethods learn1 = new LearningMethods();
		learn1.show();*/
		/*
		Home h = new Home(); // h object --> i =10
		h.i++; // Object 1--> i =11
		
		Home h1 = new Home();  //h1 object -->i=10
		h1.i++; //object2-->i=11
		
		Home h2 = new Home();//h3--i=10
		System.out.println(h2.i);//10
		*/
		
		/*
		 * parameters to defining when u call called args
		 */
		Calculator calci = new Calculator();
		int i = calci.getSum(10, 4);
		System.out.println("The Sum is :"+i);
		System.out.println(calci.getMul(10, 4));
		System.out.println(calci.getSub(10, 4));
		System.out.println(calci.getDiv(10, 4));
	}

}

