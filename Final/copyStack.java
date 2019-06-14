import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1.) O(N^2)

public class copyStack {

	public static void main(String[] args) {
	
	}

	public static Stack<Integer> copyStack(Stack<Integer> s) {
		Stack<Integer> copy = new Stack<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();

		while (!s.isEmpty()) {
			copy.push(s.pop());
		}

		while (!copy.isEmpty()) {
			int num = copy.pop();
			q.add(num);
			s.push(num);
		}

		while (!q.isEmpty()) {
			copy.push(q.remove());
		}

		return copy;
	}
}
