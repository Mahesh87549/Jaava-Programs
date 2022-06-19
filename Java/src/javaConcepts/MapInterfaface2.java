/*Program on Map Interface2 created by B MAHESH on 24.05.2022
 
 */

package javaConcepts;

import java.util.HashMap;
import java.util.Map;

public final class MapInterfaface2 {

	// Creating main method
	public final static void main(String[] args) {

		// Creating object for HashMap class
		Map<Object, Object> hashMap = new HashMap<Object, Object>();

		// Inserting Key and Values into HashMap
		hashMap.put(101, "Mahesh");
		hashMap.put(102, "Mahesh2");
		hashMap.put(103, "Mahesh3");

		// Keys cannot be duplicated but value can be duplicated
		hashMap.put(103, "Mahesh4");

		// Printing all the object present in HashMap while printing Insertion order
		// must be preserved
		System.out.println(hashMap);

		// To retrieve one particular entry based on key
		Object result = hashMap.get(101);

		// To print the value which is retrieved
		System.out.println(result);

		//Creating one more object for HashMap
		Map<Object, Object> hashMap2=new HashMap<Object, Object>();
		
		//Inserting values into hashMap2
		hashMap2.put(105,"RAMESH");
		hashMap2.putAll(hashMap);
		
		//Printing entries in hashMap2
		System.out.println(hashMap2);
		
		//Remove one entry from hashMap2
		hashMap2.remove(105);
		
		//Display new hashMap2
		System.out.println(hashMap2);
		
		
		

	}

}
