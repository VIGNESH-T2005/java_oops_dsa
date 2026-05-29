package methodss;
import java.util.*;
public class no_arg_no_ret {
	public void addition() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		no_arg_no_ret obj = new no_arg_no_ret();
		obj.addition();
	}

	
}
