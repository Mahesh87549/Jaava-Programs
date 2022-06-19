import java.util.Scanner;

/* Program to find the reverse of a string
 * Created by B MAHESH'
 * Created on 24.12.2021
 */
public class ReverseOfAString {

	public static void main(String[] args) {
	//Take the input from the user
		System.out.println("Enter the name that you want to convert:");
		Scanner scan=new Scanner(System.in);
		//Scanning the input from the user
		String input=scan.next();
		char name[]=input.toCharArray();
		
		//Finding the size of the string
		int size=name.length;
		char uname[]=new char[6];
		//System.out.println("The size of the string is"+ size);
		int j=size-1;
		for(int i=0;i<size;i++) {
			
			uname[i]=name[j];
			j--;
						
			
		}
		String str=new String(uname);
		System.out.println(str);
			}

}
