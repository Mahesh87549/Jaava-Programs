/*Program on Set Interface
 * Created by B MAHESH on 21.01.2022
 HashSet: Insertion order is not preserved, and Duplicates are not allowed in that case we use HashSet Object
 With the concept of q"Hash Code" elements will be inserted. There will be no index concept.
 Null element is also supported. When you have more number of search operations go with HashSet concept
 There is no special methods avaliable for HashSet
  */

package javaConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Keyword {
	public static void main(String[] args) {
		//Creating Object
		//Set s=new HashSet();
		HashSet s=new HashSet();
		//adding elements
		s.add("ABHIRAM REDDY");
		s.add("VINOD KUMAR");
		s.add("VASANTHA KOKILA");
		s.add("143");
		s.add(null);
		s.add('A');
		//Dispalying the all the elements
		System.out.println(s);//[143, null, VASANTHA KOKILA, A, VINOD KUMAR, ABHIRAM REDDY]
		//Printing the size of the Collection object
		System.out.println(s.size());//6
		//Removing an element
		s.remove("VINOD KUMAR");
		//Displaying the all the elements
		System.out.println(s);//[143, null, VASANTHA KOKILA, A, ABHIRAM REDDY]
		//Verifying the presence of element
	    System.out.println(s.contains("143"));//true
	    //Verifying the Emptiness
	    System.out.println(s.isEmpty());//false
	    //Reading element from the HashSet Object
	    for(Object e: s) {
	    	System.out.println(e);
	    	System.out.println("*********");
	    	
	    	}
	    Iterator it=s.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
	    }
    	//Addition of Two sets
    	HashSet s1=new HashSet();
    	s1.add("RAVI KIRAN");
    	s.addAll(s1);
    	//Printing the original Set
    	System.out.println(s);
    	//Set Intersection Operation
        s.retainAll(s1);
         System.out.println(s);
            
      
		
	}

}
