package methodss;
import java.util.*;
public class arg_only {
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		arg_only obj = new arg_only();
		obj.addition(a, b);
			
		
	}

}
