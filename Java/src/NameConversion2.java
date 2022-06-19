import java.util.Scanner;

/* Program to convert lower case string to upper case string
 * Created by B MAHESH
 * Created on 23.12.2021
 */
public class NameConversion2 {

	public static void main(String[] args) {
		//Taking input from the end user
		System.out.println("Enter the name that you want to convert:");
		Scanner scan =new Scanner(System.in);
		//Scan the input and store it in the variable
		String input=scan.nextLine();
		//Printing the name before conversion
		System.out.println("String conversion before conversion  "+ input);
		//Converting string to Character array
		char name[]=input.toCharArray();
		//Finding the length of the character array
		int size=name.length;
		//Printing the length of the character array
		System.out.println("Length of the character array is "+ size);
		for(int i=0;i<size;i++) {
			//Here is the actual logic
			if(name[i]>='a'&&name[i]<='z') {
				char name11=(char)(name[i]-32);
				System.out.print(name11);
				
			}
			else {
				System.out.print(name[i]);
			}
						
		}
	
	

	}

}
