/* Program to illustrate Array List concept
 * ArrayList implements all the methods in the List interface.If we have to preserve the insertion order
 * and duplicate values to be stored then we have to go with List interface.
 *Created by B MAHESH on 14.01.2022
 */
 

package javaConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] mahesh) {
		//Different ways of declaring ArrayList objects
		//ArrayList<int> al=new ArrayList<int>();
		//List al=new ArrayList();
		ArrayList al=new ArrayList();
		//Adding elements in the ArrayList
		al.add("Mahesh");
		al.add(100);
		al.add('a');
		al.add(10.2f);
		System.out.println(al);
		// Insertion order is preserved:[Mahesh, 100, a, 10.2]
		//To find the number of elements present in the array list we use size() method
		System.out.println(al.size());
		//Removing the element from the ArrayList by index position
		al.remove(0);
		System.out.println(al);
		al.add(0, "mahesh");
		System.out.println(al);
		//If we get the element out of index, then we will get exception as index out of bound exception
		System.out.println(al.get(3));
		//Replace the element
		al.set(0, "MAHESH");
		System.out.println(al);
		//Searching operation can be done with the help of contains
		System.out.println(al.contains(mahesh));
		//Checking whether ArrayList is Empty or not
		System.out.println(al.isEmpty());
		//Reading the data from the ArrayList: using for Loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("************"); 
		//Reading the data from the ArrayList:using for each loop
		for(Object e:al) {
			System.out.println(e);
		}
		System.out.println("**********");
		//Reading the data from the ArrayList:using Iterator
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
			
	
	
	
	
	

	
	

}
