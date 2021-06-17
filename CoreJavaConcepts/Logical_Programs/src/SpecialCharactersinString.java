
public class SpecialCharactersinString {

	public static void main(String[] args) {
		String s1 = "123ganga!@#$";
		char ch[] = s1.toCharArray();
		/*String s2 = String.valueOf(ch);
		System.out.println(s2);*/ // converting chararray to string vback using String.value( 
		//we can convert from char to string or 
		//character array to string using String.value(
		//int i = Integer.parseInt("s");//we should not use like this
		/*int i = Integer.parseInt("3");//we can use like this
				System.out.println(i);
		*/		
		String s2 = "";
		int sum = 0;
		for(int i =0;i<s1.length();i++) {
			
			if(Character.isDigit(ch[i])) {
				//s2 = s2+(char)ch[i]);
				s2 = s2+ch[i];
				String s3 = String.valueOf(ch[i]);
				
				sum = sum + Integer.valueOf(s3);
			}
		}
		System.out.println(s2);
		System.out.println(sum);
	}

}
