import java.util.*;

public class PermutationDetector {

    public static boolean isPermutation(String firstStr, String secondStr ) {
        boolean flag = false;
        
        char[] firstCharArray  = new char[firstStr.length()];
        char[] secondCharArray = new char[secondStr.length()];
        
        firstCharArray  = firstStr.toCharArray();
        secondCharArray = secondStr.toCharArray();
        
        char[] firstSortedArray, secondSortedArray;
        
        firstSortedArray  = sortCharArray(firstCharArray);
        secondSortedArray = sortCharArray(secondCharArray);
        
        String strOne = new String(firstSortedArray);
        String strTwo = new String(secondCharArray);
        
        if (strOne.equals(strTwo))
            flag = true;
            
        return flag;
        
    }
    
    public static char[] sortCharArray(char[] arrayToSort) {
    
        for (int i=0; i < arrayToSort.length; i++) {
            for (int j=i+1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j] ) {
                    char temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = temp; 
                }
          
            } // end of for
        
        } // end of outer for 
        
        return arrayToSort;
        
    
    } // end of sortCharArray()
    
    public static void main(String[] args) {
        String firstStr, secondStr;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string: ");
        firstStr = sc.next();
        
        System.out.println("Enter second string: ");
        secondStr = sc.next();
        
        System.out.println(secondStr + " is permutation of " + firstStr + "?" + isPermutation(firstStr, secondStr));
        
        
    } // end of main
} // end of class