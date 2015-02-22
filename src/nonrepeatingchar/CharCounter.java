package nonrepeatingchar;

import java.util.*;

public class CharCounter {
	public static void main(String[] args) {
		System.out.println("Enter a line: ");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String line = "";
		
		Scanner s = new Scanner(input.toLowerCase());
		
		while (s.hasNext()) {
			line = line + s.next();
		}
		s.close();
		
		ArrayList<CharObj> charObj = new ArrayList<CharObj>();
		
		ArrayList<Character> allChar  = new ArrayList<Character>();
		ArrayList<Character> uniqChar = new ArrayList<Character>();
		
		char[] c = new char[line.length()];
		c = line.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (! uniqChar.contains((Character) c[i])) {
				uniqChar.add((Character) c[i]);
				charObj.add(new CharObj((Character) c[i]));
			}
			allChar.add((Character) c[i]);
		} // end of for
		
		CharCounter.nonRepeatedChars(charObj, allChar);
		
		
		
	} // end of main
	
	public static void nonRepeatedChars(
			ArrayList<CharObj> charObjList, ArrayList<Character> allChar) {
		CharObj[] uniqListChar = 
				new CharObj[charObjList.size()];
		uniqListChar = charObjList.toArray(uniqListChar);
		
		char[] arrayOfChars = new char[allChar.size()];
		int a=0;
		
		for (Character c : allChar) {
			arrayOfChars[a] = c;
			a++;
		}
				
		for (int i = 0; i < uniqListChar.length; i++) {
			for (int j = 0; j < arrayOfChars.length; j++) {
				if (uniqListChar[i].getChar().equals(arrayOfChars[j]))
					uniqListChar[i].increment();
			} // end of inner for
			
		} // end of outer for
		
		CharCounter.printNonRepChars(uniqListChar);
	} // end of method
	
	public static void printNonRepChars(CharObj[] charObjArray) {
		for (int i=0; i < charObjArray.length; i++) {
			if (charObjArray[i].getCount() == 1) {
				//System.out.println("First non-repeated char: " + charObjArray[i].getChar());
				System.out.println("Non-repeated chars: " + charObjArray[i].getChar());
				//break;
			}
		}
	}
	
	

}
