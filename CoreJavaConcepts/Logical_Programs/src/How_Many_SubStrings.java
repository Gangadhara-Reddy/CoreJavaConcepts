
public class How_Many_SubStrings {

	public static void main(String[] args) {
		String s1 = "rajaraja";
		String s2 = "raja";
		int l = s1.length();
		int l2 = s2.length();
		int count = 0;
//		for(int i=0;i<l;i++) {  //you will get index out of bound at last to 5th charactewr
//		for(int i=0;i<=l-l2;i++) {
//			String s3 =s1.substring(i);
//			if(s3.contains(s2)) {
//				count = count+1;
//			}
//		}
		
		//below code without using contains
		for(int i=0;i<=l-l2;i++) {
			String s3 =s1.substring(i,l2+i);
			if(s3.equals(s2)) {
				count = count+1;
			}
		}
		System.out.println(count);

	}

}
