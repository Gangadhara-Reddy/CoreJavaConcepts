package Collecitons_Programs;

import java.util.HashMap;
import java.util.Map;

public class Try_Duplicates_In_HashMap {

	public static void main(String[] args) {
		Map<String,String> values = new HashMap<>();
		values.put("name", "ganga");
		values.put("name", "ganga");
		values.put("name", "reddy");
		values.put("name", "reddy");
		values.put("age", "thirty");
		values.put("villiage", "polur");
		values.put("city", "kurnool");
		values.put("state", "AP");
		values.put("1stnull",null);
		values.put("2ndnull",null);
		values.put(null,null);
		values.put(null,null);
		System.out.println(values);
		//SO HASHMAP TAKES only 1 NULL KEY AND MANY NULL VALUES 
		//HASHMAP CANT HAVE DUPLICATE KEYS BUT CAN HAVE DUPLICATE VALUES FOR DIFFERENT KEY
		
		iterator ite = new iterator();
		

	}

}
