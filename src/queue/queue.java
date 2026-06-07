package queue;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		System.out.println(q.poll());   // First (removes)
		System.out.println(q.peek()); 
	}

}
