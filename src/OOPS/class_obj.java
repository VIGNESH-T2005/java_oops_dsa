// Class and Objects 

package OOPS;
import java.util.*;
public class class_obj {
	//attribute
	int srno ;
	String name;
	int age;
	//constructors intialize the attributes
	public class_obj(int srno , String name, int age ) {
		this.srno=srno;
		this.name=name;
		this.age=age;
	}
	//methods 
	public void details() {
		System.out.println(name + " " + age );
	}
	
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int srno=sc.nextInt();
		String name= sc.next();
		int age=sc.nextInt();
		class_obj objname = new class_obj(srno,name,age);
		System.out.println(objname.srno +" " +  objname.name + " " +objname.age);
		objname.details();
	}

}
