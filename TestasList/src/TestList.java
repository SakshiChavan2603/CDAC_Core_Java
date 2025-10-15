import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TestList {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(12,13,45,65,22,10,78,32,34);
		
		// Sort the Array List
		Collections.sort(lst);
		System.out.println(lst);
		
		// Find Maximum & Minimum
		System.out.println(Collections.max(lst));
		System.out.println(Collections.min(lst));
		
		// Shuffle the Array
		Collections.shuffle(lst);
		System.out.println(lst);
		
		// Map
		Map<Integer, String> map = Map.of(1, "A", 2, "B", 3, "C", 4, "D");
		System.out.println(map);
		
	}

}
