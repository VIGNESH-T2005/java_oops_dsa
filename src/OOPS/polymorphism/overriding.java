package OOPS.polymorphism;

class animal{
	void eat() {
		System.out.println("animal is eating");
	}
}
class dog extends animal{
	void eat(){
		System.out.println("dog is eating");
	}
}
public class overriding {

	public static void main(String[] args) {
		animal obj = new animal();
		obj.eat();
		dog obj2 = new dog();
		obj2.eat();
		
		

	}

}
