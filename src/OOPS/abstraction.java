package OOPS;

abstract class vehicle{
	
	abstract void model();
}
class car extends vehicle{
	@Override
void model() {
		System.out.println("car sounds");
	}
}
class bike  extends vehicle{
	@Override 
void model() {
		System.out.println("bike  sounds");
	}
}


public class abstraction {
	public static void main(String[] args) {
	car obj=new car();
	obj.model();
	}

}	