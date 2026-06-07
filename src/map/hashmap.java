package map;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 90);
		map.put("Bob", 85);
		map.put("Alice", 95);   // overwrites previous value
		System.out.println(map.get("Alice"));  // 95
		System.out.println(map.containsKey("Bob"));  // true
	}

}
