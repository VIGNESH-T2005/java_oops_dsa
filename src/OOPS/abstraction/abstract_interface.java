package OOPS.abstraction;

interface greetings{
	abstract void greet();
	default void hello() {
		System.out.println("hi");
	}
}
class english implements greetings{
	@Override
	public void greet(){
		System.out.println("hello");
	}
}
class tamil implements greetings {
	@Override
	public void greet() {
		System.out.println("vanakkam");
	}
}
public class abstract_interface {

	public static void main(String[] args) {
		greetings obj=new english();
		greetings obj2=new tamil();
		obj.greet();
		obj2.greet();
	}

}
