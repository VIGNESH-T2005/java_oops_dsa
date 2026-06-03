package OOPS;

class book{
	String name;
	book(String name) {
		this.name=name;
	}
	void bookname() {
		System.out.println("the name of book is"+ name);
	}
}
class child extends book {
	child(String name){
		super(name);
	}
	@Override
	void bookname(){
		System.out.println("the book is "+ name);
		}
}

public class inheritance {

	public static void main(String[] args) {
		book obj = new book(" focus on what matters");
		obj.bookname();
		book obj2= new child("ppa");
		obj2.bookname();

	}

}
