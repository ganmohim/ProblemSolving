package sortparallel;

public class MergeIntegerArrays {
	public static void main(String[] args) {
		int[] a = {21, 28, 35, 40, 61, 75};
		int[] b = {16, 25, 47, 54};
		int[] c = new int[a.length + b.length];
		
		int size = merge(a, a.length, b, b.length, c);
		
		for (int i = 0; i < size; i++) {
			System.out.print(c[i] + " ");
		}
		
		
	}
	
	public static int merge(int[] a, int m, int[] b, int n, int[] c) {
		int i = 0;
		int j = 0;
		int k = -1;
		
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				c[++k] = a[i++];
			} // end of if
			
			else {
				c[++k] = b[j++];
			} // end of else
				
		} // end of while
		
		if (i == m) {
			for ( ; j < n; j++) {
				c[++k] = b[j];
			}
		}
		
		else {
			for ( ; i < m; i++) {
				c[++k] = a[i];
			}
		}
		
		return m + n;
	}

}
