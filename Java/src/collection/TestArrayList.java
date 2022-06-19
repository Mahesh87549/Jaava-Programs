/* Program on ArrayList
 * Created by B MAHESH on 29.05.2022
 */
package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
		/*
		//Creating object of ArrayList
		List list=new ArrayList();
		
		//Adding objects to ArrayList
		list.add("MAHESH");
		list.add("SOFTWARE DEVELOPER");
		list.add(6.0);
		list.add(9.30);
		
		//Traversing into list and print them
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		ArrayList<String> al=new ArrayList<String>();//Creating Object for ArrayList
		al.add("MAHESH");//Adding elements to ArrayList
		al.add("MANOJ");
		al.add("CHINOODU");
		
		
		/*
		//Printing Array list object
		//System.out.println(al);
		  */
		 
		
		/*
		//Iterating ArrayList Object
		Iterator it=al.iterator();//Getting the iterator
		
		while(it.hasNext()) {// Checks if iterator has the elements
			System.out.println(it.next());//Printing all the elements and move to Next
		}
		*/
		
		
		/*
		//Iterating elements using for each loop
		Iterator it=al.iterator();//Getting the iterator
		
	for(Object object:al) {
		System.out.println(object);
	}
*/
		//Sorting objects present in ArrayList
		/*
		Collections.sort(al);
		for(Object object:al) {
			System.out.println(object);//Printing objects in sorted format
		}
		*/
		
		//We see different ways to add and remove element
		al.add("SURESH");//adding element at the end of the ArrayList object
		al.add(4,"SURESH1");//adding an element at specified location
		al.remove(4);//removing an element by index position
		al.remove("MAHESH");//removing an element by object itself
		System.out.println(al);
		
		
		
		
		
		
		
		
		
 		
		
		
			
				}
	

}
