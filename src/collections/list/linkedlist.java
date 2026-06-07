package collections.list;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.addFirst(5);   // adds at front
		ll.addLast(20);   // adds at end
		ll.removeFirst();
		System.out.println(ll);
	}

}
