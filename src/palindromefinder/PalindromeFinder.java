package palindromefinder;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class PalindromeFinder {
	
	public boolean isPalindrome(String str) {
		char c[] = str.toCharArray();
		int j = str.length() - 1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != c[j])
				return false;
			else
				j--;
		}
		return true;
	} // end of isPlaindrome()
	
	public void printArray(ArrayList<String> str) {
		String[] strArray = str.toArray(new String[0]);
		for (String s : strArray)
			System.out.print(s + " ");
		
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> p  = new ArrayList<String> ();
		ArrayList<String> np = new ArrayList<String> ();
		String token;
		
		PalindromeFinder pf = new PalindromeFinder();
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(line);
		
		while (st.hasMoreTokens()) {
			token = st.nextToken(); // it was written as next()
			
			if (pf.isPalindrome(token)) {
				p.add(token);
			} // end of if
			
			else {
				np.add(token);
			} // end of else
		} // end of while
		
		pf.printArray(p);
		pf.printArray(np);
			
		
		
		
		
	} // end of main()
	
	
} // end of PalindromeFinder
