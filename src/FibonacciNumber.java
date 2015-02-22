import java.math.BigDecimal;
import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args) {
    	int number;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number for fibonacci test: ");
            number = sc.nextInt();
            
            FibonacciNumber fn = new FibonacciNumber();
            System.out.println(number + " is fibonacci? " + fn.isFibonacci(number));
        } while (number != -1);
        
    }
    
    public boolean isFibonacci(int num) {
        if ( isPerfectSquare( (5 * num * num) + 4) ||
             isPerfectSquare( (5 * num * num) - 4) ) {
                 return true;
             }
        
        return false;
    }
    
    public boolean isPerfectSquare(int num) {
        boolean flag = false;
    	double s = Math.sqrt(num);
    	
        int i = (Double.compare(s*s, num));
    	
        return i == 0;
    }
}