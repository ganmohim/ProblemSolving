package anagramfinder;

// Test line for git
// This line won't go to git
// Check in this line
// Don't check in this line

import java.util.*;

public class Anagrams {
	private String firstWord;
	private String secondWord;
	
	public void readWords() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first word: ");
		firstWord = sc.next();
		
		System.out.println("Enter second word: ");
		secondWord = sc.next();
	}
	
	public boolean isAnagrams() {
		char[] w1 = new char[firstWord.length()];
		char[] w2 = new char[secondWord.length()];
		
		w1 = firstWord.toCharArray();
		w2 = secondWord.toCharArray();
		
		sortCharArray(w1);
		sortCharArray(w2);
		
		String wordOne = new String(w1);
		String wordTwo = new String(w2);
		
		return wordOne.equalsIgnoreCase(wordTwo);
	}
	
	public void sortCharArray(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char tmp = c[j];
					c[j] = c[i];
					c[i] = tmp;
				}
			} // end of outer for
		} // end of outer for
	} // end of sortCharArray()

}
