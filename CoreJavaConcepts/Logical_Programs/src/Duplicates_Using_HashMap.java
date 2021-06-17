import java.util.HashMap;
import java.util.Map;

public class Duplicates_Using_HashMap {

	public static void main(String[] args) {
		String s1 = "REALPAGE";
		char ch[] = s1.toCharArray();
		//we need to take empty hashmap and try adding them if not there
		Map<Character,Integer> values = new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++) {
			int count =1;
			if(!values.containsKey(ch[i])) {
				values.put(ch[i], count);
			}else{
				int ch2 = values.get(ch[i]);
				ch2 = ch2+1;
				values.put(ch[i], ch2);
			}
		}
		
		System.out.println(values);
	}

}
