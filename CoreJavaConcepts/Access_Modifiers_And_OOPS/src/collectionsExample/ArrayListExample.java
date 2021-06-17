package collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//adding 
		list.add(10);
		list.add("Raman");  //added string
		list.add(10.25); //adding double value
		list.add('c'); //adding character datatype value
		list.add(true); //we can add boolean value
		list.add(null); //we can add null value
		list.add("Raman"); //we cna add a duip;ciate value as well
		
		System.out.println(list.get(0));
		//Object var = list.get(0);
		
		int var = (Integer)list.get(0);
		System.out.println(20+var);
		
		
		
		
		/*System.out.println(list);
		System.out.println(list.size());
		
		//How to fetch the values from a List
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		///System.out.println(list.get(7));
		
		//remove
		list.remove(5);
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object var:list) {
			System.out.println(var);
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}*/
	}

}
