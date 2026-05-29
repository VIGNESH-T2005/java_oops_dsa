package methodss;
import java.util.*;
public class ret_only {
	public int addition() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		ret_only obj = new ret_only();
		int c=obj.addition();
		System.out.println(c);
	}

}
