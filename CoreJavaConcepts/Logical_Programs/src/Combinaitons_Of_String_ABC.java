
public class Combinaitons_Of_String_ABC {

	public static void main(String[] args) {
		String str = "ABC";
		int n = str.length();
		permute(str,0,n-1);

	}

	private static void permute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=l;i<r;i++) {
				str = swap(str,l,i);
				permute(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int l, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
