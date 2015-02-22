/**
 * input : I am heree to stay.You can ga noww.
 * output: I am here to stay.You can go now.
 * 
 * The incorrect version is provied is FileWrite in line 80
 * The correct version is read from sentence-corrected.txt
 * 
 * 
 * @author swordFish
 *
 */

import java.util.*;
import java.io.*;

public class WordCorrection {
	
	public static void compareFunction(ArrayList<String>wordList, 
			ArrayList<String> correctedWordList,
			ArrayList<String> reviewedSentenceList ) {
		
		String[] wordListArray    = new String[wordList.size()];
		String[] correctedWordListArray = new String[correctedWordList.size()];
		
		wordListArray = wordList.toArray(wordListArray);
		correctedWordListArray = correctedWordList.toArray(correctedWordListArray);
		
		for (int i = 0; i < wordListArray.length; i++) {
			for (int j = 0; j < correctedWordListArray.length; j++) {
				
				if (match(wordListArray[i], correctedWordListArray[j]) == 50) {
					reviewedSentenceList.add(correctedWordListArray[i]);
					
					if (wordListArray[i].compareTo(correctedWordListArray[j]) != 0)
						System.out.println(wordListArray[i]);
					
					break;
				}
				else if(match(wordListArray[i], correctedWordListArray[j]) == 100) {
					reviewedSentenceList.add(correctedWordListArray[j]);
					break;
				}
				
			}
		}
		
	} // end of compareFunction()
	
	// match factor ranks the match
	public static int match(String str1, String str2) {
		char[] c1 = new char[str1.length()];
		char[] c2 = new char[str2.length()];
		
		c1 = str1.toCharArray();
		c2 = str2.toCharArray();
		
		int i, j=0; int matchFactor = 0;
		
		for (i = 0; i < c1.length; i++) {
			if (j < c2.length) {
				if (c1[i] == c2[j]) {
					j++;
					matchFactor++;
					
					if (matchFactor == (c2.length/2) ) {
						if ( (c1[0] == c2[0]) || c1[c1.length-1] == c2[c2.length-1])
							return 50; // a word is 50% match
						else 
							return matchFactor;
					}
					else if (matchFactor == c2.length)
						return 100; // a word is a 100% match
				} // end of if
				
				else {
					j++;
				}
					
			} // end of if
	 	} // end of for
		
		return matchFactor;
		
	}
		
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> wordList          = new ArrayList<String>();
		
		FileWriter fw = new FileWriter("sentence.txt");
		fw.write("I am heree to stay.You can ga nowe.");
		fw.close(); // file should always be closed
		
		FileReader fr = new FileReader("sentence.txt");
		
		Scanner sc = new Scanner(fr);
		sc.useDelimiter("[. ]+");
		
		while (sc.hasNext()) {
			String word = sc.next();
			wordList.add(word); // loading all words
			
		} // end of while
		sc.close();
		
		ArrayList<String> correctedWordList = new ArrayList<String>(); 
		FileReader frc = new FileReader("sentence-corrected.txt");
		Scanner scan = new Scanner(frc);
		scan.useDelimiter("[. ]+");
		
		while (scan.hasNext()) {
			String wordCorrected = scan.next();
			correctedWordList.add(wordCorrected);
		}
		scan.close();
		
		ArrayList<String> reviewedSentenceList = new ArrayList<String>();
		
		compareFunction(wordList, correctedWordList, reviewedSentenceList);
		
		System.out.println(reviewedSentenceList);
		
	}
}
