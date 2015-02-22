import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class WordCounter {
    
    public void wordCounter(ArrayList<String> wordList, ArrayList<String> entireList) {
        String[] wordArray   = new String[wordList.size()];
        String[] entireArray = new String[entireList.size()];
        
        wordArray   = wordList.toArray(wordArray);
        entireArray = entireList.toArray(entireArray);
        
        int counter;
        for (int i = 0; i < wordArray.length; i++) {
            counter = 0; // counter resets here
            for (int j = 0; j < entireArray.length; j++) {
                if (wordArray[i].compareTo(entireArray[j]) == 0) {
                    counter++;
                }
                
            } // end of inner for
            System.out.println(wordArray[i] + ": " + counter); 
        } // end of outer for
        
    
    } // end of wordCounter
    
    
    
    public static void main(String[] args) throws IOException {
    	//File dir = new File(".");
    	//File fin = new File(dir.getCanonicalPath() + File.separator + "test.txt");
    	
    	FileReader fr = new FileReader("test.txt");
        Scanner in = new Scanner(fr); // use the following as delimiter (, . )
        //in.useDelimiter("[^a-zA-Z]+");
        in.useDelimiter("[,; \\.]+");
         
        ArrayList<String> wordList   = new ArrayList<String> ();
        ArrayList<String> entireList = new ArrayList<String> (); 
        
        // loads all words into the array list
        while (in.hasNext()) {
            String word = in.next();
            
            entireList.add(word); // load all words
            
            if (! wordList.contains(word)) // only unique words are built
                wordList.add(word);
        } // end of while
        
        WordCounter wc = new WordCounter();
        wc.wordCounter(wordList, entireList);
        
    } // end of main
    
} // end of WordCounter class