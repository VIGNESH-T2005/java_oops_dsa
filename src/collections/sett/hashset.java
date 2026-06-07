package collections.sett;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Dog");
		set.add("Cat");
		set.add("Dog");   // ignored silently
		System.out.println(set.size());
	}

}
