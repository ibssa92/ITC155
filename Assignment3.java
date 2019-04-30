import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// create an list of integers to test the method
		List<Integer> list = new LinkedList<>();

		// populate the list
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		
		System.out.println(countUnique(list));

	}

	public static int countUnique(List<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>(list);
		return set.size();
	}

}
