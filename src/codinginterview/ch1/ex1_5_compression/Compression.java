package codinginterview.ch1.ex1_5_compression;

import java.util.*;

public class Compression {

    public String compressString(String strToCompress) {
        ArrayList<Character> listOfChar = new ArrayList<Character>();
        int counter = 0;
        char[] charArray = new char[strToCompress.length()];
        charArray = strToCompress.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
        
            listOfChar.add(charArray[i]);
            counter = 1;
            
            // bug fix for value like this (abc) --> (i != charArray.length - 1)
            while ((i != charArray.length - 1) && (charArray[i] == charArray[i+1]) ) {
                counter++; // 2
                i++; //6, 7
                
                if (i == charArray.length - 1) // bug fix = array out of bound
                    break;
            }
            
            // Following lines converts from integer to Character (counter value)
            String n = Integer.toString(counter);
            listOfChar.add(n.charAt(0));
            
        
        } //end of for
        
        
        String strCompressesd = "";
        for (Character c : listOfChar) {
        	strCompressesd = strCompressesd + c;
        }
        
        // This logic kicks when after compression the string equal or larger
        // than the string that was provided to compress
        // abc = a1b1c1 --> After compression string is larger than original
        // abbccc = a1b2c3 --> After compression the size is same before compression
        if (strCompressesd.length() >=  strToCompress.length())
            return strToCompress;
        
        return strCompressesd;
    
    }    
    
    
} // end of Compression
