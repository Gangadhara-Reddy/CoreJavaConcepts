
public class ReverseString {

	public static void main(String[] args) {
		String s1 = "naman";
		char ch[] = s1.toCharArray();
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			char s3 = ch[i];
			s2 = s2+s3;
			
		}
		System.out.println(s2);
	}

}
