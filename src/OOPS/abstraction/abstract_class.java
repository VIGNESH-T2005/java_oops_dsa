package OOPS.abstraction;

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


public class abstract_class{
	public static void main(String[] args) {
	vehicle obj=new car();
	obj.model();
	vehicle obj2=new bike();
	obj2.model();
	}

}	