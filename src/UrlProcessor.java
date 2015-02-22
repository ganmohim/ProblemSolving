
import java.util.*;

public class UrlProcessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter url: ");
		String url = sc.nextLine();
		String str = "%20";
		
		ArrayList<Character> updatedUrl = UrlProcessor.processUrl(url, str);
		
		for (Character c : updatedUrl) {
			System.out.print(c);
		}
		
	}
	
	public static ArrayList<Character> processUrl(String url, String str) {
		char[] c = new char[str.length()];
		c = str.toCharArray();
		
		char[] urlChar = new char[url.length()];
		urlChar = url.toCharArray();
		
		int counter;
		ArrayList<Character> fixedUrl = new ArrayList<Character>();
		
		for (int i = 0; i < urlChar.length; i++) {
			counter = 0;
			for (int j = 0; j < c.length; j++) {
				if (urlChar[i] == c[j]) {
					i++;
					counter++;
					if (counter == 3)
						i--;
				} // end of outer if
				
				else {
					fixedUrl.add(urlChar[i]);
					break;
				} // end of else
			} // end of inner for
		} // end of outer for
		
		return fixedUrl;
	} // end of processUrl()

}
