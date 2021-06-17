import java.util.HashSet;
import java.util.Set;

public class Duplicates_In_String {

	public static void main(String[] args) {
		String s1 = "REALPAGE";
		char ch[] = s1.toCharArray();
		//int count = 0; - we should wroite this inside first for loop-because for ecery chaacter it should be 0
		Set<Character> values = new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			int count = 0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count =count+1;
				}
				
			}
			//mistake: Set<Character> values = new HashSet<Character>();-we should not write here because every time it will creare
			//new hashset
			if(values.add(ch[i])) {
				System.out.println(ch[i]+" repeated for "+count+" times");
			}
			
		}

	}

}
