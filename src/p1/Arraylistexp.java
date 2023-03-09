package p1;

import java.util.ArrayList;
import java.util.HashMap;

public class Arraylistexp {
	public static void main(String[] args) {
	
		ArrayList<String> myList=new ArrayList<String> ();
		myList.add("abc");
		myList.add("xyz");
		myList.add("efg");
		
	//Hash map
		HashMap<Integer,String> myMap=new HashMap<Integer, String>();
		myMap.put(1, "one");
		myMap.put(2, "two");
		System.out.print(myMap);
		System.out.println(myMap.get(1));
		
	}
}
