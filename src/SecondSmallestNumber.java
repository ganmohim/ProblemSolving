
public class SecondSmallestNumber {
	
	public int findSmallest(int[] a) {
		int smallest = a[0];
		int index = -1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					if (smallest > a[j]) {
						smallest = a[j];
						index = j;
					} // end of inner if
				} // end of outer if
			} // end of inner for
		} // end of outer for
		
		return index;
	}
	
	public static void main(String[] args) {
		//int a[] = {11, 0, 12, 3, 100};
		int a[] = {11, 0, 12, -7, 3, 100, -9};
		SecondSmallestNumber sn = new SecondSmallestNumber();
		int index = sn.findSmallest(a);
		
		int b[] = new int[a.length - 1];
		int j = 0;
		
		// copying the array by excluding the first smallest number
		for (int i = 0; i < a.length; i++) {
			if (index != i) {
				b[j] = a[i];
				j++;
			} // end of if
		} // end of for
		
		int index2 = sn.findSmallest(b);
		System.out.println("2nd smallest number is: " + b[index2]);
		
	} // end of main

} // end of second smallest number
