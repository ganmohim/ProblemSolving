package anagramfinder;

public class TestAnagrams {
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		a.readWords();
		System.out.println("Is Anagram?" + a.isAnagrams());
	}

}
