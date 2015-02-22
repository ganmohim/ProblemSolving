import java.util.*;

public class StringReplace {

    public String correctUrl(String incorrectUrl, String searchString) {
        char[] charUrl     = new char[incorrectUrl.length()];
        char[] charSearch  = new char[searchString.length()];
        
        ArrayList<Character> updatedUrl = new ArrayList<Character>();
        
        charUrl    = incorrectUrl.toCharArray();
        charSearch = searchString.toCharArray();
        int count  = 0;
        
        for (int i = 0; i < charUrl.length; i++) {
            for (int j = 0; j < charSearch.length; j++) {
                if (charUrl[i] != charSearch[j]) {
                    updatedUrl.add(charUrl[i]);
                    break;
                    
                } // end of if     
                
                else {
                    i++;
                    
                }
            
            } // end of inner for
            
    
        } // end of for
        
        Character[] newUrl = new Character[updatedUrl.size()];
        newUrl = updatedUrl.toArray(newUrl);
        String urlstr = newUrl.toString();
        return urlstr;
    
    } // end of correctUrl()
    
    public static void main(String[] args) {
        StringReplace srObj = new StringReplace();
        
        String incorrectUrl = "www.amazon%20.com";
        String searchString = "%20";
        
        String correctUrl = srObj.correctUrl(incorrectUrl, searchString);
        
        System.out.println("Correct url is: " + correctUrl); 
        
       
        
    
    } // end of main
    
    
    
} // end of class