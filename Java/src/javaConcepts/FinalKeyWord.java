/* Sample program on importance of final keyword
 * Created by B MAHESH
 * Created on 01.01.2022
 */
/*Final is a keyword usually used infront of variable, methods and classes.
 * If a variable is declared as final it's value cannot be changed.
 * If a method is declared as final it's cannot be overridden.
 * If a class is declated as final then it cannot be extended.


*/
package javaConcepts;


public final  class FinalKeyWord {
	static final int  AGE=26;//AGE IS FIXED
		
	public static void main(String[] args) {
		System.out.println(AGE);
	}


}
