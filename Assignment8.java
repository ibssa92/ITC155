
public class ArrayIntList {
	private int[] elementData;
	private int size;

	// constructor
	public ArrayIntList() {
		elementData = new int[100];
		size = 0;
	}

	// method adds element into array
	public void add(int value) {
		elementData[size] = value;
		size++;
	}

	// dispaly elements
	public void print() {
		if (size == 0) {
			System.out.println("[]");
		} else {
			System.out.print("[" + elementData[0]);
			for (int i = 1; i < size; i++) {
				System.out.print(", " + elementData[i]);
			}
				System.out.println("]");
			
		}
	}

	// replaces first parameter with second parameter
	public void replaceAll(int value, int replace) {
		{
			// loop repeats for entire array
			for (int i = 0; i < size; i++) {
				if (elementData[i] == value) {
					elementData[i] = replace;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList();
		list.add(34);
		list.add(27);
		list.add(13);
		list.add(27);
		list.add(51);
		
		list.print();
		
		list.replaceAll(27, 1);
		list.print();

	}

}
