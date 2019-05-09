import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Midterm {

	public static void main(String[] args) {
		// write a method maxOccurrences that accepts a list of integers
		//as a parameter and returns the number of times the most frequently occurring
		//integer ("the mode") occurs in the list. Solve this problem using a MAP as
		// auxiliary storage. If the list is empty, return 0
		
		// list of integers
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(2);
		
		System.out.println(maxOccurrences(list));

	}

	public static int maxOccurrences(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Iterator<Integer> i = list.iterator();

		while (i.hasNext()) {
			int num = i.next();
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		Set<Integer> setKey = map.keySet();
		
		i = setKey.iterator();
		int max = 0;

		while (i.hasNext()) {
			int current = map.get(i.next());
			if (current > max) {
				max = current;
			}
		}

		return max;

	}

	/*
	 * PROBLEM 2 ----- mystery1 [2, 6, 1, 8] = [1, 2, 6, 8]
	 * 
	 * [30, 20, 10, 60, 50, 40] = [10, 30, 40, 20, 60, 50]
	 * 
	 * [-4, 16, 9, 1, 64, 25, 36, 4, 49] = [-4, 1, 25, 4, 16, 9, 64, 36, 49
	 * 
	 * 
	 * 
	 * 
	 * 
	 * PROBLEM 3 -- mystery3(6) = 6
	 * 
	 * mystery3(17) = 8
	 * 
	 * 
	 */

}
