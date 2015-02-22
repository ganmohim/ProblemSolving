import java.util.Scanner;


public class Palindrome {
	
	public boolean isPalindrome(String str) {
		char[] charStr = str.toCharArray();
		int j = charStr.length - 1;
		
		for (int i = 0; i < charStr.length; i++) {
			if (charStr[i] != charStr[j]) {
				j--;
				return false;
			} // end of if
			
			else {
				j--;
			} // end of else
			
		} // end of for
		
		return true;
		
	} // end of isPalindrome()
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String input;
		do {
			System.out.println("Enter a string: ");
			Scanner scan = new Scanner(System.in);
			input = scan.next();
			System.out.println(input + " is palindrome? " + p.isPalindrome(input));
			
		} while (!input.equalsIgnoreCase("done"));
		
		System.out.println("Program is terminated...");
	}

} // end of Palindrome class
