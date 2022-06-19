import java.util.Scanner;

/*Program to find the number of Digits in a number
 Created by B MAHESH on 28.02.2022
 
 */
public class NumberOfDigitsInANumber {
	public static void main(String mahe[]) {
		System.out.println("Enter the number that you wish");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		do {
			
		int	quo=num/10;
		count=count+1;
		num=quo;
		}
		while(num>0);
		System.out.println(count);
	}

}
