/*Program on Queue child Interface concept
 * Created by B MAHESH on 21.01.2022. Queue interface is the Child Interface of Collection interface
 * Methods in the Queue interface are implemented by Priority Queue and LinkedList. PriorityQueue class
 * object only allows homogenous data.
 
 */

package javaConcepts;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Concept {
	//Main Method
	public static void main(String[] args) {
		//Creating Object for Priority Queue
		PriorityQueue pq=new PriorityQueue();
		pq.add('A');
		pq.add('B');
		pq.add('V');
		pq.offer('V');// Duplicates are allowed
System.out.println(pq);// Inserion order is Preserved [A, B, V, V]
//Get the Head Element from Queue
System.out.println(pq.element());//Returns the Header Element 'A', if Queue is empty it return Exception
System.out.println(pq.peek());//Returns the Header Element "A", if Queue is empty it return Null
//I want return remove element from the Queue
System.out.println(pq.remove());// Remove the Head element from Queue 'A'
System.out.println(pq);
System.out.println(pq.poll()); //Remove the Head element from Queue 'B'
//Read all the elements from the Queue
Iterator it=pq.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	
	}

}
