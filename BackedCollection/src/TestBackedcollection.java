import java.util.*;
public class TestBackedcollection {

	public static void main(String[] args) {
		Set<Integer> cset = new TreeSet<>();
		for(int i = 0; i <= 10; i++) {
			cset.add(i+20);
		}
		cset.forEach(System.out::println);
		SortedSet<Integer> hs = ((SortedSet<Integer>)cset).headSet(25);
		System.out.println(hs);
		SortedSet<Integer> ts = ((SortedSet<Integer>)cset).tailSet(25);
		System.out.println(ts);
		
		cset.add(15); // It will add to original tree set
		cset.add(36);
		System.out.println(hs);
		System.out.println(ts);
	}

}
