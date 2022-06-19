/* Program on Throws Keyword
 * Created by B MAHESH
 * Created on 03.01.2022
 * Throws keywors is used to declare Exceptions for caller Method. It gives an information 
 * to the caller method that there may  occur an exception so it is better for the caller method
 * to provide the exception handling code so that normal flow can be maintained. 
 * Throws keyword can be used for only "Checked Exceptions"
 */

package javaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public final class ThrowsKeyword {
	
	void readAndWrite() throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("d:/abc.text");
	}
	void writeAndRead() throws FileNotFoundException{
		FileOutputStream fos=new FileOutputStream("d:/abc.text");
	}
	public static void main(String[] args) {
		ThrowsKeyword thk=new ThrowsKeyword();
		try {
			thk.readAndWrite();

		}
		catch(Exception e) {
			System.out.println("Exception is handled sucessfully");
			System.out.println(e);
		}
		System.out.println("End of the program reached");
	}

	
	

}

