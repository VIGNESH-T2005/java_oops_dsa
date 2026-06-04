package OOPS.polymorphism;


class  vehicle{
	public void wheels() {
	      System.out.println("vehicle has wheels");
	}	
	public void wheels(int a) {
		System.out.println("car has " + a +" wheels" );	
	}
}

public class overloading {

	public static void main(String[] args) {
		vehicle obj=new vehicle();
		obj.wheels();
		obj.wheels(4);
	}

}
