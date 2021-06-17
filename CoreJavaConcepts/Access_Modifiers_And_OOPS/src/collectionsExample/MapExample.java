package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("firstName", "Raman");
		map.put("LastName", "Arora");
		map.put("sub", "Selenium");
		map.put("location", "India");
		map.put("firstName", "Rahul");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("firstName"));
		//System.out.println(map.get("firstname"));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println("Key--->"+key+" Value is -->"+map.get(key));
		}
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		List<String> ListOfEmails = new ArrayList<String>();
		ListOfEmails.add("trainer@way2automation.com");
		ListOfEmails.add("seleneiumcoaching@gmail.com");
		ListOfEmails.add("info@way2automation.com");
		
		map1.put("email", ListOfEmails);
		
		Map<String,Map<String,String>> map2 = new HashMap<String,Map<String,String>>();
		
		System.out.println(map1);
		System.out.println(map2);
	}

}
