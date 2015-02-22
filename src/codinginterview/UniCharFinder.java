package codinginterview;
import java.util.*;

public class UniCharFinder {

    public boolean uniCharDetector(char[] charArray) {
        
        boolean value = true;
        
        ArrayList<Character> charArrayList = new ArrayList<Character>();
        
        
        for(int i=0; i < charArray.length; i++) {
            if ( ! charArrayList.contains(charArray[i])) {
                charArrayList.add(charArray[i]);
                
             }
             
             else {
                 return false;
             }
                
        }
        
        return value;
    
        
    } // loadChar()
    
    public static void main(String[] args) {
        
        UniCharFinder uc = new UniCharFinder();
        
        System.out.println("Enter a line: ");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[^a-zA-Z]+");
        
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String strWihthoutSpace = str.replaceAll("\\s", "");
            
            if (strWihthoutSpace.equals("done"))
                break; // exit path
                
            else {
                char[] c = new char[strWihthoutSpace.length()];
                c = strWihthoutSpace.toCharArray();
                
                System.out.println(str + "-->" + " has all unique char? " + uc.uniCharDetector(c));
                
            }
        
        } // end of while
    
    } // end of main()
} // end of UniCharFinder class
