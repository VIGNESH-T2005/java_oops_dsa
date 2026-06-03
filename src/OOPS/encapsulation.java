package OOPS;
import java.util.*;
public class encapsulation {
	private int age;
	
	public int getAge() {
		
		return age;
	}
	public void setAge(int num) {
		if(num>0 && num<=100) this.age=num;
		else System.out.println("Enter valid age");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		encapsulation obj = new encapsulation();
		obj.setAge(num);
		int c=obj.getAge();
		System.out.println(c);
	
	}

}
