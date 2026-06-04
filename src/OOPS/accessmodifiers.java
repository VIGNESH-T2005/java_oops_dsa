package OOPS;

class person{
	public String name;
	protected int age;
	//private int socialSecurityNumber;
	String address;
	person(){
		this.name="vicky";
		this.age=20;
		//this.socialSecurityNumber =3212;
		this.address="neyveli";
	}
}
class employee extends person{
	void access() {
		System.out.println(age);
		System.out.println(name);
		//System.out.println(socialSecurityNumber);
		System.out.println(address);
	}
}

public class accessmodifiers {
	public static void main(String[] args) {
		employee obj= new employee();
		obj.access();
	}
}





