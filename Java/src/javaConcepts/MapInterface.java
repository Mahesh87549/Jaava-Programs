/* Program on Map Interface created by B MAHESH on 22.01.2021
 * Map is a Independent interface in Java Collection framework. Map Interface is implemented by HashMap
 * Class.In HashMap elements are stored as Key&Value pairs. Keys cannot be Duplicated but
 * Values can be Duplicated. Null is acceptable as Key for only first time. Each key&Value
 * pair is called as One Entry. Insertion order is not preserved in case of HashMap elements.
 * Underlying implementing data structure is HashTable.
  */


package javaConcepts;

import java.util.HashMap;

public class MapInterface {
	//  Creating the main Method
	public static void main(String[] args) {
		//Creating object for HashMap
		//Map m=new HashMap();
		//HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer, String>();
		//Adding elements to the HashMap
		m.put(101, "Mahesh");
		m.put(102, "Mahesh2");
		m.put(103, "Mahesh3");
		//Displaying all values in HashMap
		System.out.println(m);//{101=Mahesh, 102=Mahesh2, 103=Mahesh3}
		//Keys cannot be Duplicated
		m.put(103,  "Snigdha");
		System.out.println(m);//{101=Mahesh, 102=Mahesh2, 103=Snigdha}
		//Value can be Duplicated
		m.put(104, "Snidha");
		System.out.println(m);//{101=Mahesh, 102=Mahesh2, 103=Snigdha, 104=Snidha}
		//Get is a method to get the value by passing key
		System.out.println(m.get(102));
		//Removing one entry from the List
		m.remove(101);
		System.out.println(m);//{102=Mahesh2, 103=Snigdha, 104=Snidha}
		//Verifying the existence of Element
		System.out.println(m.containsKey(103));//true
		System.out.println(m.isEmpty());//false
		//Retriving all the keys
		System.out.println(m.keySet());//[102, 103, 104]
		//Reading individual values using for each loop
		for(int i: m.keySet()) {
			System.out.println(i);
		}
		//Retriving all the values
		System.out.println(m.values());//[Mahesh2, Snigdha, Snidha]
		//Getting all the entries as Set
		System.out.println(m.entrySet());//[102=Mahesh2, 103=Snigdha, 104=Snidha]
		
	}

}
