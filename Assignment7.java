
public class Assignment7 {

public static void main(String[] args) {
		//test from main
		//THIS ALGORITHM RUNS AT THE SAME SPEED
		int [] numbers = {55, 32, 63, 11, 9, 49, 33, 90, 71, 21};
		
		selectionSort(numbers);
		
		for(int i = 0; i < numbers.length; i++) 
	    {
	      System.out.print(numbers[i] + " ");
	    }
		

	}
	
	
	public static void selectionSort(int[] a) {
		// find the index of the largest element in the arrays
		for (int i = a.length - 1; i > 0; i--) {
			int largest = i;
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[largest]){
					largest = j;
				}
			}
			
		// place the largest to the back
			
			swap(a, i, largest); 
			
		}
		
	}
	
	// swap a[i] with a[j]
	
	public static void swap(int[] a, int i, int j) {
		if(i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}
			
	}
	
	


}