import java.util.Scanner;

public class NameConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the name that you want to convert:");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		String rname=name.toUpperCase();
		System.out.println(rname);
		

	}

}
