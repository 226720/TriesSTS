import java.util.Scanner;

public class Hello {

	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("your number is "+x);
		String y = sc.next();
		System.out.println("your string is "+y);
		System.out.println("Enter a String");
		String value = sc.next();
		String reverse = "";
		char character;
		for(int i=0; i<value.length(); i++) {
			character = value.charAt(i);
			reverse = character + reverse;
		}
		System.out.println("Reverse is "+ reverse);
		sc.close();
		
		
	}
}
