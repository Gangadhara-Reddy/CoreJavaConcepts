
public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(null); //u get compiler time error as 2 mthods matching in overloaded
		//mehtods char array and string mehotds
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//you can declare as below to resolve that
		String s= null;
		System.out.println(s);
	
		System.out.println((String)null);
		
		char[] ab = new char['a'];
		char[] ch= null;
		//System.out.println(ch);
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//trying to do d=some operation null reference avriable
		String u = null;
		//System.out.println(u.length()); //u get runtime error nullpoiinterexception
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//try null with "=" operator
		String q = new String("durga");
		System.out.println(q==null);
		
		String t = null;
		System.out.println(t==null);
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//try null with ".equals" mehtof
		String m = new String("durga");
		System.out.println(m.equals(null));
		
		String n = null;
		//System.out.println(n.equals(null)); u get run time error--nullpointexception
		
		//System.out.println(null.equals(null)); - u get comipiler error
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		//difference berween null and NULL ans ""
		
		
		
	}

}
