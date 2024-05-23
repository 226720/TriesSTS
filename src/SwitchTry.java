import java.util.Scanner;

public class SwitchTry {
	public static int getNumber() {
		System.out.print("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1:
		//	System.out.println("One is selected");
		//	return 1;
			
		case 2:
			System.out.println("Two is selected");
			return 2;
		case 3:
			System.out.println("Three is selected");
			return 3;
		default:
			System.out.println("This is default");
		
		}
		return 0;
	}                              
public static void main(String[] args) {
	int result = getNumber();
	System.out.println(result);
}
}
