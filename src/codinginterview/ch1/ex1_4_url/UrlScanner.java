package codinginterview.ch1.ex1_4_url;

import java.util.*;

public class UrlScanner {

    public void updateUrl(String url) {
        char[] specialChars = {'%', '2', '0'};
        ArrayList<Character> charListUrl = new ArrayList<Character>();
        char[] charArrayUrl = url.toCharArray();
        
        for (int i = 0; i < charArrayUrl.length; i++) {
            if (charArrayUrl[i] == ' ') {
                for (int j = 0; j < specialChars.length; j++) {
                    charListUrl.add(specialChars[j]); 
                }
            
            } // end of if
            
            else {
                charListUrl.add(charArrayUrl[i]);
            } // end of else
            
        } // end of for
        
        
        for (Character c : charListUrl) {
            System.out.print(c);
        }
        
        
    
    }

}
