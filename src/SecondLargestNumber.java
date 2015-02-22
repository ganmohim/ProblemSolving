import java.util.*;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int a[] = {20, 0, 15, 7, 100, 90};
		
		SecondLargestNumber sln = new SecondLargestNumber();
		int indexOfLargest = sln.largest(a);
		int b[] = sln.revisedArray(a, indexOfLargest);
		int secondLargestIndex = sln.largest(b);
		
		System.out.println("Second largest is: " + b[secondLargestIndex]);
		
	}
	
	/**
	 * Returns the the index of the largest number
	 * 
	 * @param a is the array being passed on
	 * @return index of largest number
	 */
	public int largest(int[] a) {
		int i = 0;
		int largest = a[i];
		int j, l;
		l = 0;
		
		for (j = i+1; j < a.length; j++) {
			if (a[j] > largest) {
				largest = a[j];
				l = j;
			}
		}
		return l;
	}
	
	/**
	 * Populate the revised array which omits the first largest number
	 * 
	 * @param a is sent as original array
	 * @param index indicates the position of largest number
	 * @return the revised array which is one less the original array
	 */
	public int[] revisedArray(int a[], int index) {
		int[] b = new int[a.length-1];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == index)
				continue;
			else {
				b[j] = a[i];
				j++;
			}
		}
		return b;
	}

}
