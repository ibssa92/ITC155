//simple version of the linked list class
//methods for add, isSorted, and toString
public class LinkedIntList {

	private ListNode front; // first value in the list

	// construct an empty list
	public LinkedIntList() {
		front = null;
	}

	// append a value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}

			current.next = new ListNode(value);
		}

	}
	
	//if null, returns true. while not null, if previous number is larger than 
	//current, return false. Or else, numbers increase so return true
	
	public boolean isSorted() {
	    if(front == null)
	        return true;
	        
	    ListNode prev = front;
	    ListNode current = prev.next;
	    
	    while(current != null) {
	        if(prev.data > current.data)
	            return false;
	            
	        prev = current;
	        current = prev.next;
	    }
	    
	    return true;
	}

	// return a comma seperated, bracketed version of the list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data; // fence post
			ListNode current = front.next;
			while (current != null) {
				result += " , " + current.data;
				current = current.next;
			}

			result += "]";
			return result;

		}

	}
	
}
