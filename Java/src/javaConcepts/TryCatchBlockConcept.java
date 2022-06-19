/* Program on Exception handling with try and catch
 * Created by B MAHESH
 * Created on 02.01.2022
 */

package javaConcepts;

public final class TryCatchBlockConcept {
	
	public final static void main(String[] args) {
		int a=100, b=0, result;
		try {
		result=a/b;
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

}}
