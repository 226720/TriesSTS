import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Fibanocci {
	
	public static void main(String args[]) throws Exception {
		
//		InputStreamReader reader = new InputStreamReader(System.in);
//		BufferedReader bf = new BufferedReader(reader);
//		System.out.println("Enter your name");
//		String name = bf.readLine();
//		System.out.println("Your name is "+ name);
		System.out.print(1);
		for(int i=0; i<10; i++) {
			int n=2;
			int m=0;
	    	 m=m+n;
			System.out.print(m);
	
		}
		System.out.println("Fibanocci series first 10 ");
	}

}
