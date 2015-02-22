public class UrlProcessing {
    public static void main(String[] args) {
        String input           = "www.space%20.com";
        String stringToReplace = "%20";
        
        char[] charArray      = input.toCharArray(); // break string into char array 
        char[] charsToReplace  = stringToReplace.toCharArray();
        UrlProcessing up = new UrlProcessing();
        int startIndex   = up.findPatternStartIndex(charArray, charsToReplace);
        char[] p         = up.processUrl(charArray, charsToReplace.length, startIndex);
        
        String revisedString = new String(p);
        
        System.out.println(revisedString);
        
        
    }
    
    
    public char[] processUrl(char[] charArray, int lenghOfCharsToReplace, int startIndex) {
        char[] p = new char[charArray.length - 2];
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (i == startIndex) {
                p[j] = ' '; // start index replaced with space
                j++;
                i = i + (lenghOfCharsToReplace - 1);
            }
            
            else {
                p[j] = charArray[i];
                j++;
            }
        }
        
        return p;
    }
    
    public int findPatternStartIndex(char[] charArray, char[] charsToReplace) {
        
        int startIndex = -1;
        
        
        for (int i = 0; i < charArray.length; i++) {
            
            for (int j = 0; j < charsToReplace.length; j++) {
                if (charArray[i] == charsToReplace[j]) {
                    i++;
                    if (j == 2) {
                        startIndex = (i - (charsToReplace.length));
                        return startIndex;
                    }
                }
                
                else {
                    
                }
            }
            
            
            
        }
        return startIndex;
    }
        
        
}
    